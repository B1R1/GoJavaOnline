//package javaenterprise.generics;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public interface Executor<Object>  {
//    List<Task> tasks = new ArrayList<>();
//
//    // Добавить таск на выполнение. Результат таска будет доступен через метод getValidResults().
//    // Бросает Эксепшн если уже был вызван метод execute()
//    static void addTask(Task task) {
//        tasks.add(task);
//    }
//
//    // Добавить таск на выполнение и валидатор результата. Результат таска будет записан в ValidResults если validator.isValid вернет true для этого результата
//    // Результат таска будет записан в InvalidResults если validator.isValid вернет false для этого результата
//    // Бросает Эксепшн если уже был вызван метод execute()
//    static void addTask(Task task, Validator validator) {
////        Object result = task.execute();
////        validator.isValid(result);
//    }
//
//
//    // Выполнить все добавленые таски
//    static void execute() {
//
//    }
//
//
//    // Получить валидные результаты. Бросает Эксепшн если не был вызван метод execute()
//    List getValidResults();
//
//    // Получить невалидные результаты. Бросает Эксепшн если не был вызван метод execute()
//    List getInvalidResults();
//
//    class ExecutorImpl implements Executor<Task> {
//
//        public void test(List<Task<Integer>> intTasks) {
//            Executor<Number> numberExecutor = new ExecutorImpl<>();
//
//            for (Task<Integer> intTask : intTasks) {
//                numberExecutor.addTask(intTask);
//            }
//            numberExecutor.addTask(new LongTask(10L), new NumberValidator());
//
//            numberExecutor.execute();
//
//            System.out.println("Valid results:");
//            for (Number number : numberExecutor.getValidResults()) {
//                System.out.println(number);
//            }
//            System.out.println("Invalid results:");
//            for (Number number : numberExecutor.getInvalidResults()) {
//                System.out.println(number);
//            }
//        }
//
//        @Override
//        public List getValidResults() {
//            return null;
//        }
//
//        @Override
//        public List getInvalidResults() {
//            return null;
//        }
//    }
//}
//
//
