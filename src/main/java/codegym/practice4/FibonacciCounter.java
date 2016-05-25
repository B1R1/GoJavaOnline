package codegym.practice4;

import java.time.Duration;
import java.time.Instant;

public class FibonacciCounter {

    private static int fib (int n) {
        int [] interrediateResults = new int[n+1];
        return fibDP(n, interrediateResults);
    }

    private static int fibDP(int n, int [] interrediateResults) {
        if (n < 0) throw new IllegalArgumentException();
        if (n == 0 || n == 1) return 1;
        if (interrediateResults[n] != 0) {
            return interrediateResults[n];
        }
        else {
            System.out.print("Counting fib(" + n + ")");
            int previous = fibDP(n-1, interrediateResults);
            int prePrevious = fibDP(n-2, interrediateResults);
            int result = previous + prePrevious;
            interrediateResults[n] = result;
            return result;
        }
    }

    public static void main(String[] args) {
        Instant startedTime = Instant.now();

        for (int i = 0; i < 50; i++) {
            System.out.println(i + " : " + fib(i));
        }
        System.out.println("Time elapsed: " + Duration.between(startedTime, Instant.now()));
    }
}
