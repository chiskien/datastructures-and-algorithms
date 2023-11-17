package chiskien.datastructures_algorithms.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EnumerateAllPrimesToN {

    //Write a program takes an integer argument

    public List<Integer> generatePrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        List<Boolean> isPrime = new ArrayList<>(Collections.nCopies(n + 1, true));
        isPrime.set(0, false);
        isPrime.set(1, false);
        for (int i = 2; i <= n; i++) {
            if (isPrime.get(i)) {
                primes.add(i);
                for (int j = i; j <= n; j += i) {
                    isPrime.set(j, false);
                }
            }
        }
        return primes;
    }
}
