package javaenterprise.generics;

import java.util.List;

public interface Executor {

    // Добавить таск на выполнение. Результат таска будет доступен через метод getValidResults().
    // Бросает Эксепшн если уже был вызван метод execute()
    void addTask(Task task);

    // Добавить таск на выполнение и валидатор результата. Результат таска будет записан в ValidResults если validator.isValid вернет true для этого результата
    // Результат таска будет записан в InvalidResults если validator.isValid вернет false для этого результата
    // Бросает Эксепшн если уже был вызван метод execute()
    void addTask(Task task, Validator validator);

    // Выполнить все добавленые таски
    void execute();

    // Получить валидные результаты. Бросает Эксепшн если не был вызван метод execute()
    List getValidResults();

    // Получить невалидные результаты. Бросает Эксепшн если не был вызван метод execute()
    List getInvalidResults();



//    @test
//    public void test(List<Task<Integer>> intTasks) {
//        Executor<Number> numberExecutor = new ExecutorImpl<>();
//
//        for (Task<Integer> intTask : intTasks) {
//            numberExecutor.addTask(intTask);
//        }
//        numberExecutor.addTask(new LongTask(10L), new NumberValidator());
//
//        numberExecutor.execute();
//
//        System.out.println("Valid results:");
//        for (Number number : numberExecutor.getValidResults()) {
//            System.out.println(number);
//        }
//        System.out.println("Invalid results:");
//        for (Number number : numberExecutor.getInvalidResults()) {
//            System.out.println(number);
//        }
    }
//}
