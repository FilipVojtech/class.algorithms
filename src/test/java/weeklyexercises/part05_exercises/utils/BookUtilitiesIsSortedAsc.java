/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package weeklyexercises.part05_exercises.utils;

import cz.filipvojtech.classes_from_michelle.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author michelle
 */
public class BookUtilitiesIsSortedAsc {

    public BookUtilitiesIsSortedAsc() {
    }

    @Test
    public void testIsSortedAscNullArray(){
        System.out.println("isSortedAsc with a null array");
        Book[] data = null;
        boolean expResult = true;
        boolean result = BookUtilities.isSortedAsc(data);
        assertEquals(expResult, result);
    }

    /**
     * Test of isSortedAsc method, of class BookUtilities, where array is empty.
     */
    @Test
    public void testIsSortedAscEmptyArray() {
        System.out.println("isSortedAsc with an empty array");
        Book [] data = {};
        boolean expResult = true;
        boolean result = BookUtilities.isSortedAsc(data);
        assertEquals(expResult, result);
    }

    /**
     * Test of isSortedAsc method, of class BookUtilities, where array is unsorted.
     */
    @Test
    public void testIsSortedAscUnsortedArray() {
        System.out.println("isSortedAsc where array is not sorted");
        Book b1 = new Book("Percy Jackson and the Titan's Curse", "Rick Riordan", 402);
        Book b2 = new Book("Percy Jackson and the Sea of Monsters", "Rick Riordan", 334);
        Book b3 = new Book("Jane Eyre", "Charlotte Bronte", 402);
        Book b4 = new Book("Percy Jackson and the Battle of the Labyrinth", "Rick Riordan", 450);
        Book b5 = new Book("Percy Jackson and the Last Olympian", "Rick Riordan", 502);
        Book b6 = new Book("Percy Jackson and the Chalice of the Gods", "Rick Riordan", 556);
        Book b7 = new Book("The Sword of Summer", "Rick Riordan", 331);
        Book b8 = new Book("Percy Jackson and the Lightning Thief", "Rick Riordan", 345);

        Book [] data = {b1, b2, b3, b4, b5, b6, b7, b8};
        boolean expResult = false;
        boolean result = BookUtilities.isSortedAsc(data);
        assertEquals(expResult, result);
    }

    /**
     * Test of isSortedAsc method, of class BookUtilities, where array is hard-coded and is partially sorted.
     */
    @Test
    public void testIsSortedAscPartiallySortedArray() {
        System.out.println("isSortedAsc where array is partially sorted");
        Book b1 = new Book("Jane Eyre", "Charlotte Bronte", 402);
        Book b2 = new Book("Percy Jackson and the Battle of the Labyrinth", "Rick Riordan", 450);
        Book b3 = new Book("Percy Jackson and the Chalice of the Gods", "Rick Riordan", 556);
        Book b4 = new Book("Percy Jackson and the Last Olympian", "Rick Riordan", 502);
        Book b5 = new Book("Percy Jackson and the Sea of Monsters", "Rick Riordan", 334);
        Book b6 = new Book("The Sword of Summer", "Rick Riordan", 331);
        Book b7 = new Book("Percy Jackson and the Lightning Thief", "Rick Riordan", 345);
        Book b8 = new Book("Percy Jackson and the Titan's Curse", "Rick Riordan", 402);

        Book [] data = {b1, b2, b3, b4, b5, b6, b7, b8};
        boolean expResult = false;
        boolean result = BookUtilities.isSortedAsc(data);
        assertEquals(expResult, result);
    }

    /**
     * Test of isSortedAsc method, of class BookUtilities, where array is pulled from a file and is partially sorted.
     */
    @Test
    public void testIsSortedAscPartiallySortedFileBasedArray() {
        System.out.println("isSortedAsc where array is pulled from a file and is partially sorted");
        Book [] data = FileHandlingUtilities.readBookFile("SampleInput/Part5PartiallySortedSampleBookInput.txt");
        boolean expResult = false;
        boolean result = BookUtilities.isSortedAsc(data);
        assertEquals(expResult, result);
    }

    /**
     * Test of isSortedAsc method, of class BookUtilities, where array is hard-coded and is sorted.
     */
    @Test
    public void testIsSortedAscSortedArray() {
        System.out.println("isSortedAsc where array is sorted");

        Book b1 = new Book("Jane Eyre", "Charlotte Bronte", 402);
        Book b2 = new Book("Percy Jackson and the Battle of the Labyrinth", "Rick Riordan", 450);
        Book b3 = new Book("Percy Jackson and the Chalice of the Gods", "Rick Riordan", 556);
        Book b4 = new Book("Percy Jackson and the Last Olympian", "Rick Riordan", 502);
        Book b5 = new Book("Percy Jackson and the Lightning Thief", "Rick Riordan", 345);
        Book b6 = new Book("Percy Jackson and the Sea of Monsters", "Rick Riordan", 334);
        Book b7 = new Book("Percy Jackson and the Titan's Curse", "Rick Riordan", 402);
        Book b8 = new Book("The Sword of Summer", "Rick Riordan", 331);

        Book [] data = {b1, b2, b3, b4, b5, b6, b7, b8};
        boolean expResult = true;
        boolean result = BookUtilities.isSortedAsc(data);
        assertEquals(expResult, result);
    }

    /**
     * Test of isSortedAsc method, of class BookUtilities, where array is pulled from a file and is sorted.
     */
    @Test
    public void testIsSortedAscSortedFileBasedArray() {
        System.out.println("isSortedAsc where array is pulled from a file and is sorted");
        Book [] data = FileHandlingUtilities.readBookFile("SampleInput/Part5SortedSampleBookInput.txt");
        boolean expResult = true;
        boolean result = BookUtilities.isSortedAsc(data);
        assertEquals(expResult, result);
    }
}
