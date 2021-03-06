package javaenterprise.generics.homework.api;

import javaenterprise.generics.homework.api.Executor;
import javaenterprise.generics.homework.api.Task;
import javaenterprise.generics.homework.api.Validator;

import java.util.ArrayList;
import java.util.List;

public class SerialExecutor<T> implements Executor<T> {

    private static final Validator<Object> DEFAULT_VALIDATOR = value  -> true;

    private List<TaskAndValidator<T>> tasks = new ArrayList<>();
    private List<T> validResults = new ArrayList<>();
    private List<T> invalidResults = new ArrayList<>();

    private boolean executed = false;

    @Override
    public void addTask(Task<? extends T> task) {
        addTask(task, DEFAULT_VALIDATOR);
    }

    @Override
    public void addTask(Task<? extends T> task, Validator<? super T> validator) {
        checkNotExecuted();
        tasks.add(new TaskAndValidator<T>(task, validator));
    }

    @Override
    public void execute() {
        checkNotExecuted();
        for (TaskAndValidator<T> taskAndValidator : tasks) {
            Task<? extends T> task = taskAndValidator.task;
            task.execute();
            if(taskAndValidator.validator.isValid(task.getResult())){
                validResults.add(task.getResult());
            } else {
                invalidResults.add(task.getResult());
            }
        }
        executed = true;
    }

    private void checkNotExecuted() {
        if (executed){
            throw new IllegalStateException("Executor already executed");
        }
    }
    private void checkExecuted() {
        if (!executed){
            throw new IllegalStateException("Executor already executed");
        }
    }

    @Override
    public List getValidResults() {
        checkExecuted();
        return validResults;
    }

    @Override
    public List getInvalidResults() {
        checkExecuted();
        return invalidResults;
    }



    private static class TaskAndValidator<T>{
        private Task<? extends T> task;
        private Validator<? super T> validator;

        public TaskAndValidator(Task<? extends T> task, Validator<? super T> validator) {
            this.task = task;
            this.validator = validator;
        }
    }
}
