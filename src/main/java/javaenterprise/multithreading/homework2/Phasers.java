package javaenterprise.multithreading.homework2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Phaser;

public class Phasers implements SquareSum {

    @Override
    public long getSquareSum(int[] values, int numberOfThreads) {
        final Phaser phaser = new Phaser();
        List<Long> results = new ArrayList<>();
        long result = 0;

        if (values.length == 0)
            return result;

        int range = values.length / numberOfThreads;
        for (int i = 0; i < values.length; i+= range) {
            phaser.register();
            final int finalI = i;
            int last = finalI + range;
            new Thread() {
                @Override
                public void run() {
                    long result = 0;
                    for (int i = finalI; i < last; i++) {
                        result += values[i] * values[i];
                    }
                    System.out.println(Thread.currentThread().getName() + " " + result);
                    results.add(result);
                    phaser.arriveAndAwaitAdvance();
                }
            }.start();
        }
        phaser.arriveAndDeregister();

        for (Long value : results) {
            result += value;
        }



        return result;
    }
}