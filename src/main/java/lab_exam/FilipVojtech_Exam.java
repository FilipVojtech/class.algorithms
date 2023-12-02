package lab_exam;

import cz.filipvojtech.util.Array;
import cz.filipvojtech.util.InputUtility;
import weeklyexercises.part01_exercises.utils.FileHandlingUtilities;

import static cz.filipvojtech.util.Array.*;
import static java.util.Arrays.sort;


public class FilipVojtech_Exam {
    public static void main(String[] args) {
        String[] arr1 = FileHandlingUtilities.readTextFile("SampleInput/ExamF1.txt");
        var arr1Sorted = copy(arr1, arr1.length);
        sort(arr1Sorted);

        String[] arr2 = FileHandlingUtilities.readTextFile("SampleInput/ExamF2.txt");
        var arr2Sorted = copy(arr2, arr2.length);
        sort(arr2Sorted);

        // a)
        System.out.println("The starting data:");
        System.out.println("First array:");
        System.out.println(Array.toString(arr1, ", "));
        System.out.println("Second array:");
        System.out.println(Array.toString(arr2, ", "));

        // b)
        System.out.println("Merging the arrays.");
        System.out.println("How many elements from the first collection should be retained?");
        int retain1 = InputUtility.getInt("Number:");
        System.out.println("And how many from the first?");
        int retain2 = InputUtility.getInt("Number:");
        String[] combined = Utils.mergeSorted(arr1, arr2, retain1, retain2);
        System.out.println("Your combined data:");
        System.out.println(Array.toString(combined, ", "));

        // c)
        System.out.println("There is surely a word you'd like to search for, wouldn't you?");
        String word = InputUtility.getString("And the word is: ");
        int wordIndex = Utils.indexOf(combined, word);
        System.out.println(word + "!");
        if (wordIndex > -1) {
            System.out.println("Yes! It is in in your data. And it is the " + (wordIndex + 1) + "th word.");
        } else {
            System.out.println("Hmmm... It seems the word is not in your data :(");
        }

        // d)
        System.out.println("Maybe it would be better if I removed those pesky duplicates.");
        String[] deduped;
        if (wordIndex > -1) {
            System.out.println("I'll start on position " + wordIndex);
            deduped = Utils.deduplicateSorted(combined, wordIndex);
        } else {
            System.out.println("I'll remove duplicates from the whole array.");
            deduped = Utils.deduplicateSorted(combined, 0);
        }
        System.out.println("There were " + (combined.length - deduped.length) + " duplicates! Wow.");
        System.out.println("Here is your tidy data:");
        System.out.println(Array.toString(deduped, ", "));
    }

}
