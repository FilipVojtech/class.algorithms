package weeklyexercises.part02_exercises;

import org.junit.jupiter.api.Test;
import weeklyexercises.part02_exercises.utils.ExerciseUtilities;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author michelle
 */
public class UtilitiesGetFirstPosTest {

    public UtilitiesGetFirstPosTest() {
    }

    /**
     * Test of getFirstPos method, of class ExerciseUtilities.
     */
    @Test
    public void testGetFirstPos() {
        System.out.println("Testing getFirstPos where value is in first position");
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int value = 1;
        int expResult = 0;
        int result = ExerciseUtilities.getFirstPos(nums, value);
        assertEquals(expResult, result);

    }

    @Test
    public void testGetFirstPosMultipleOfSameValue() {
        System.out.println("Testing getFirstPos where value appears in more than one position");
        int[] nums = {1, 2, 1, 3, 1, 4, 1, 5, 1, 6};
        int value = 1;
        int expResult = 0;
        int result = ExerciseUtilities.getFirstPos(nums, value);
        assertEquals(expResult, result);

    }

    @Test
    public void testGetFirstPosNoInstancePresent() {
        System.out.println("Testing getFirstPos where value is not present in array");
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int value = 20;
        int expResult = -1;
        int result = ExerciseUtilities.getFirstPos(nums, value);
        assertEquals(expResult, result);

    }

    @Test
    public void testGetFirstPosWithEmptyArray() {
        System.out.println("Testing getFirstPos where supplied array is empty");
        int[] nums = {};
        int value = 1;
        int expResult = -1;
        int result = ExerciseUtilities.getFirstPos(nums, value);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetFirstPosSeekingNegativeValue() {
        System.out.println("Testing getFirstPos where value being sought is negative");
        int[] nums = {-1, -2, -3, -4, -5, 1, 2, 3, 4, 5};
        int value = -1;
        int expResult = 0;
        int result = ExerciseUtilities.getFirstPos(nums, value);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetFirstPosValueInLastSlot() {
        System.out.println("Testing getFirstPos where value is in last position");
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int value = 10;
        int expResult = 9;
        int result = ExerciseUtilities.getFirstPos(nums, value);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetFirstNullArray() {
        System.out.println("Testing getFirstPos where array supplied is null");
        int[] nums = null;
        int value = 10;

        assertThrows(NullPointerException.class, () -> {ExerciseUtilities.getFirstPos(nums, value);}, "NullPointerException was expected");
    }
}
