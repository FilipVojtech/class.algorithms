package weeklyexercises.part05_exercises.utils;

import cz.filipvojtech.classes_from_michelle.Book;
import cz.filipvojtech.util.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static cz.filipvojtech.util.Array.copy;

/**
 * @author michelle
 * @author Filip Vojtěch
 */
public class BookUtilities {
    /**
     * Shrinks an array to a new length and returns it
     *
     * @param array     The array to shrink
     * @param newLength The new length of the array
     * @return Shrunk array
     */
    public static Book[] shrink(Book[] array, int newLength) {
        if (newLength < 0) {
            return array;
        }
        return copy(Book.class, array, 0, newLength);
    }

    /**
     * Removes duplicates from an array and returns it. Blanks are removed.
     *
     * @param array The array to deduplicate from
     * @return Array without duplicates
     */
    public static Book[] deduplicateUnsorted(Book[] array) {
        if (array == null) {
            return null;
        }
        Book[] result = new Book[array.length];
        int t = 0;

        for (var book : array) {
            if (!Array.contains(result, book)) {
                result[t] = book;
                t++;
            }
        }
        return copy(Book.class, result, t);
    }

    /**
     * Checks if a sorted array is in ascending order.
     *
     * @param array The array to check
     * @return True if the array is in ascending order, false otherwise
     */
    public static boolean isSortedAsc(Book[] array) {
        if (array == null) {
            return true;
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(array[i - 1]) < 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Removes duplicates from sorted array in ascending order.
     * This method uses the array grow method.
     *
     * @param array The array to remove duplicates from
     * @return Array without duplicates
     */
    public static Book[] deduplicateSorted(Book[] array) {
        if (array == null) {
            return null;
        }
        if (array.length < 2) {
            return array;
        }
        if (!isSortedAsc(array)) {
            Arrays.sort(array);
        }
        Book[] result = new Book[1];
        int t = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (!array[i].equals(array[i + 1])) {
                result = Array.growArray(Book.class, result, 1);
                result[t] = array[i];
                t++;
            }
        }
        result[t] = array[array.length - 1];

        return result;
    }

    public static ArrayList<Book> deduplicateList(List<Book> list) {
        if (list == null) {
            return null;
        }
        var result = new ArrayList<Book>();
        for (var item : list) {
            if (!result.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }
}
