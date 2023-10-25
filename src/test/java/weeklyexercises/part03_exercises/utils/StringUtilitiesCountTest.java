/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package weeklyexercises.part03_exercises.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author michelle
 */
public class StringUtilitiesCountTest {

    public StringUtilitiesCountTest() {
    }

    /**
     * Test of count method, of class StringUtilities.
     */
    @Test
    public void testCount() {
        System.out.println("Testing count method with empty array");
        String[] text = {};
        String word = "Find";
        int expResult = 0;
        int result = StringUtilities.count(text, word);
        assertEquals(expResult, result);
    }

    @Test
    public void testCountWhereValueIsUnique() {
        System.out.println("Testing count method where value is unique");
        String[] text = {"Hello", "Hi", "Guten tag"};
        String word = "Hello";
        int expResult = 1;
        int result = StringUtilities.count(text, word);
        assertEquals(expResult, result);
    }

    @Test
    public void testCountWithDifferingCase() {
        System.out.println("Testing count method where value is in different case to data in array");
        String[] text = {"Hi", "Hello", "Guten tag"};
        String word = "hellO";
        int expResult = 1;
        int result = StringUtilities.count(text, word);
        assertEquals(expResult, result);
    }

    @Test
    public void testCountWithMultiplePresent() {
        System.out.println("Testing count method where value is present multiple times");
        String[] text = {"Hi", "Hello", "Guten tag", "Hello", "'allo", "Hello", "Hello"};
        String word = "Hello";
        int expResult = 4;
        int result = StringUtilities.count(text, word);
        assertEquals(expResult, result);
    }
}
