package codegym.practice2;

import java.math.BigInteger;

public class AverageNumber {
    public int average(int a, int b) {
        BigInteger result = BigInteger.valueOf(0);
        if (a == b) return a;

        if (a < Integer.MAX_VALUE/2 &&
                b < Integer.MAX_VALUE/2 &&
                a > Integer.MIN_VALUE/2 &&
                b > Integer.MIN_VALUE/2)
            return (a+b) /2;

        else  if (a < 0 && b < 0) {
            result = result.add(BigInteger.valueOf(a/2));
            result = result.add(BigInteger.valueOf(b/2));
        }

        return result.intValue();
    }
}
