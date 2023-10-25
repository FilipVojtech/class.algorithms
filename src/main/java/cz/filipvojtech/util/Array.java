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
}
