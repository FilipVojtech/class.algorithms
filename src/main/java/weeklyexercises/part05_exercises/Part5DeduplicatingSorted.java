package weeklyexercises.part05_exercises;


import cz.filipvojtech.classes_from_michelle.Book;
import cz.filipvojtech.util.Array;
import cz.filipvojtech.util.InputUtility;
import weeklyexercises.part05_exercises.utils.BookUtilities;
import weeklyexercises.part05_exercises.utils.FileHandlingUtilities;

import java.io.File;

/**
 * @author michelle
 */
public class Part5DeduplicatingSorted {
    private static Book[] data;

    public static void main(String[] args) {
        readUserBookFile();
        System.out.println("The original list:");
        System.out.println(Array.toString(data, "\n"));
        System.out.println("------------------------------");
        System.out.println("Removing duplicates...");
        data = BookUtilities.deduplicateSorted(data);
        System.out.println("------------------------------");
        System.out.println(Array.toString(data, "\n"));
    }

    private static void readUserBookFile() {
        String fName;
        File f;
        while (true) {
            // SampleInput/Part5UnsortedSampleInputDuplicates.txt
            // SampleInput/Part5SortedSampleBookInputDuplicates.txt
            fName = InputUtility.getString("File name:");
            f = new File(fName);
            if (!f.exists()) {
                System.out.println("The file specified does not exist. Please input a new name.");
            } else break;
        }
        data = FileHandlingUtilities.readBookFile(fName);
        if (!BookUtilities.isSortedAsc(data)) {
            System.out.println("Sorry, the data is not sorted. Please specify a new file.");
            readUserBookFile();
        }
    }
}
