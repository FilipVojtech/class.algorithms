package weeklyexercises.part_06_exercise.utils;

import cz.filipvojtech.util.Array;

/**
 * @author michelle
 */
public class NumberUtilities {
    /**
     * Replaces all values withing an array with new value.
     *
     * @param array    The array of numbers
     * @param oldValue The values to replace
     * @param newValue The new value to replace the old with
     * @return The number of values changed
     */
    public static int replace(int[] array, int oldValue, int newValue) {
        if (array == null) {
            return -1;
        }
        int replaced = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
                replaced++;
            }
        }

        return replaced;
    }

    /**
     * Checks whether an array is sorted in ascending order
     *
     * @param array The array to check
     * @return True if the array is sorted, false otherwise
     */
    public static boolean isSortedAsc(int[] array) {
        if (array == null) {
            return true;
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Insert and element into an array and shift others
     *
     * @param array    The array to be inserted into
     * @param newValue The new value
     */
    public static boolean shiftInsert(int[] array, int newValue) {
        if (array == null) {
            return false;
        }
//        if (array.length < 2) {
//            return false;
//        }
        if (!isSortedAsc(array)) {
            return false;
        }

        int prev = newValue;
        int tmp;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < newValue) {
                continue;
            }
            tmp = array[i];
            array[i] = prev;
            prev = tmp;
        }
        return true;
    }

    /**
     * Checks whether an array is sorted in descending order
     *
     * @param array The array to check
     * @return True if the array is sorted, false otherwise
     */
    public static boolean isSortedDesc(int[] array) {
        if (array == null) {
            return true;
        }
        if (array.length < 2) {
            return true;
        }
        for (int i = array.length - 2; i >= 0; i--) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Inserts a value into a sorted array in descending order while maintaining the order. This method utilizes the resize insert.
     *
     * @param array    The array to insert into.
     * @param newValue The value to be inserted.
     * @return An array with the new value. The unmodified array if it is not sorted.
     */
    public static int[] resizeInsert(int[] array, int newValue) {
        if (array == null) {
            return null;
        }
        if (array.length < 2) {
            return array;
        }
        if (!isSortedDesc(array)) {
            return array;
        }
        int[] result = Array.growArray(array, 1);
        int t = 0;
        int tmp;

        for (; t < array.length; t++) {
            if (newValue > array[t]) {
                break;
            }
        }
        for (; t < array.length; t++) {
            tmp = array[t];
            result[t] = newValue;
            newValue = tmp;
        }

        return result;
    }
}
