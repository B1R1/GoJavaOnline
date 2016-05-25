package codegym.practice4;

public class CoinNumberMinimizer {

    // 25, 10, 1
    // 25 + 1 + 1 + 1 +1 +1 = 6
    // 10 + 10 + 10 = 3;
    private static int getNumberOfCoins(int change) {
        int [] intermediateResults = new int [change + 1];
        return getNumberOfCoinsDP(change, intermediateResults);

    }

    // 25
    //  24 = 10 + 10 + 1 + 1 + 1 + 1 = 23 + 1
    // 23 = 22 + 1 + 1 = 22 + 1

    // 50 = 25 + 25 = 40 + 10 = 49 - 1
    //      1             4      7

    private static Integer getNumberOfCoinsDP (int change, int [] intermediateResults) {

        if (change < 0) return null;
        if (change == 0) return 0;

        Integer numberOfCoinsFor25 = getNumberOfCoinsDP(change - 25, intermediateResults);
        Integer numberOfCoinsFor10 = getNumberOfCoinsDP(change - 10, intermediateResults);
        Integer numberOfCoinsFor1 = getNumberOfCoinsDP(change - 1, intermediateResults);

        Integer min = null;
        if (numberOfCoinsFor1 != null && (min == null || numberOfCoinsFor1 < min))
            min = numberOfCoinsFor1;
        if (numberOfCoinsFor10 != null && (min == null || numberOfCoinsFor10 < min))
            min = numberOfCoinsFor10;
        if (numberOfCoinsFor25 != null && (min == null || numberOfCoinsFor25 < min))
            min = numberOfCoinsFor25;

        int result = min + 1;

        intermediateResults[change] = result;

        return result;

    }



    public static void main(String[] args) {
        System.out.println(getNumberOfCoins(49));
    }

}
