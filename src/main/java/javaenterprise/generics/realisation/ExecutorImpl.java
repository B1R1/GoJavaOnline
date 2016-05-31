package javaenterprise.generics.realisation;

import javaenterprise.generics.framework.Executor;
import javaenterprise.generics.framework.Task;
import javaenterprise.generics.framework.Validator;

import java.util.ArrayList;
import java.util.List;

public class ExecutorImpl<Number> implements Executor<Number> {
    List<Task> tasks = new ArrayList<>();
    List<Task> validTasks = new ArrayList<>();
    List<Task> invalidTasks = new ArrayList<>();

    @Override
    public void addTask(Task task) {
        tasks.add(task);
    }

    @Override
    public void addTask(Task task, Validator validator) {
        if(validator.isValid(task)) validTasks.add(task);
        else invalidTasks.add(task);
    }

    @Override
    public void execute() {
        for (Task t : tasks) {
            t.execute();
        }
    }

    @Override
    public List getValidResults() {
       List<Task> results = new ArrayList<>();
       Validator v = new NumberValidator<>();
       for (Task t : tasks) {
            if (v.isValid(t)){
                results.add(t);
            }
        }
        return results;
    }

    @Override
    public List getInvalidResults() {
        List<Task> results = new ArrayList<>();
        Validator v = new NumberValidator<>();
        for (Task t : tasks) {
            if (!v.isValid(t)){
                results.add(t);
            }
        }
        return results;
    }
}

