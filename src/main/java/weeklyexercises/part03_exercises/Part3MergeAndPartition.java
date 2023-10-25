package weeklyexercises.part03_exercises;

import cz.filipvojtech.util.Array;
import cz.filipvojtech.util.InputUtility;

import static weeklyexercises.part03_exercises.utils.StringUtilities.*;

/**
 * @author michelle
 * @author filip
 */
public class Part3MergeAndPartition {
    /**
     * Longer, but more efficient
     * Specification complying version
     */
    public static void main(String[] args) {
        // Define vars
        int wordCount;
        String[] words, words2;
        boolean addMoreWords;
        String pivot;

        // Inform user
        System.out.println("I will need you to enter a few words for me.");
        // Get word count for the first set of words
        wordCount = InputUtility.getInt("How many words will you enter:", 1, Integer.MAX_VALUE);
        // Get the first set of words
        words = InputUtility.getStringArray(wordCount);
        // Display entered words
        System.out.println("You entered:");
        System.out.println(Array.toString(words, ", "));
        // Ask if the user wants to input more words
        addMoreWords = InputUtility.promptYesNo("Do you want to add more words?");
        // If yes, prompt again
        if (addMoreWords) {
            // Ask for the second count
            wordCount = InputUtility.getInt("How many words will you enter:", 1, Integer.MAX_VALUE);
            // Get the second set of words
            words2 = InputUtility.getStringArray(wordCount);
            // Merge the two arrays
            words = merge(words, words2, words.length, words2.length);
        }
        // Partitioning of the array
        System.out.println("I will now sort your words into two buckets!");
        // Ask for the pivot
        pivot = InputUtility.getString("A word to bucket your words:");
        // Do the partitioning
        words = partition(words, pivot);
        // Output the merged partitioned array
        System.out.println("Your bucketed words");
        System.out.println(Array.toString(words, ", "));
    }

    /**
     * Shorter, less efficient, more modular
     * Specification non-complying version
     * Note: Apologies I had to deviate from the specs
     */
    public static void main2(String[] args) {
        // Define vars
        int[] wordCount = new int[2];
        String[] words = new String[0];
        String pivot;
        // Define the limit how many times can the user repeat the input
        final int inputWordsLimit = 2;

        // Inform user
        System.out.println("I will need you to enter a few words for me.");
        // Start taking in words
        for (int i = 0; i < inputWordsLimit; i++) {
            // Get word count for the current set of words
            wordCount[i] = InputUtility.getInt("How many words will you enter:", 1, Integer.MAX_VALUE);
            // Get the current set of words
            var tempWords = InputUtility.getStringArray(wordCount[i]);
            // Display entered words
            System.out.println("You entered:");
            System.out.println(Array.toString(tempWords, ", "));
            // Add the temp words to the words array
            // This is slower, but allows us to change how many times the user can input more words (potentially infinite)
            words = merge(words, tempWords, wordCount[i], wordCount[i]);
            // Don't ask if we've reached the limit
            if (i < inputWordsLimit - 1) {
                // Ask if the user wants to input more words
                var addMoreWords = InputUtility.promptYesNo("Do you want to add more words?");
                // if not, break the cycle
                // if yes, simply continue
                if (!addMoreWords) {
                    break;
                }
            }
        }

        // Partitioning of the array
        System.out.println("I will now sort your words into two buckets!");
        // Ask for the pivot
        pivot = InputUtility.getString("A word to bucket your words:");
        // Do the partitioning
        words = partition(words, pivot);
        // Output the merged partitioned array
        System.out.println("Your bucketed words");
        System.out.println(Array.toString(words, ", "));
    }

    // Idea 3 alá Too many ideas, not enough time
    // String[][]
    // Flatten it, then partition
}
