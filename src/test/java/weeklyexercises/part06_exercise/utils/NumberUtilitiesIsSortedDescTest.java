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
public class NumberUtilitiesIsSortedDescTest {

    public NumberUtilitiesIsSortedDescTest() {
    }
    /**
     * Test of isSortedDesc method, of class NumberUtilities.
     */
    @Test
    public void testIsSortedDesc_SortedArray_NoRun() {
        System.out.println("isSortedDesc() testing with a sorted array without a run of values");
        int[] nums = {5, 4, 3, 2, 1};
        boolean expResult = true;
        boolean result = NumberUtilities.isSortedDesc(nums);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsSortedDesc_SortedArray_RunIncluded() {
        System.out.println("isSortedDesc() testing with a sorted array with a run of values");
        int[] nums = {5, 4, 4, 4, 3, 2, 2, 1};
        boolean expResult = true;
        boolean result = NumberUtilities.isSortedDesc(nums);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsSortedDesc_PartiallySortedArray() {
        System.out.println("isSortedDesc() testing with a partially sorted array");
        int[] nums = {5, 4, 2, 3, 1};
        boolean expResult = false;
        boolean result = NumberUtilities.isSortedDesc(nums);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsSortedDesc_RandomArray() {
        System.out.println("isSortedDesc() testing with an array of random values");
        int[] nums = {23, 1, 24, 35, 56, 78, 23, 1};
        boolean expResult = false;
        boolean result = NumberUtilities.isSortedDesc(nums);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsSortedDesc_EmptyArray() {
        System.out.println("isSortedDesc() testing with an empty array");
        int[] nums = {};
        boolean expResult = true;
        boolean result = NumberUtilities.isSortedDesc(nums);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsSortedDesc_ArrayWithOneValue() {
        System.out.println("isSortedDesc() testing with an array containing only one value");
        int[] nums = {15};
        boolean expResult = true;
        boolean result = NumberUtilities.isSortedDesc(nums);
        assertEquals(expResult, result);
    }
}
