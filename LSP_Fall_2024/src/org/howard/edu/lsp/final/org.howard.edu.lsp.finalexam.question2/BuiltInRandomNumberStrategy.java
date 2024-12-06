package org.howard.edu.lsp.finalexam.question2;

import java.util.Random;

/**
 * Concrete strategy using Java's built-in Random class.
 */
public class BuiltInRandomNumberStrategy implements RandomNumberStrategy {

    private Random random;

    public BuiltInRandomNumberStrategy() {
        random = new Random();
    }

    @Override
    public int generateRandomNumber() {
        return random.nextInt(Integer.MAX_VALUE);  // Generates a positive integer
    }
}
