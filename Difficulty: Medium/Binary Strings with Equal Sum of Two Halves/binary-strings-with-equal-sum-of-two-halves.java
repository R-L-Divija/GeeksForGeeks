class Solution {
    static final long MOD = 1000000007L;

    long pow(long a, long b) {
        long res = 1;

        while (b > 0) {
            if ((b & 1) == 1)
                res = (res * a) % MOD;

            a = (a * a) % MOD;
            b >>= 1;
        }return res;
    }

    int computeValue(int n) {
        long f2 = 1, f1 = 1;
        for (int i = 1; i <= 2 * n; i++) {
            f2 = (f2*i) % MOD;

            if (i <= n)
                f1 = (f1*i) % MOD;
        }

        long inv = pow(f1, MOD - 2);

        long ans = f2;
        ans = (ans * inv) % MOD;
        ans = (ans * inv) % MOD;

        return (int) ans;
    }
}