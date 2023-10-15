package weeklyexercises.part02_exercises.utils;

public class ExerciseUtilities {
    /**
     * Finds the first position of a value in an array.
     * If the value is not found, -1 is returned instead.
     *
     * @param arr   Array of numbers to search through
     * @param value Value to look for
     * @return The index of the value or -1
     */
    public static int getFirstPos(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Finds the last position of a value in an array.
     * If the value is not found, -1 is returned instead.
     *
     * @param arr   Array of numbers to search through
     * @param value Value to look for
     * @return The index of the value or -1
     */
    public static int getLastPos(int[] arr, int value) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Check if the supplied arrays are the same
     *
     * @param arr1 First array
     * @param arr2 Second array
     * @return True if the arrays are identical, false otherwise
     */
    public static boolean checkIdentical(int[] arr1, int[] arr2) {
        if ((arr1 == null && arr2 == null)) {
            return true;
        } else if (arr1 == null || arr2 == null) {
            return false;
        }

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    /**
     * Reverses an array
     *
     * @param arr The array to be reversed
     * @return The reversed array.
     */
    public static int[] reverse(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length / 2 + 1; i++) {
            int rearOfArray = arr.length - 1 - i;

            newArr[i] = arr[rearOfArray];
            newArr[rearOfArray] = arr[i];
        }

        return newArr;
    }

    /**
     * Reverses an array in place
     *
     * @param arr The array to be reversed
     */
    public static void reverseInPlace(int[] arr) {
        int temp;

        for (int i = 0; i < arr.length / 2; i++) {
            int rearOfArray = arr.length - 1 - i;

            temp = arr[i];
            arr[i] = arr[rearOfArray];
            arr[rearOfArray] = temp;
        }
    }
}
