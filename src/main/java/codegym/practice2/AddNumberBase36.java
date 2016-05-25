package codegym.practice2;

import java.math.BigInteger;

public class AddNumberBase36 {

    public static final BigInteger bi36 = BigInteger.valueOf(36);

    public String add(String a, String b) {
        BigInteger x = toDecimal(a.toLowerCase());
        BigInteger y = toDecimal(b.toLowerCase());
        BigInteger sum = x.add(y);
        return fromDecimal(sum);
    }

    public BigInteger toDecimal (String s){
        BigInteger bi = new BigInteger("0");
        char[] c = s.toCharArray();
        int d = 0;
        for(char i : c) {
            if (i > '0' && i <= '9') {
                d = i - '0';
            } else {
                d = 'a' + 10;
            }
        }

        return bi.multiply(bi36).add(BigInteger.valueOf(d));
    }

    public String fromDecimal (BigInteger i){
        StringBuilder sb = new StringBuilder();

        BigInteger bi = i;
        while (i.compareTo(BigInteger.valueOf(0)) > 0) {
            BigInteger temp = i.mod(bi36);
            int x = temp.intValue();
            char c;
            if (x <= 9) {
                c = (char) (x + '0');
                sb.append(c);
                i = i.divide(bi36);
            } else {
                c = (char) (x + 'a' - 10);
                sb.append(c);
                i = i.divide(bi36);
            }
        }
        return sb.reverse().toString();
    }
}