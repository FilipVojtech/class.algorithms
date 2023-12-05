package weeklyexercises.part06_exercise.utils;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import weeklyexercises.part_06_exercise.utils.NumberUtilities;

/**
 *
 * @author michelle
 */
public class NumberUtilitiesShiftInsertTest {

    public NumberUtilitiesShiftInsertTest() {
    }

    /**
     * Test of shiftInsert method, of class NumberUtilities.
     */
    @Test
    public void testShiftInsert_SortedArray_InsertAtStart() {
        System.out.println("shiftInsert() testing inserting into the start of a sorted array");
        int[] nums = {10, 20, 30, 45, 50};
        int val = 0;
        boolean expResult = true;
        int [] expArray = {0, 10, 20, 30, 45};
        boolean result = NumberUtilities.shiftInsert(nums, val);
        // Confirm it returned correctly
        assertEquals(expResult, result);
        // Confirm it edited the array as expected
        assertArrayEquals(expArray, nums);
    }

    @Test
    public void testShiftInsert_SortedArray_InsertIntoMiddle() {
        System.out.println("shiftInsert() testing inserting into the middle of a sorted array");
        int[] nums = {10, 20, 30, 45, 50};
        int val = 35;
        boolean expResult = true;
        int [] expArray = {10, 20, 30, 35, 45};
        boolean result = NumberUtilities.shiftInsert(nums, val);
        // Confirm it returned correctly
        assertEquals(expResult, result);
        // Confirm it edited the array as expected
        assertArrayEquals(expArray, nums);
    }

    @Test
    public void testShiftInsert_SortedArray_InsertToBecomeEnd() {
        System.out.println("shiftInsert() testing inserting at the end of a sorted array");
        int[] nums = {10, 20, 30, 45, 50};
        int val = 49;
        boolean expResult = true;
        int [] expArray = {10, 20, 30, 45, 49};
        boolean result = NumberUtilities.shiftInsert(nums, val);
        // Confirm it returned correctly
        assertEquals(expResult, result);
        // Confirm it edited the array as expected
        assertArrayEquals(expArray, nums);
    }

    @Test
    public void testShiftInsert_SortedArray_InsertAfterEnd() {
        System.out.println("shiftInsert() testing inserting after the end of a sorted array");
        int[] nums = {10, 20, 30, 45, 50};
        int val = 51;
        boolean expResult = false;
        int [] expArray = {10, 20, 30, 45, 50};
        boolean result = NumberUtilities.shiftInsert(nums, val);
        // Confirm it returned correctly
        assertEquals(expResult, result);
        // Confirm it edited the array as expected
        assertArrayEquals(expArray, nums);
    }

    @Test
    public void testShiftInsert_DescArray() {
        System.out.println("shiftInsert() testing inserting into a descending array");
        int[] nums = {298, 297, 296, 295, 294};
        int val = 51;
        boolean expResult = false;
        int [] expArray = {298, 297, 296, 295, 294};
        boolean result = NumberUtilities.shiftInsert(nums, val);
        // Confirm it returned correctly
        assertEquals(expResult, result);
        // Confirm it edited the array as expected
        assertArrayEquals(expArray, nums);
    }

    @Test
    public void testShiftInsert_PartiallySortedArray() {
        System.out.println("shiftInsert() testing inserting into a partially sorted array");
        int[] nums = {60, 50, 10, 20, 30, 45, 50};
        int val = 51;
        boolean expResult = false;
        int [] expArray = {60, 50, 10, 20, 30, 45, 50};
        boolean result = NumberUtilities.shiftInsert(nums, val);
        // Confirm it returned correctly
        assertEquals(expResult, result);
        // Confirm it edited the array as expected
        assertArrayEquals(expArray, nums);
    }

    @Test
    public void testShiftInsert_EmptyArray() {
        System.out.println("shiftInsert() testing inserting into an empty array");
        int[] nums = {};
        int val = 51;
        boolean expResult = false;
        int [] expArray = {};
        boolean result = NumberUtilities.shiftInsert(nums, val);
        // Confirm it returned correctly
        assertEquals(expResult, result);
        // Confirm it edited the array as expected
        assertArrayEquals(expArray, nums);
    }

    @Test
    public void testShiftInsert_SingleElementArray_Smaller() {
        System.out.println("shiftInsert() testing inserting into an array with one (smaller) element");
        int[] nums = {50};
        int val = 51;
        boolean expResult = false;
        int [] expArray = {50};
        boolean result = NumberUtilities.shiftInsert(nums, val);
        // Confirm it returned correctly
        assertEquals(expResult, result);
        // Confirm it edited the array as expected
        assertArrayEquals(expArray, nums);
    }

    @Test
    public void testShiftInsert_SingleElementArray_Larger() {
        System.out.println("shiftInsert() testing inserting into an array with one (larger) element");
        int[] nums = {55};
        int val = 51;
        boolean expResult = true;
        int [] expArray = {51};
        boolean result = NumberUtilities.shiftInsert(nums, val);
        // Confirm it returned correctly
        assertEquals(expResult, result);
        // Confirm it edited the array as expected
        assertArrayEquals(expArray, nums);
    }
}
