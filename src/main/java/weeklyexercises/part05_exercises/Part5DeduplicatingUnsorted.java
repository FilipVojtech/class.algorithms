package weeklyexercises.part05_exercises;

import cz.filipvojtech.classes_from_michelle.Book;
import cz.filipvojtech.util.Array;
import cz.filipvojtech.util.InputUtility;
import weeklyexercises.part05_exercises.utils.BookUtilities;
import weeklyexercises.part05_exercises.utils.CustomUtils;
import weeklyexercises.part05_exercises.utils.FileHandlingUtilities;

import java.io.File;
import java.text.MessageFormat;
import java.util.ArrayList;

/**
 * @author michelle
 * @author Filip Vojtěch
 */
public class Part5DeduplicatingUnsorted {
    private static boolean useArrayLists;
    private static Book[] dataArray;
    private static ArrayList<Book> dataArrayList;

    public static void main(String[] args) {
        readUserBookFile();
        if (useArrayLists) {
            var dedupedData = BookUtilities.deduplicateList(dataArrayList);
            var removedCount = dataArrayList.size() - dedupedData.size();
            System.out.println(MessageFormat.format("Removed {0} duplicate items from the collection.", removedCount));
            System.out.println("Deduplicated books:");
            System.out.println(CustomUtils.listToString(dedupedData, "\n"));
        } else {
            var dedupedData = BookUtilities.isSortedAsc(dataArray) ? BookUtilities.deduplicateUnsorted(dataArray) : BookUtilities.deduplicateSorted(dataArray);
            var removedCount = dataArray.length - dedupedData.length;
            System.out.println(MessageFormat.format("Removed {0} duplicate items from the collection.", removedCount));
            System.out.println("Deduplicated books:");
            System.out.println(Array.toString(dedupedData, "\n"));
        }
    }

    private static void readUserBookFile() {
        String fName;
        File f;
        while (true) {
            // SampleInput/Part5UnsortedSampleInputDuplicates.txt
            fName = InputUtility.getString("File name:");
            f = new File(fName);
            if (!f.exists()) {
                System.out.println("The file specified does not exist. Please input a new name.");
            } else break;
        }
        useArrayLists = InputUtility.promptYesNo("Do you want to use ArrayLists under the hood? Answering no will use regular arrays instead.");
        var data = FileHandlingUtilities.readBookFile(fName);
        if (useArrayLists) {
            dataArrayList = CustomUtils.arrayToList(data);
        } else {
            dataArray = data;
        }
    }
}
