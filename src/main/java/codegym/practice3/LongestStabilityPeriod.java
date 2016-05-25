package codegym.practice3;

public class LongestStabilityPeriod {
    public int count(int[] gdp) {

        if (gdp == null) return 0;
        if (gdp.length == 1 && gdp[0] == 0) return 0;
        if (gdp.length == 1) return 1;

        int result = 1;
        int finResult = 1;

        if (gdp[0] == gdp[1] || gdp[0] == gdp[1] + 1 || gdp[0] == gdp[1] - 1) {
            finResult = result = 2;

        }

        for (int i = 1; i < gdp.length-1; i++) {

            if (result == 1) {
                if (gdp[i] == gdp[i + 1] || gdp[i] == gdp[i + 1] || gdp[i] == gdp[i + 1]) {
                    if (finResult < result) finResult = result;
                }

                if (result >= 2) {
                    if (gdp[i] == gdp[i - 1]  || (gdp[i] - gdp[i - 1] == 1) &&
                            (gdp[i] - gdp[i - 1] == -1)) {
                        result++;
                        if (finResult < result) finResult = result;
                    }
                } else result = 1;
            }
            else result = 1;
        }
        return finResult;
    }
}
