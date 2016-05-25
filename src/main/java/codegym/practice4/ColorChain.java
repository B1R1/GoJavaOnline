package codegym.practice4;

public class ColorChain {

    // 3 - 4
    // 4 - 7
    public int count (int N) {
        int[] intermediateResults = new int[N+1];

        if (N < 0) return 0;
        if (N == 0) return 1;
        if (N <= 2) return N;

        intermediateResults[0] = 1;
        intermediateResults[1] = 1;
        intermediateResults[2] = 2;

        for (int i = 3; i <= N; i++) {
            intermediateResults[i] = intermediateResults[i-1]
                    + intermediateResults[i-2]
                    + intermediateResults[i-3];
        }
        return intermediateResults[N];
    }

    public static void main(String[] args) {
        ColorChain c = new ColorChain();
        System.out.println(c.count(4));
    }
}
