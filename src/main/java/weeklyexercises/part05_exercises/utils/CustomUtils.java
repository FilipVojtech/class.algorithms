package weeklyexercises.part05_exercises.utils;

import cz.filipvojtech.classes_from_michelle.Book;

import java.util.ArrayList;
import java.util.Collection;

public class CustomUtils {
    /**
     * Convert an array to ArrayList
     * @param array Array of books to be converted into a list
     * @return ArrayList of books
     */
    public static ArrayList<Book> arrayToList(Book[] array) {
        ArrayList<Book> result = new ArrayList<Book>();
        for (var book : array) {
            result.add(book);
        }
        return result;
    }

    /**
     * Convert a list to printable string
     * @param data Array list of books to be converted
     * @param delimiter The delimiter to split the element by
     * @return String of formatted objects
     */
    public static String listToString(Collection<Book> data, String delimiter) {
        StringBuilder message = new StringBuilder();
        for (var book : data) {
            message.append(book.toString())
                    .append(delimiter);

        }
        return message.substring(0, message.length() - delimiter.length());
    }
}
