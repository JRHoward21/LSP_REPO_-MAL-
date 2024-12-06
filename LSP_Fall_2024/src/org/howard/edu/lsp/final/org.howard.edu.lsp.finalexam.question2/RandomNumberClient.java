package org.howard.edu.lsp.finalexam.question2;

/**
 * Client class to demonstrate the RandomNumberService with different strategies.
 */
public class RandomNumberClient {

    public static void main(String[] args) {
        // Get the singleton instance of the random number service
        RandomNumberService service = RandomNumberService.getInstance();

        // Use the built-in random number strategy
        service.setStrategy(new BuiltInRandomNumberStrategy());
        System.out.println("Built-in Random Number: " + service.generateRandomNumber());

        // Use the custom random number strategy
        service.setStrategy(new CustomRandomNumberStrategy());
        System.out.println("Custom Random Number: " + service.generateRandomNumber());
    }
}
