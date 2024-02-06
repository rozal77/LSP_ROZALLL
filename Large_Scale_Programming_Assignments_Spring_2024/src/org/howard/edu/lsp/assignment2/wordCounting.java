//import fileToBeRead.txt;
package org.howard.edu.lsp.assignment2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.*;


public class wordCounting {

	 public static void main(String[] args) {
		 String fileName = "./src/org/howard/edu/lsp/assignment2/fileToBeRead.txt";
		 InputStream inputStream = ReadFileFromClasspath.class.getClassLoader().getResourceAsStream(fileName);
	        

	        // Create a HashMap to store word frequencies
	        Map<String, Integer> wordFrequencyMap = new HashMap<>();

	        // Read file and process words
	        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                // Split the line into words
	                String[] words = line.split("\\s+|(?=[.,!?;'])|(?<=[.,!?;'])");

	                // Process each word
	                for (String word : words) {
	                    // Remove non-alphabetic characters from the word
	                    word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
	                    // Check if the word has more than three letters
	                    if (word.length() > 3) {
	                        // Update the word frequency in the HashMap
	                        wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
	                    }
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        // Print word frequencies
	        System.out.println("Word frequencies with more than three letters:");
	        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	    }
		}
