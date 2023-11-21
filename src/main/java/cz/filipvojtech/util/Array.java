package cz.filipvojtech.util;

public class Array {
    /**
     * @param nums The numbers to search through
     * @return The biggest number found
     */
    public static int findMax(int... nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) max = nums[i];
        }
        return max;
    }

    /**
     * Find the largest number in a set
     *
     * @param nums The numbers to search through
     * @return The biggest number found
     */
    @SafeVarargs
    public static <T extends Number> T findMax(T... nums) {
        T max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i].longValue() > max.longValue()) max = nums[i];
        }
        return max;
    }

    /**
     * Grows an array
     *
     * @param oldArray The array to grow
     * @return The resized array
     */
    public static int[] growArray(int[] oldArray) {
        int[] newArr = new int[oldArray.length * 2];

        for (int i = 0; i < oldArray.length; i++)
            newArr[i] = oldArray[i];

        return newArr;
    }

    /**
     * Grows an array
     *
     * @param oldArray The array to grow
     * @return The resized array
     */
    public static String[] growArray(String[] oldArray) {
        String[] newArr = new String[oldArray.length * 2];

        for (int i = 0; i < oldArray.length; i++)
            newArr[i] = oldArray[i];

        return newArr;
    }

    /**
     * Grows an array by specified length
     *
     * @param oldArray  The array to grow
     * @param enlargeBy Amount how much to increase the size
     * @return The resized array
     */
    public static String[] growArray(String[] oldArray, int enlargeBy) {
        if (enlargeBy < 0) {
            return oldArray;
        }

        String[] newArr = new String[oldArray.length + enlargeBy];

        for (int i = 0; i < oldArray.length; i++)
            newArr[i] = oldArray[i];

        return newArr;
    }

    /**
     * Grows an array
     *
     * @param oldArray The array to grow
     * @return The resized array
     */
    public static <T> T[] growArray(T[] oldArray) {
        T[] newArr = (T[]) new Object[oldArray.length * 2];

        for (int i = 0; i < oldArray.length; i++)
            newArr[i] = oldArray[i];

        return newArr;
    }

    /**
     * Merge two arrays
     *
     * @param arr1 First array
     * @param arr2 Second array
     * @return The resulting array
     */
    public static int[] merge(int[] arr1, int[] arr2) {
        if (arr1.length == arr2.length) {
            return mergeSameLength(arr1, arr2);
        }
        int[] combined = new int[arr1.length + arr2.length];
        int counter = 0;

        for (var el : arr1) {
            combined[counter] = el;
            counter++;
        }

        for (var el : arr2) {
            combined[counter] = el;
            counter++;
        }

        return combined;
    }

    /**
     * Merge two arrays
     *
     * @param tClass Class of the two arrays
     * @param arr1   First array
     * @param arr2   Second array
     * @param <T>    Type of the arrays
     * @return The merged arrays
     */
    public static <T> T[] merge(Class<T> tClass, T[] arr1, T[] arr2) {
        if (arr1.length == arr2.length) {
            return mergeSameLength(tClass, arr1, arr2);
        }
        T[] combined = (T[]) java.lang.reflect.Array.newInstance(tClass, arr1.length + arr2.length);
        int counter = 0;

        for (var el : arr1) {
            combined[counter] = el;
            counter++;
        }

        for (var el : arr2) {
            combined[counter] = el;
            counter++;
        }

        return combined;
    }

    /**
     * Merge two arrays with trimming
     *
     * @param arr1    First array
     * @param length1 The length of the first array
     * @param arr2    Second array
     * @param length2 Length of the second array
     * @return Trimmed mered arrays
     */
    public static int[] merge(int[] arr1, int length1, int[] arr2, int length2) {
        int[] combined = new int[length1 + length2];
        int counter = 0;

        for (var el : arr1) {
            combined[counter] = el;
            counter++;
            if (counter >= length1) {
                break;
            }
        }

        for (var el : arr2) {
            combined[counter] = el;
            counter++;
            if (counter - length1 >= length2) {
                break;
            }
        }

        return combined;
    }

    /**
     * Merge two arrays of the same length
     *
     * @param arr1 First array
     * @param arr2 Second array
     * @return Combined array
     */
    private static int[] mergeSameLength(int[] arr1, int[] arr2) {
        var combined = new int[arr1.length * 2];

        for (int i = 0; i < arr1.length; i++) {
            combined[i] = arr1[i];
            combined[i + arr1.length] = arr2[i];
        }

        return combined;
    }

    private static <T> T[] mergeSameLength(Class<T> tClass, T[] arr1, T[] arr2) {
        T[] combined = (T[]) java.lang.reflect.Array.newInstance(tClass, arr1.length * 2);

        for (int i = 0; i < arr1.length; i++) {
            combined[i] = arr1[i];
            combined[i + arr1.length] = arr2[i];
        }

        return combined;
    }

    public static int[] mergeOrdered(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int arr1Counter = 0, arr2Counter = 0;

        for (int i = 0; i < result.length; i++) {
            if (arr1Counter == arr1.length) {
                result[i] = arr2[arr2Counter];
                arr2Counter++;
            } else if (arr2Counter == arr2.length) {
                result[i] = arr1[arr1Counter];
                arr1Counter++;
            } else if (arr1[arr1Counter] < arr2[arr2Counter]) {
                result[i] = arr1[arr1Counter];
                arr1Counter++;
            } else {
                result[i] = arr2[arr2Counter];
                arr2Counter++;
            }
        }

        return result;
    }

    public static String[] mergeOrdered(String[] arr1, String[] arr2) {
        var result = new String[arr1.length + arr2.length];
        int arr1Counter = 0, arr2Counter = 0;

        for (int i = 0; i < result.length; i++) {
            if (arr1Counter == arr1.length) {
                result[i] = arr2[arr2Counter];
                arr2Counter++;
            } else if (arr2Counter == arr1.length) {
                result[i] = arr1[arr1Counter];
                arr1Counter++;
            } else
                switch ((int) Math.signum(arr1[arr1Counter].compareTo(arr2[arr2Counter]))) {
                    case -1, 0:
                        result[i] = arr1[arr1Counter];
                        arr1Counter++;
                        break;
                    case 1:
                        result[i] = arr2[arr2Counter];
                        arr2Counter++;
                        break;
                }
        }

        return result;
    }

    /**
     * Get a slice from the start of an array
     *
     * @param array  Array to get the slice from
     * @param length The length of the slice.
     *               If the length is larger than the array, it is cropped.
     * @return The array slice
     */
    private static String[] copy(String[] array, int length) {
        if (length > array.length) {
            length = array.length;
        }

        String[] result = new String[length];
        for (int i = 0; i < length; i++) {
            array[i] = result[i];
        }

        return result;
    }

    /**
     * Get a slice of an array with offset
     *
     * @param array  Array to get the slice from
     * @param offset The start of the slice
     *               If the offset is outside the array, an empty array is returned.
     * @param length The length of the slice
     *               If the length is larger than the array, it is capped.
     * @return The array slice
     */
    private static String[] copy(String[] array, int offset, int length) {
        if (offset > array.length) {
            return new String[0];
        }
        if (offset + length > array.length) {
            length = array.length - offset;
        }

        String[] result = new String[length];
        for (int i = 0; i < length; i++) {
            array[i + offset] = result[i];
        }

        return result;
    }

    /**
     * Check if string can be found withing an array
     *
     * @param array  The array to search through
     * @param string The string to look for
     * @return True if the element was found, false otherwise
     */
    public static boolean contains(String[] array, String string, boolean caseSensitive) {
        for (var item : array) {
            if (caseSensitive ? string.equals(item) : string.equalsIgnoreCase(item)) {
                return true;
            }
        }
        return false;
    }

    //*******************//
    //    Partitioning   //
    //*******************//
    public static int[][] myPartition(int[] arr, int lessThanValue) {
        var arrays = new int[2][arr.length];
        int tr1 = 0, tr2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= lessThanValue) {
                arrays[0][tr1] = arr[i];
                tr1++;
            } else {
                arrays[1][tr2] = arr[i];
                tr2++;
            }
        }

        var lessThan = new int[tr1];
        for (int i = 0; i < lessThan.length; i++) {
            lessThan[i] = arrays[0][i];
        }
        arrays[0] = lessThan;

        var moreThan = arrays[1];
        arrays[1] = new int[tr2];
        for (int i = 0; i < tr2; i++) {
            arrays[1][i] = moreThan[i];
        }

        return arrays;
    }


    public static int[] partition(int[] arr, int lessThanValue) {
        var arrays = new int[2][arr.length];
        int tr1 = 0, tr2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= lessThanValue) {
                arrays[0][tr1] = arr[i];
                tr1++;
            } else {
                arrays[1][tr2] = arr[i];
                tr2++;
            }
        }

        return merge(arrays[0], tr1, arrays[1], tr2);
    }

    public static String toString(int[] arr, String delimiter) {
        String printedArray = "";
        for (var number : arr) {
            printedArray += number + delimiter;
        }
        return printedArray.substring(0, printedArray.length() - delimiter.length());
    }

    public static String toString(Object[] array, String delimiter) {
        StringBuilder sb = new StringBuilder();
        for (Object value : array) {
            sb
                    .append(value.toString())
                    .append(delimiter);
        }
        return sb.substring(0, sb.length() - delimiter.length());
    }


    /*
    ||********************||
    ||    Deduplication   ||
    ||********************||
     */

    /**
     * Deduplicate an array with growing with each element added to the resulting array.
     * Method written using labels.
     *
     * @param array The array to deduplicate
     * @return Deduplicated array
     */
    public static String[] deduplicateWithLabels(String[] array) {
        String[] filtered = new String[1];
        filtered[0] = array[0];
        int t = 1;

        outer:
        for (int j = 1; j < array.length; j++) {
            var el = array[j];

            for (int i = 0; i < t; i++) {
                if (el.equals(filtered[i])) {
                    continue outer;
                }
            }
            filtered = growArray(filtered, 1);
            filtered[t] = el;
            t++;
        }

        return filtered;
    }

    /**
     * Deduplicate an array with growing with each element added to the resulting array.
     *
     * @param array The array to deduplicate
     * @return Deduplicated array
     */
    public static String[] deduplicateGrow(String[] array) {
        if (array == null) {
            return null;
        }

        if (array.length < 2) {
            return copy(array, array.length);
        }

        String[] filtered = new String[1];
        filtered[0] = array[0];
        int t = 1;

        for (int j = 1; j < array.length; j++) {
            var el = array[j];
            boolean found = contains(filtered, el, true);

            if (!found) {
                filtered = growArray(filtered, 1);
                filtered[t] = el;
                t++;
            }
        }

        return filtered;
    }

    /**
     * Deduplicate an array with slicing the free space after
     *
     * @param array The array to deduplicate
     * @return Deduplicated array
     */
    public static String[] deduplicateSlice(String[] array) {
        if (array == null) {
            return null;
        }

        if (array.length < 2) {
            return array;
        }
        String[] filtered = new String[array.length];
        filtered[0] = array[0];
        int t = 1;

        for (int i = 0; i < array.length; i++) {
            var el = array[i];
            boolean found = contains(filtered, el, true);

            if (!found) {
                filtered[t] = el;
                t++;
            }
        }

        return copy(filtered, t);
    }


    /*
    ||*****************||
    ||    Inserting    ||
    ||*****************||
     */

    /**
     * Overwrite a value at a specified position in an array
     *
     * @param array    The array
     * @param position The position to be assigned into
     * @param newValue Value to be assigned to a position
     * @return The old value on the position. If the array is null or the position invalid, 0 is returned.
     */
    public static int insertOverwrite(int[] array, int position, int newValue) {
        if (array == null ||
                position < 0 || position > array.length - 1) {
            return 0;
        }

        int original = array[position];
        array[position] = newValue;
        return original;
    }

    /**
     * Overwrite a value at a specified position in an array
     *
     * @param array    The array
     * @param position The position to be assigned into
     * @param newValue Value to be assigned to a position
     * @return The old value on the position. If the array is null or the position invalid, 0 is returned.
     */
    public static int[] insertResize(int[] array, int position, int newValue) {
        if (array == null ||
                position < 0 || position > array.length - 1) {
            return null;
        }

        int[] shifted = new int[array.length + 1];

        for (int i = 0; i < position; i++) {
            shifted[i] = array[i];
        }
        shifted[position] = newValue;
        for (int i = position; i < array.length; i++) {
            shifted[i + 1] = array[i];
        }
        return shifted;
    }

    /**
     * Insert and element into an array and shift others
     *
     * @param array    The array to be inserted into
     * @param position THe position to insert at
     * @param newValue The new value
     */
    public static void insertShift(int[] array, int position, int newValue) {
        if (array == null) {
            return;
        }
        if (position < 0 || position >= array.length) {
            return;
        }
//        Create prev variable and set to value
        int prev = newValue;
        int tmp;
//        For each element in array starting from specified position:
        for (int i = position; i < array.length; i++) {
//        Create temp variable and set to array[i]
            tmp = array[i];
//        Set array[i] to prev
            array[i] = prev;
//        Set prev to temp
            prev = tmp;
        }
//        Algorithm has completed, no return necessary
    }

}
