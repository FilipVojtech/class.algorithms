package weeklyexercises.part03_exercises.utils;

/**
 * @author michelle
 */
public class StringUtilities {
    /**
     * Merge two unordered arrays with trimming
     *
     * @param arr1    First array of elements to merge
     * @param length1 Number of elements to merge from the first array
     * @param arr2    Second array of elements to merge
     * @param length2 Number of elements to merge from the second array
     * @return Combined array with the selected elements
     */
    public static String[] merge(String[] arr1, String[] arr2, int length1, int length2) {
        // Ensure that length is not outside that the array length
        if (length1 > arr1.length) {
            length1 = arr1.length;
        } else if (length1 < 0) {
            length1 = 0;
        }
        if (length2 > arr2.length) {
            length2 = arr2.length;
        } else if (length2 < 0) {
            length2 = 0;
        }

        // Array for combining with length of the two expected arrays
        String[] combined = new String[length1 + length2];
        // Tracking which position is being inserted into for the combined
        int tracker = 0;

        // Add the first array elements to the combined
        for (int i = 0; i < length1; i++) {
            combined[tracker] = arr1[i];
            tracker++;
        }
        // Add the second array elements
        for (int i = 0; i < length2; i++) {
            combined[tracker] = arr2[i];
            tracker++;

        }
        return combined;
    }

    /**
     * Counts the occurrence of a string in an array
     *
     * @param text   The array to search through
     * @param string The string to look for
     * @return The count of the occurrence of the string in the array
     */
    public static int count(String[] text, String string) {
        int occurrence = 0;
        for (String str : text) {
            if (string.equalsIgnoreCase(str)) {
                occurrence++;
            }
        }
        return occurrence;
    }

    /**
     * Partitions the contents of an array in a descending lexicographical order using a pivot.
     *
     * @param strings Array of strings to be partitioned
     * @param pivot   The pivot word to compare each string in the array
     * @return Merged array in partitioned order
     */
    public static String[] partition(String[] strings, String pivot) {
        String[] greater = new String[strings.length], lower = new String[strings.length];
        int grTr = 0, loTr = 0;

        for (var str : strings) {
            int compareRes = pivot.compareToIgnoreCase(str);
            if (compareRes > 0) {
                // Less than
                lower[loTr] = str;
                loTr++;
            } else {
                // Greater than or equals
                greater[grTr] = str;
                grTr++;
            }
        }

        return merge(greater, lower, grTr, loTr);
    }
}
