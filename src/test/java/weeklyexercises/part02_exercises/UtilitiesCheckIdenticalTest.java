package weeklyexercises.part02_exercises;

import org.junit.jupiter.api.Test;
import weeklyexercises.part02_exercises.utils.ExerciseUtilities;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author michelle
 */
public class UtilitiesCheckIdenticalTest {

    public UtilitiesCheckIdenticalTest() {
    }
    /**
     * Test of checkIdentical method, of class ExerciseUtilities.
     */
    @Test
    public void testCheckIdentical() {
        System.out.println("Testing checkIdentical where both arrays are identical");
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 3, 4, 5};
        boolean expResult = true;
        boolean result = ExerciseUtilities.checkIdentical(nums1, nums2);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckIdenticalSameContentWrongOrder() {
        System.out.println("Testing checkIdentical where arrays contain the same data, but in a different order");
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {5, 4, 3, 2, 1};
        boolean expResult = false;
        boolean result = ExerciseUtilities.checkIdentical(nums1, nums2);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckIdenticalSameLengthDifferentContent() {
        System.out.println("Testing checkIdentical where arrays are same lengths, but different content");
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {12, 13, 14, 15, 16};
        boolean expResult = false;
        boolean result = ExerciseUtilities.checkIdentical(nums1, nums2);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckIdenticalDifferentFirstElement() {
        System.out.println("Testing checkIdentical where array content is the same, except for the first element");
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {-1, 2, 3, 4, 5};
        boolean expResult = false;
        boolean result = ExerciseUtilities.checkIdentical(nums1, nums2);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckIdenticalDifferentLastElement() {
        System.out.println("Testing checkIdentical where array content is the same, except for the last element");
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 3, 4, 50};
        boolean expResult = false;
        boolean result = ExerciseUtilities.checkIdentical(nums1, nums2);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckIdenticalFirstArrayEmpty() {
        System.out.println("Testing checkIdentical where first array is empty");
        int[] nums1 = {};
        int[] nums2 = {1, 2, 3, 4, 5};
        boolean expResult = false;
        boolean result = ExerciseUtilities.checkIdentical(nums1, nums2);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckIdenticalFirstArrayNull() {
        System.out.println("Testing checkIdentical where first array is null");
        int[] nums1 = null;
        int[] nums2 = {1, 2, 3, 4, 5};
        boolean expResult = false;
        boolean result = ExerciseUtilities.checkIdentical(nums1, nums2);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckIdenticalSecondArrayEmpty() {
        System.out.println("Testing checkIdentical where second array is empty");
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {};
        boolean expResult = false;
        boolean result = ExerciseUtilities.checkIdentical(nums1, nums2);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckIdenticalSecondArrayNull() {
        System.out.println("Testing checkIdentical where second array is null");
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = null;
        boolean expResult = false;
        boolean result = ExerciseUtilities.checkIdentical(nums1, nums2);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckIdenticalBothArraysEmpty() {
        System.out.println("Testing checkIdentical where both arrays are empty");
        int[] nums1 = {};
        int[] nums2 = {};
        boolean expResult = true;
        boolean result = ExerciseUtilities.checkIdentical(nums1, nums2);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckIdenticalBothArraysNull() {
        System.out.println("Testing checkIdentical where both arrays are null");
        int[] nums1 = null;
        int[] nums2 = null;
        boolean expResult = true;
        boolean result = ExerciseUtilities.checkIdentical(nums1, nums2);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckIdenticalDifferentLengthArraysSameContent() {
        System.out.println("Testing checkIdentical where arrays are different lengths, but the same to the end of the shorter one");
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean expResult = false;
        boolean result = ExerciseUtilities.checkIdentical(nums1, nums2);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckIdenticalDifferentLengthArraysDifferentContent() {
        System.out.println("Testing checkIdentical where arrays are different lengths and contain different things");
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {8, 9, 10, 11, -1, -4, 6};
        boolean expResult = false;
        boolean result = ExerciseUtilities.checkIdentical(nums1, nums2);
        assertEquals(expResult, result);
    }
}
