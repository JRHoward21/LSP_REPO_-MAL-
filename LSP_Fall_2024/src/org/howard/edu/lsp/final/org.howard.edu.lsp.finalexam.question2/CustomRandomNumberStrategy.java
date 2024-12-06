package org.howard.edu.lsp.finalexam.question2;

/**
 * Concrete strategy using a custom random number generation algorithm.
 */
public class CustomRandomNumberStrategy implements RandomNumberStrategy {

    @Override
    public int generateRandomNumber() {
        // Simple custom algorithm: linear congruential generator (LCG)
        long seed = System.nanoTime();
        long a = 1664525;  // Multiplier
        long c = 1013904223;  // Increment
        long m = (1L << 32);  // Modulus (2^32)

        seed = (a * seed + c) % m;
        return (int) seed;
    }
}
