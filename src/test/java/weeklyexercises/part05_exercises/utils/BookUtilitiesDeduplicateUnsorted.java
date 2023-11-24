/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package weeklyexercises.part05_exercises.utils;

import cz.filipvojtech.classes_from_michelle.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 *
 * @author michelle
 */
public class BookUtilitiesDeduplicateUnsorted {

    public BookUtilitiesDeduplicateUnsorted() {
    }

    @Test
    public void testDeduplicatedUnsorted_NullArray(){
        System.out.println("deduplicateUnsorted where a null array is supplied");
        Book[] data = null;
        Book [] expResult = null;

        Book [] result = BookUtilities.deduplicateUnsorted(data);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of deduplicateUnsorted method, of class BookUtilities, with an empty array.
     */
    @Test
    public void testDeduplicateUnsortedEmptyArray() {
        System.out.println("deduplicateUnsorted on an empty array");
        Book[] data = new Book [0];
        Book[] expResult = new Book [0];
        Book[] result = BookUtilities.deduplicateUnsorted(data);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of deduplicateUnsorted method, of class BookUtilities, with an array containing only one element.
     */
    @Test
    public void testDeduplicateUnsortedOneElementArray() {
        System.out.println("deduplicateUnsorted on an array with one element");
        Book b1 = new Book("Jane Eyre", "Charlotte Bronte", 402);
        Book [] data = {b1};
        Book [] expResult = {b1};
        Book [] result = BookUtilities.deduplicateUnsorted(data);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of deduplicateUnsorted method, of class BookUtilities, with an array containing multiple elements, but no duplicates.
     */
    @Test
    public void testDeduplicateUnsortedMultiElementArrayNoDuplicates() {
        System.out.println("deduplicateUnsorted on an array with multiple elements, but no duplicates");

        Book b1 = new Book("Percy Jackson and the Titan's Curse", "Rick Riordan", 402);
        Book b2 = new Book("Percy Jackson and the Sea of Monsters", "Rick Riordan", 334);
        Book b3 = new Book("Jane Eyre", "Charlotte Bronte", 402);
        Book b4 = new Book("Percy Jackson and the Battle of the Labyrinth", "Rick Riordan", 450);
        Book b5 = new Book("Percy Jackson and the Last Olympian", "Rick Riordan", 502);
        Book b6 = new Book("Percy Jackson and the Chalice of the Gods", "Rick Riordan", 556);
        Book b7 = new Book("The Sword of Summer", "Rick Riordan", 331);
        Book b8 = new Book("Percy Jackson and the Lightning Thief", "Rick Riordan", 345);

        Book [] data = FileHandlingUtilities.readBookFile("SampleInput/Part5UnsortedSampleBookInput.txt");
        Book [] expResult = {b1, b2, b3, b4, b5, b6, b7, b8};
        Book [] result = BookUtilities.deduplicateUnsorted(data);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of deduplicateUnsorted method, of class BookUtilities, with an array containing multiple elements and multiple duplicates.
     */
    @Test
    public void testDeduplicateUnsortedMultiElementArrayWithDuplicates() {
        System.out.println("deduplicateUnsorted on an array with multiple elements and including duplicates");

        Book b1 = new Book("Percy Jackson and the Sea of Monsters", "Rick Riordan", 334);
        Book b2 = new Book("Percy Jackson and the Titan's Curse", "Rick Riordan", 402);
        Book b3 = new Book("Percy Jackson and the Battle of the Labyrinth", "Rick Riordan", 450);
        Book b4 = new Book("Percy Jackson and the Lightning Thief", "Rick Riordan", 345);
        Book b5 = new Book("Jane Eyre", "Charlotte Bronte", 402);
        Book b6 = new Book("Percy Jackson and the Last Olympian", "Rick Riordan", 502);
        Book b7 = new Book("Percy Jackson and the Chalice of the Gods", "Rick Riordan", 556);
        Book b8 = new Book("The Sword of Summer", "Rick Riordan", 331);

        Book [] data = FileHandlingUtilities.readBookFile("SampleInput/Part5UnsortedSampleBookInputDuplicates.txt");
        Book [] expResult = {b1, b2, b3, b4, b5, b6, b7, b8};
        Book[] result = BookUtilities.deduplicateUnsorted(data);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of deduplicateUnsorted method, of class BookUtilities, with an array containing multiple elements (all duplicates).
     */
    @Test
    public void testDeduplicateUnsortedMultiElementArrayAllDuplicates() {
        System.out.println("deduplicateUnsorted on an array with multiple elements (all duplicates)");
        Book b1 = new Book("Percy Jackson and the Sea of Monsters", "Rick Riordan", 334);
        Book [] data = {b1, b1, b1, b1, b1, b1, b1, b1};
        Book [] expResult = {b1};
        Book [] result = BookUtilities.deduplicateUnsorted(data);
        assertArrayEquals(expResult, result);
    }
}
