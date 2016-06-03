package javaenterprise.generics.homework.impl;

import javaenterprise.generics.homework.api.Executor;
import javaenterprise.generics.homework.api.Task;
import javaenterprise.generics.homework.api.Validator;

import java.util.ArrayList;
import java.util.List;

public class ExecutorImpl implements Executor<Number> {
      static List<Task<Float>> list = new ArrayList<>();
//    List<Long> validTasks = new ArrayList<>();
//    List<Long> invalidTasks = new ArrayList<>();

//    List<Task<Integer>> intTasks = new ArrayList<>();

//    public static void main(String[] args) {
//        list.add((Task<Float>) list);
//
//        ExecutorImpl executor = new ExecutorImpl();
//        executor.test0(list);

//    }

    public void test0 (List<Task<Float>> tasks) {
        Executor<Number> executor = new ExecutorImpl();
        for (Task<Float> i : tasks) {
            executor.addTask(i);
        }

    }

    public void test(List<Task<Integer>> intTasks) {
        Executor<Number> numberExecutor = new ExecutorImpl();

        for (Task<Integer> intTask : intTasks) {
            numberExecutor.addTask(intTask);
        }
        numberExecutor.addTask(new LongTask(10L), new NumberValidator());

        numberExecutor.execute();

        System.out.println("Valid results:");
        for (Number number : numberExecutor.getValidResults()) {
            System.out.println(number);
        }
        System.out.println("Invalid results:");
        for (Number number : numberExecutor.getInvalidResults()) {
            System.out.println(number);
        }
    }

    @Override
    public void addTask(Task<? extends Number> task) {

    }

    @Override
    public void addTask(Task<? extends Number> task, Validator<? super Number> validator) {

    }

    @Override
    public void execute() {

    }

    @Override
    public List<Number> getValidResults() {
        return null;
    }

    @Override
    public List<Number> getInvalidResults() {
        return null;
    }
}


//    @Override
//    public void addTask(Task<Long> task) {
//        tasks.add(task);
//    }
//
//    @Override
//    public void addTask(Task<? extends Number> task, Validator<? super Number> validator) {
//        if(validator.isValid(task)) validTasks.add(task);
//        else invalidTasks.add(task);
//    }
//
//    @Override
//    public void execute() {
//        for (Task t : tasks) {
//            t.execute();
//        }
//    }
//
//    @Override
//    public List<Long> getValidResults() {
//       List<Long> results = new ArrayList<>();
//       Validator<Number> v = new NumberValidator<>();
//       for (Task t : tasks) {
//            if (v.isValid(t)){
//                results.add(t);
//            }
//        }
//        return results;
//    }
//
//    @Override
//    public List<Long> getInvalidResults() {
//        List<Long> results = new ArrayList<>();
//        Validator<Number> v = new NumberValidator<>();
//        for (Task t : tasks) {
//            if (!v.isValid(t)){
//                results.add(t);
//            }
//        }
//        return results;
//    }


