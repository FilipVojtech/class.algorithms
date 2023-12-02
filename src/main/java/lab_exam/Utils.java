package lab_exam;


import static cz.filipvojtech.util.Array.growArray;
import static cz.filipvojtech.util.Array.isSorted;

public class Utils {
    /**
     * Find the first index of specified string in an array of strings.
     *
     * @param array The array to search through.
     *              Sorted array.
     *              Non-null value.
     * @param query The string to look for.
     *              Non-null value.
     * @return The index of the string. Returns -1 if no match was found, the array was not sorted or any argument was null.
     */
    public static int indexOf(String[] array, String query) {
        // Validation
        if (array == null) {
            return -1;
        }
        if (query == null) {
            return -1;
        }
        if (!isSorted(array)) {
            return -1;
        }

        // Search through array
        for (int i = 0; i < array.length; i++) {
            // Cache the result of compare
            var compareToResult = query.compareTo(array[i]);
            // We're over the query, skip checking, there certainly won't be a match
            if (compareToResult > 0) {
                break;
            }
            // Match found, return the index
            else if (compareToResult == 0) {
                return i;
            }
        }
        // Nothing found
        return -1;
    }

    /**
     * Merges two sorted string arrays into one sorted string array.
     *
     * @param first   First array to merge.
     *                Non-null value.
     * @param second  Second array to merge.
     *                Non-null value.
     * @param length1 The length to keep from the first array.
     *                If the length is not positive, the first array will be ignored.
     *                If the length is over the length of the first array, the whole array will be included.
     * @param length2 The length to keep from the second array.
     *                If the length is not positive, the second array will be ignored.
     *                If the length is over the length of the second array, the whole array will be included.
     * @return Merged array in sorted order. Null, if both arrays are null. If one array is null, the other is returned if it is sorted, in which case null is returned.
     */
    public static String[] mergeSorted(String[] first, String[] second, int length1, int length2) {
        // Validations
        // Check for null arrays
        if (first == null && second == null) {
            return null;
        } else if (first == null) {
            // First is null so we don't have to loop
            return isSorted(second) ? second : null;
        } else if (second == null) {
            // Second is null so we don't have to loop
            return isSorted(first) ? first : null;
        }

        // Cap the lengths if they're over the length
        // or return an array if the other's specified length is negative
        if (length1 > first.length) {
            length1 = first.length;
        } else if (length1 < 0) {
            return second;
        }
        if (length2 > second.length) {
            length2 = second.length;
        } else if (length2 < 0) {
            return first;
        }

        String[] result = new String[length1 + length2];
        int tF = 0;
        int tS = 0;

        for (int i = 0; i < result.length; i++) {
            if (tF >= length1) {
                // Nothing to take from the first array
                // Add from second
                result[i] = second[tS];
                tS++;
            } else if (tS >= length2) {
                // Nothing to take from the second
                // Add from first
                result[i] = first[tF];
                tF++;
            } else if (first[tF].compareTo(second[tS]) <= 0) {
                // Element from the first is less than the element from the second
                // Add to final from first
                result[i] = first[tF];
                tF++;
            } else {
                // Add to final from second
                result[i] = second[tS];
                tS++;
            }
        }
        return result;
    }

    /**
     * Removes duplicates from a sorted array.
     *
     * @param data    The sorted array to remove duplicates from.
     *                Non-null value.
     * @param startAt Starting position of deduplication.
     *                Positive number.
     *                If the number is negative, the whole array will be filtered
     * @return An array without duplicates or blanks. Null if the array is null or not sorted.
     */
    public static String[] deduplicateSorted(String[] data, int startAt) {
        // Validation
        if (data == null) {
            return null;
        }
        if (!isSorted(data)) {
            return null;
        }
        if (startAt > data.length - 1) {
            return new String[0];
        }
        if (startAt < 0) {
            startAt = 0;
        }

        String[] result = new String[1];
        int t = 0;

        // Deduplicate
        for (int i = startAt; i < data.length - 1; i++) {
            // If the current element does not equal next, add it to result
            if (!data[i].equals(data[i + 1])) {
                result = growArray(result, 1);
                result[t] = data[i];
                t++;
            }
        }

        // Add the last element to result
        result[t] = data[data.length - 1];

        return result;
    }
}
