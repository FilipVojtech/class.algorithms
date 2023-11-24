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
public class BookUtilitiesShrink {

    public BookUtilitiesShrink() {
    }

    /**
     * Test of shrink method, of class StringUtilities, with a populated array and no values to be kept.
     */
    @Test
    public void testShrinkNoValues() {
        System.out.println("shrink on a populated array with no values to be kept");
        Book b1 = new Book("Jane Eyre", "Charlotte Bronte", 402);
        Book b2 = new Book("Percy Jackson and the Battle of the Labyrinth", "Rick Riordan", 450);
        Book b3 = new Book("Percy Jackson and the Chalice of the Gods", "Rick Riordan", 556);
        Book[] data = {b1, b2, b3};
        Book[] expResult = new Book [0];
        Book[] result = BookUtilities.shrink(data, 0);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of shrink method, of class StringUtilities, with a populated array and one value to be kept.
     */
    @Test
    public void testShrinkOneValue() {
        System.out.println("shrink on a populated array with one value to be kept");
        Book b1 = new Book("Jane Eyre", "Charlotte Bronte", 402);
        Book b2 = new Book("Percy Jackson and the Battle of the Labyrinth", "Rick Riordan", 450);
        Book b3 = new Book("Percy Jackson and the Chalice of the Gods", "Rick Riordan", 556);
        Book[] data = {b1, b2, b3};
        Book[] expResult = {b1};
        Book[] result = BookUtilities.shrink(data, 1);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of shrink method, of class StringUtilities, with a populated array and multiple values to be kept.
     */
    @Test
    public void testShrinkMultiValues() {
        System.out.println("shrink on a populated array with multiple values to be kept");
        Book b1 = new Book("Jane Eyre", "Charlotte Bronte", 402);
        Book b2 = new Book("Percy Jackson and the Battle of the Labyrinth", "Rick Riordan", 450);
        Book b3 = new Book("Percy Jackson and the Chalice of the Gods", "Rick Riordan", 556);
        Book b4 = new Book("Percy Jackson and the Last Olympian", "Rick Riordan", 502);
        Book b5 = new Book("Percy Jackson and the Lightning Thief", "Rick Riordan", 345);

        Book[] data = {b1, b2, b3, b4, b5};
        Book[] expResult = {b1, b2, b3};
        Book[] result = BookUtilities.shrink(data, 3);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of shrink method, of class StringUtilities, with a populated array and too many values requested to be kept.
     */
    @Test
    public void testShrinkAllValues() {
        System.out.println("shrink on a populated array with all values requested to be kept");
        Book b1 = new Book("Jane Eyre", "Charlotte Bronte", 402);
        Book b2 = new Book("Percy Jackson and the Battle of the Labyrinth", "Rick Riordan", 450);
        Book b3 = new Book("Percy Jackson and the Chalice of the Gods", "Rick Riordan", 556);
        Book b4 = new Book("Percy Jackson and the Last Olympian", "Rick Riordan", 502);
        Book b5 = new Book("Percy Jackson and the Lightning Thief", "Rick Riordan", 345);

        Book[] data = {b1, b2, b3, b4, b5};
        Book[] expResult = {b1, b2, b3, b4, b5};
        Book[] result = BookUtilities.shrink(data, 5);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of shrink method, of class StringUtilities, with a populated array and too many values requested to be kept.
     */
    @Test
    public void testShrinkTooManyValues() {
        System.out.println("shrink on a populated array with too many values requested to be kept");
        Book b1 = new Book("Jane Eyre", "Charlotte Bronte", 402);
        Book b2 = new Book("Percy Jackson and the Battle of the Labyrinth", "Rick Riordan", 450);
        Book b3 = new Book("Percy Jackson and the Chalice of the Gods", "Rick Riordan", 556);
        Book b4 = new Book("Percy Jackson and the Last Olympian", "Rick Riordan", 502);
        Book b5 = new Book("Percy Jackson and the Lightning Thief", "Rick Riordan", 345);

        Book[] data = {b1, b2, b3, b4, b5};
        Book[] expResult = {b1, b2, b3, b4, b5};
        Book[] result = BookUtilities.shrink(data, 8);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of shrink method, of class StringUtilities, with a populated array and a negative number of values requested to be kept.
     */
    @Test
    public void testShrinkNegativeNumValues() {
        System.out.println("shrink on a populated array with a negative number of values requested to be kept");
        Book b1 = new Book("Jane Eyre", "Charlotte Bronte", 402);
        Book b2 = new Book("Percy Jackson and the Battle of the Labyrinth", "Rick Riordan", 450);
        Book b3 = new Book("Percy Jackson and the Chalice of the Gods", "Rick Riordan", 556);
        Book b4 = new Book("Percy Jackson and the Last Olympian", "Rick Riordan", 502);
        Book b5 = new Book("Percy Jackson and the Lightning Thief", "Rick Riordan", 345);

        Book[] data = {b1, b2, b3, b4, b5};
        Book[] expResult = {b1, b2, b3, b4, b5};
        Book[] result = BookUtilities.shrink(data, -1);
        assertArrayEquals(expResult, result);
    }
}
