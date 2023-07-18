package special.code204;

public class Solution {
    // common
    public int countPrimes(int n) {
        int res = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                res++;
            }
        }
        return res;
    }

    public boolean isPrime(int a) {
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    // eratosthenes
    public int countPrimes2(int n) {
        boolean[] notPrime = new boolean[n];
        int res = 0;
        for (int i = 2; i < n; i++) {
            if (!notPrime[i]) {
                res++;
                if (i <= Math.sqrt(n)) {
                    for (int j = i * 2; j < n; j+=i) {
                        notPrime[j] = true;
                    }
                }
            }
        }
        return res;
    }
}
