package org.howard.edu.lsp.finalexam.question2;

/**
 * Singleton class that provides random number generation services using different strategies.
 */
public class RandomNumberService {

    // Static instance for Singleton pattern
    private static RandomNumberService instance;

    private RandomNumberStrategy strategy;

    // Private constructor for Singleton
    private RandomNumberService() {}

    /**
     * Gets the Singleton instance of RandomNumberService.
     *
     * @return the singleton instance.
     */
    public static RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }

    /**
     * Sets the strategy to use for random number generation.
     *
     * @param strategy the strategy to use.
     */
    public void setStrategy(RandomNumberStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Generates a random number using the selected strategy.
     *
     * @return the random number.
     */
    public int generateRandomNumber() {
        if (strategy == null) {
            throw new IllegalStateException("Strategy is not set.");
        }
        return strategy.generateRandomNumber();
    }
}
