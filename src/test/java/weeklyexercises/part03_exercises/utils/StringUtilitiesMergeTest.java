/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package weeklyexercises.part03_exercises.utils;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author michelle
 */
public class StringUtilitiesMergeTest {

    public StringUtilitiesMergeTest() {
    }

    /**
     * Test of merge method, of class StringUtilities.
     */

    @Test
    public void testMerge() {
        System.out.println("Testing merge method");
        String[] text1 = {"Hello", "Hi there", "Good evening"};
        String [] text2 = {"Afternoon", "Hiya"};
        String [] expResult = {"Hello", "Hi there", "Good evening", "Afternoon", "Hiya"};
        String [] result = StringUtilities.merge(text1, text2, 3, 2);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testMergeTooHighCountArray1Elements() {
        System.out.println("Testing merge method where the number of elements to be used from array 1 is greater than the length of the array");
        String[] text1 = {"Hello", "Hi there", "Good evening"};
        String [] text2 = {"Afternoon", "Hiya"};
        String [] expResult = {"Hello", "Hi there", "Good evening", "Afternoon", "Hiya"};
        String [] result = StringUtilities.merge(text1, text2, 13, 2);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testMergeTooHighCountArray2Elements() {
        System.out.println("Testing merge method where the number of elements to be used from array 2 is greater than the length of the array");
        String[] text1 = {"Hello", "Hi there", "Good evening"};
        String [] text2 = {"Afternoon", "Hiya"};
        String [] expResult = {"Hello", "Hi there", "Good evening", "Afternoon", "Hiya"};
        String [] result = StringUtilities.merge(text1, text2, 3, 21);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testMergeMoreElementsThanSpecified() {
        System.out.println("Testing merge method where the number of elements in one array is more than the count to be used");
        String[] text1 = {"Hello", "Hi there", "Good evening"};
        String [] text2 = {"Afternoon", "Hiya"};
        String [] expResult = {"Hello", "Hi there", "Afternoon", "Hiya"};
        String [] result = StringUtilities.merge(text1, text2, 2, 2);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testMergeEmptyArrays() {
        System.out.println("Testing merge method with two empty arrays");
        String[] text1 = {};
        String [] text2 = {};
        String [] expResult = {};
        String [] result = StringUtilities.merge(text1, text2, 0, 0);
        assertArrayEquals(expResult, result);
    }

}
