package codegym.practice2;

/* Дано число. Нужно заменить i-ый бит на ноль. Например: для числа 6 в
*  бинарном виде 110, поменяв 2-й бит на ноль, получим 100, т.е. 4. 1<= i <= 32
*/
public class SetZero {
    public int set(int num, int i) {


        return (num & ~(1 << i-1));

//        String s =  new String (Integer.toBinaryString(num).toCharArray());
//        StringBuilder sb = new StringBuilder(s);
//
//        sb.replace(sb.length()-i,sb.length(), "0");
//        sb.insert(0, "0b");
//
//        int n = Integer.parseInt(String.valueOf(sb));
//        System.out.println(n);
//
//        return n;// Byte.parseByte(String.valueOf(sb));
//
//        char [] c = (Integer.toBinaryString(num)).toCharArray();
//        System.out.println(Arrays.toString(c));
//        if (i <= c.length) {
//            c[c.length - i] = '0';
//        }
//
//        String t = new String(c);
//        byte b = (byte) Integer.parseInt(t);
//
//        return Byte.parseByte(String.valueOf(b));
    }

    public static void main(String[] args) {
        SetZero setZero = new SetZero();
        System.out.println(setZero.set(429, 8));
     }
}
