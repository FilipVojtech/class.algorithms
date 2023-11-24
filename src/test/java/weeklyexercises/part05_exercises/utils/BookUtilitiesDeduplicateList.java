/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package weeklyexercises.part05_exercises.utils;

import cz.filipvojtech.classes_from_michelle.Book;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author michelle
 */
public class BookUtilitiesDeduplicateList {

    public BookUtilitiesDeduplicateList() {
    }

    /**
     * Test of deduplicateList method, of class StringUtilities, on a list with multiple elements and no duplicates.
     */
    @Test
    public void testDeduplicateListEmptyList() {
        System.out.println("deduplicateList on an empty list");
        ArrayList<Book> data = new ArrayList();

        ArrayList<Book> expResult = new ArrayList();
        ArrayList<Book> result = BookUtilities.deduplicateList(data);
        assertEquals(expResult, result);
    }

    /**
     * Test of deduplicateList method, of class StringUtilities, on a list with one element.
     */
    @Test
    public void testDeduplicateListOneElement() {
        System.out.println("deduplicateList on a list with only one element");
        ArrayList<Book> data = new ArrayList();
        Book b = new Book("Moby Dick", "Herman Melville", 400);
        data.add(b);

        ArrayList<Book> expResult = new ArrayList();
        expResult.add(b);
        ArrayList<Book> result = BookUtilities.deduplicateList(data);
        assertEquals(expResult, result);
    }

    /**
     * Test of deduplicateList method, of class StringUtilities, on a list with multiple elements and no duplicates.
     */
    @Test
    public void testDeduplicateListNoDuplicates() {
        System.out.println("deduplicateList on a list with multiple elements and no duplicates");
        ArrayList<Book> data = new ArrayList();
        Book b1 = new Book("Percy Jackson and the Lightning Thief", "Rick Riordan", 323);
        Book b2 = new Book("Percy Jackson and the Sea of Monsters", "Rick Riordan", 353);
        Book b3 = new Book("Percy Jackson and the Titan's Curse", "Rick Riordan", 423);
        Book b4 = new Book("Percy Jackson and the Battle of the Labyrinth", "Rick Riordan", 472);
        Book b5 = new Book("Percy Jackson and the Last Olympian", "Rick Riordan", 463);
        data.add(b1);
        data.add(b2);
        data.add(b3);
        data.add(b4);
        data.add(b5);

        ArrayList<Book> expResult = new ArrayList();
        expResult.add(b1);
        expResult.add(b2);
        expResult.add(b3);
        expResult.add(b4);
        expResult.add(b5);
        ArrayList<Book> result = BookUtilities.deduplicateList(data);
        assertEquals(expResult, result);
    }

    /**
     * Test of deduplicateList method, of class StringUtilities, on a list with multiple elements and some duplicates.
     */
    @Test
    public void testDeduplicateListSomeDuplicates() {
        System.out.println("deduplicateList on a list with multiple elements and some duplicates");
        ArrayList<Book> data = new ArrayList();
        Book b1 = new Book("Percy Jackson and the Lightning Thief", "Rick Riordan", 323);
        Book b2 = new Book("Percy Jackson and the Lightning Thief", "Rick Riordan", 323);
        Book b3 = new Book("Percy Jackson and the Lightning Thief", "Rick Riordan", 323);
        Book b4 = new Book("Percy Jackson and the Sea of Monsters", "Rick Riordan", 353);
        Book b5 = new Book("Percy Jackson and the Titan's Curse", "Rick Riordan", 423);
        Book b6 = new Book("Percy Jackson and the Battle of the Labyrinth", "Rick Riordan", 472);
        Book b7 = new Book("Percy Jackson and the Last Olympian", "Rick Riordan", 463);
        Book b8 = new Book("Percy Jackson and the Titan's Curse", "Rick Riordan", 423);
        Book b9 = new Book("Percy Jackson and the Battle of the Labyrinth", "Rick Riordan", 472);
        Book b10 = new Book("Percy Jackson and the Lightning Thief", "Rick Riordan", 323);
        data.add(b1);
        data.add(b2);
        data.add(b3);
        data.add(b4);
        data.add(b5);
        data.add(b6);
        data.add(b7);
        data.add(b8);
        data.add(b9);
        data.add(b10);

        ArrayList<Book> expResult = new ArrayList();
        expResult.add(b1);
        expResult.add(b4);
        expResult.add(b5);
        expResult.add(b6);
        expResult.add(b7);
        ArrayList<Book> result = BookUtilities.deduplicateList(data);
        assertEquals(expResult, result);
    }

    /**
     * Test of deduplicateList method, of class StringUtilities, on a list containing all duplicates.
     */
    @Test
    public void testDeduplicateListAllDuplicates() {
        System.out.println("deduplicateList on a list with multiple elements and all duplicates");
        ArrayList<Book> data = new ArrayList();
        Book b1 = new Book("Percy Jackson and the Lightning Thief", "Rick Riordan", 323);
        Book b2 = new Book("Percy Jackson and the Lightning Thief", "Rick Riordan", 323);
        Book b3 = new Book("Percy Jackson and the Lightning Thief", "Rick Riordan", 323);
        data.add(b1);
        data.add(b2);
        data.add(b3);

        ArrayList<Book> expResult = new ArrayList();
        expResult.add(b1);
        ArrayList<Book> result = BookUtilities.deduplicateList(data);
        assertEquals(expResult, result);
    }

    @Test
    public void testDeduplicateListNullList() {
        System.out.println("deduplicateList on a null list");
        ArrayList<Book> data = null;
        ArrayList<Book> expResult = null;
        ArrayList<Book> result = BookUtilities.deduplicateList(data);
        assertEquals(expResult, result);
    }
}
