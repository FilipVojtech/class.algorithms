/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package weeklyexercises.part06_exercise.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import weeklyexercises.part_06_exercise.utils.NumberUtilities;

/**
 *
 * @author michelle
 */
public class NumberUtilitiesIsSortedAscTest {

    public NumberUtilitiesIsSortedAscTest() {
    }
/**
     * Test of isSortedAsc method, of class NumberUtilities.
     */
    @Test
    public void testIsSortedAsc_SortedArray_NoRun() {
        System.out.println("isSortedAsc() testing with a sorted array without a run of values");
        int[] nums = {1, 2, 3, 4, 5};
        boolean expResult = true;
        boolean result = NumberUtilities.isSortedAsc(nums);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsSortedAsc_SortedArray_RunIncluded() {
        System.out.println("isSortedAsc() testing with a sorted array with a run of values");
        int[] nums = {1, 2, 3, 3, 3, 4, 4, 5};
        boolean expResult = true;
        boolean result = NumberUtilities.isSortedAsc(nums);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsSortedAsc_PartiallySortedArray() {
        System.out.println("isSortedAsc() testing with a partially sorted array");
        int[] nums = {1, 2, 3, 2, 1, 4, 5};
        boolean expResult = false;
        boolean result = NumberUtilities.isSortedAsc(nums);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsSortedAsc_RandomArray() {
        System.out.println("isSortedAsc() testing with an array of random values");
        int[] nums = {23, 1, 24, 35, 56, 78, 23, 1};
        boolean expResult = false;
        boolean result = NumberUtilities.isSortedAsc(nums);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsSortedAsc_EmptyArray() {
        System.out.println("isSortedAsc() testing with an empty array");
        int[] nums = {};
        boolean expResult = true;
        boolean result = NumberUtilities.isSortedAsc(nums);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsSortedAsc_ArrayWithOneValue() {
        System.out.println("isSortedAsc() testing with an array containing only one value");
        int[] nums = {15};
        boolean expResult = true;
        boolean result = NumberUtilities.isSortedAsc(nums);
        assertEquals(expResult, result);
    }
}
