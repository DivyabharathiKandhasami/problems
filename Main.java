
import java.util.HashMap;
import java.util.Map;

    public class Main {
        public static void main(String[] args) {
            String str = "the word big black bug bit a big black dog on his big black nose";
            findRepeatingWords(str);
        }

        public static void findRepeatingWords(String str) {
            // Step 1: Create a new HashMap to store the words as keys and their counts as values.
            Map<String, Integer> wordCount = new HashMap<>();

            // Step 2: Split the string into words using the split() method.
            String[] words = str.split(" ");
            // Step 3: Iterate over the words and for each word, check if it already exists in the HashMap.
            for(String word : words) {

                // Step 4: If it exists, increment its count by 1. Otherwise, add the word to the HashMap with a count of 1.
                if (wordCount.containsKey(word)) {
                    wordCount.put(word, wordCount.get(word) + 1);
                }
                else
                {
                    wordCount.put(word, 1);
                }
            }
            // Step 5: After processing all the words, iterate over the HashMap and print the words that have a count greater than 1, along with their counts.
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                if (entry.getValue() > 1) {
                    System.out.println("The word '" + entry.getKey() + "' repeats " + entry.getValue() + " times.");
                }
            }
        }
    }

