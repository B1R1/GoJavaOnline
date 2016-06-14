package javaenterprise.multithreading.homework2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Executors implements SquareSum {

    @Override
    public long getSquareSum(int[] values, int numberOfThreads) {
        final ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(numberOfThreads);
        List<Callable<Long>> callables = new ArrayList<>();
        List<Future<Long>> list = null;
        long result = 0;

        if (values.length == 0)
            return result;

        int range = values.length / numberOfThreads;
        for (int i = 0; i < values.length; i+= range) {
            final int finalI = i;
            int last = finalI + range;
            callables.add(() -> {
                long threadResult = 0;
                for (int k = finalI; k < last; k++) {
                    threadResult += values[k] * values[k];
                }
                System.out.println(Thread.currentThread().getName() + " " + threadResult);
                return threadResult;
            });
        }

        try {
            list = executor.invokeAll(callables);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (list != null) {
            for (Future value: list){
                try {
                    result+= (long) value.get();
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            }
        } else return 0;

        executor.shutdown();

        return result;
    }
}