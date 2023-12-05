/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package weeklyexercises.part06_exercise.utils;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;
import weeklyexercises.part_06_exercise.utils.NumberUtilities;

/**
 *
 * @author michelle
 */
public class NumberUtilitiesResizeInsertTest {

    public NumberUtilitiesResizeInsertTest() {
    }
    /**
     * Test of resizeInsert method, of class NumberUtilities.
     */
    // Check with:
    //  sorted desc at start
    //  sorted desc in middle
    //  sorted desc insert to become end
    //  sorted desc at end - rejection
    //  ascending array - rejection
    //  partially sorted array - rejection
    //  empty array - rejection
    //  one value (smaller)
    //  one value (larger) - rejection
    @Test
    public void testResizeInsert_InsertAtStart() {
        System.out.println("resizeInsert() testing inserting into the start of a sorted array");
        int[] nums = {20, 15, 12, 10, 7, 4};
        int val = 21;
        int[] expResult = {21, 20, 15, 12, 10, 7, 4};
        int[] result = NumberUtilities.resizeInsert(nums, val);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testResizeInsert_InsertInMiddle() {
        System.out.println("resizeInsert() testing inserting into the middle of a sorted array");
        int[] nums = {20, 15, 12, 10, 7, 4};
        int val = 11;
        int[] expResult = {20, 15, 12, 11, 10, 7, 4};
        int[] result = NumberUtilities.resizeInsert(nums, val);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testResizeInsert_InsertToBecomeEnd() {
        System.out.println("resizeInsert() testing inserting into the end of a sorted array");
        int[] nums = {20, 15, 12, 10, 7, 4};
        int val = 5;
        int[] expResult = {20, 15, 12, 10, 7, 5, 4};
        int[] result = NumberUtilities.resizeInsert(nums, val);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testResizeInsert_InsertAfterEnd() {
        System.out.println("resizeInsert() testing inserting after the end of a sorted array");
        int[] nums = {20, 15, 12, 10, 7, 4};
        int val = 3;
        int[] expResult = {20, 15, 12, 10, 7, 4};
        int[] result = NumberUtilities.resizeInsert(nums, val);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testResizeInsert_AscArray() {
        System.out.println("resizeInsert() testing inserting into an ascending array");
        int[] nums = {5, 6, 7, 8, 9, 10};
        int val = 3;
        int[] expResult = {5, 6, 7, 8, 9, 10};
        int[] result = NumberUtilities.resizeInsert(nums, val);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testResizeInsert_PartiallySortedArray() {
        System.out.println("resizeInsert() testing inserting into a partially sorted array");
        int[] nums = {20, 15, 12, 16, 17, 10, 7, 4};
        int val = 3;
        int[] expResult = {20, 15, 12, 16, 17, 10, 7, 4};
        int[] result = NumberUtilities.resizeInsert(nums, val);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testResizeInsert_EmptyArray() {
        System.out.println("resizeInsert() testing inserting into an empty array");
        int[] nums = {};
        int val = 3;
        int[] expResult = {};
        int[] result = NumberUtilities.resizeInsert(nums, val);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testResizeInsert_SingleElementArray_Smaller() {
        System.out.println("resizeInsert() testing inserting into an array holding a single (smaller) element");
        int[] nums = {2};
        int val = 3;
        int[] expResult = {3, 2};
        int[] result = NumberUtilities.resizeInsert(nums, val);
        assertArrayEquals(expResult, result);
    }


    @Test
    public void testResizeInsert_SingleElementArray_Larger() {
        System.out.println("resizeInsert() testing inserting into an array holding a single (larger) element");
        int[] nums = {5};
        int val = 3;
        int[] expResult = {5};
        int[] result = NumberUtilities.resizeInsert(nums, val);
        assertArrayEquals(expResult, result);
    }
}
