class Solution {
    static final int MOD = 1_000_000_007;

    public int numberOfSets(int n, int k) {
        int N = n + k - 1;
        int R = 2 * k;
        return (int) binomial(N, R);
    }

    private long binomial(int N, int R) {
        if (R < 0 || R > N) return 0;

        // Precompute factorials up to N
        long[] fact = new long[N + 1];
        fact[0] = 1;
        for (int i = 1; i <= N; i++) {
            fact[i] = fact[i - 1] * i % MOD;
        }

        long numerator = fact[N];
        long denominator = fact[R] * fact[N - R] % MOD;

        return numerator * modInverse(denominator, MOD) % MOD;
    }

    private long modInverse(long a, int mod) {
        return power(a, mod - 2, mod); // Fermat's little theorem (mod is prime)
    }

    private long power(long base, long exp, int mod) {
        long result = 1;
        base %= mod;
        while (exp > 0) {
            if ((exp & 1) == 1) result = result * base % mod;
            base = base * base % mod;
            exp >>= 1;
        }
        return result;
    }
}