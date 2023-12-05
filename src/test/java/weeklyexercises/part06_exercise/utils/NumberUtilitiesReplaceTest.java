/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package weeklyexercises.part06_exercise.utils;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import weeklyexercises.part_06_exercise.utils.NumberUtilities;

/**
 *
 * @author michelle
 */
public class NumberUtilitiesReplaceTest {

    public NumberUtilitiesReplaceTest() {
    }

    /**
     * Tests of replace method, of class NumberUtilities.
     */
    @Test
    public void testReplaceWithValidValue() {
        System.out.println("testing replace() with a valid value");
        int[] nums = {1, 3, 5, 67, 23, 45, 21, 2, 3, 4, 3, 56, 3, 4, 1, 6};
        int replace = 3;
        int val = 999;
        int expResult = 4;
        int [ ]expArray = {1, 999, 5, 67, 23, 45, 21, 2, 999, 4, 999, 56, 999, 4, 1, 6};
        int result = NumberUtilities.replace(nums, replace, val);
        assertEquals(expResult, result);
        assertArrayEquals(expArray, nums);
    }

    @Test
    public void testReplaceWithInvalidValue() {
        System.out.println("testing replace() with an invalid value");
        int[] nums = {1, 3, 5, 67, 23, 45, 21, 2, 3, 4, 3, 56, 3, 4, 1, 6};
        int replace = 7;
        int val = 999;
        int expResult = 0;
        int [ ]expArray = {1, 3, 5, 67, 23, 45, 21, 2, 3, 4, 3, 56, 3, 4, 1, 6};
        int result = NumberUtilities.replace(nums, replace, val);
        assertEquals(expResult, result);
        assertArrayEquals(expArray, nums);
    }

    @Test
    public void testReplaceWithEmptyArray() {
        System.out.println("testing replace() on an empty array");
        int[] nums = {};
        int replace = 7;
        int val = 999;
        int expResult = 0;
        int [ ]expArray = {};
        int result = NumberUtilities.replace(nums, replace, val);
        assertEquals(expResult, result);
        assertArrayEquals(expArray, nums);
    }

    @Test
    public void testReplaceWithArrayOfAllSameValue() {
        System.out.println("testing replace() where array is full of the value repeating");
        int[] nums = {1,1,1,1,1,1,1,1,1,1};
        int replace = 1;
        int val = 999;
        int expResult = 10;
        int[] expArray = {999,999,999,999,999,999,999,999,999,999};
        int result = NumberUtilities.replace(nums, replace, val);
        assertEquals(expResult, result);
        assertArrayEquals(expArray, nums);
    }
}
