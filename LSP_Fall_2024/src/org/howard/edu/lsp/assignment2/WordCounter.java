package org.howard.edu.lsp.assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class WordCounter {

    public static void main(String[] args){
        String filename = "words.txt"; // File should be placed in the package directory
        Map<String, Integer> wordCount = new HashMap<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line into words based on non-letter characters
                String[] words = line.split("[^a-zA-Z]+");
                for (String word : words) {
                    if (word.isEmpty()) continue; // Skip empty strings
                    word = word.toLowerCase(); // Convert to lowercase
                    if (word.length() <= 3) continue; // Skip trivial words

                    // Increment the word count
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // Print the results
        System.out.println("Word counts:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }
}