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

    private static int[] mergeSameLength(int[] arr1, int[] arr2) {
        var combined = new int[arr1.length * 2];

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
            } else if (arr2Counter == arr2.length) {
                result[i] = arr1[arr1Counter];
                arr1Counter++;
            } else if (arr1[arr1Counter].length() < arr2[arr2Counter].length()) {
                result[i] = arr1[arr1Counter];
                arr1Counter++;
            } else {
                result[i] = arr2[arr2Counter];
                arr2Counter++;
            }
        }

        return result;
    }
}
