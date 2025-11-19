package leetcode;

public class ClimbStairs {
    private int[] memos;

    public int climbStairs2(int n) {
        memos = new int[n+1];
        return recursive(n);
    }

    private int recursive(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        if (n == 2) return 2;

        if (memos[n] > 0)
            return memos[n];

        memos[n] = recursive(n - 1) + recursive(n - 2);
        return memos[n];
    }

    public int climbStairs(int n) {
        int a = 1;
        int b = 2;
        for (int i=3; i<=n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }
}
