class Solution {
    public static int countNumbers(int n) {
int s = (int)Math.sqrt(n);

// Sieve
boolean[] isPrime = new boolean[s + 1];
Arrays.fill(isPrime, true);
isPrime[0] = isPrime[1] = false;

for (int i = 2; i * i <= s; i++) {
    if (isPrime[i]) {
        for (int j = i * i; j <= s; j += i) {
            isPrime[j] = false;
        }
    }
}

ArrayList<Integer> p = new ArrayList<>();
for (int i = 2; i <= s; i++) {
    if (isPrime[i]) p.add(i);
}

int d = 0;

// Count p^8
for (int i = 0; i < p.size(); i++) {
    long val = 1;
    for (int k = 0; k < 8; k++) {
        val *= p.get(i);
        if (val > n) break;
    }
    if (val <= n) d++;
    else break;
}

// Count p^2 * q^2
for (int i = 0; i < p.size(); i++) {
    for (int j = i + 1; j < p.size(); j++) {
        long prod = 1L * p.get(i) * p.get(j);
        if (prod <= s) d++;
        else break;
    }
}

return d;

        
    }
}