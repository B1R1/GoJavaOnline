package codegym.practice1;

public class SumDigits {

    public int sum(int number) {

        int result = 0;

        if (number < 0) number = -number;

        if (number == Integer.MIN_VALUE) {
            number = -(number + 1);
            while (number > 0) {
                result = result + number % 10;
                number = number / 10;
            }
            return result + 1;
        } else {
            while (number > 0) {
                result = result + number % 10;
                number = number / 10;
            }
            return result;
        }
    }
}