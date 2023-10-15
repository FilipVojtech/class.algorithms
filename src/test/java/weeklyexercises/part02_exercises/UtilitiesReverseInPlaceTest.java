package weeklyexercises.part02_exercises;

import org.junit.jupiter.api.Test;
import weeklyexercises.part02_exercises.utils.ExerciseUtilities;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author michelle
 */
public class UtilitiesReverseInPlaceTest {

    public UtilitiesReverseInPlaceTest() {
    }

    /**
     * Test of reverseInPlace method, of class ExerciseUtilities.
     */
    @Test
    public void testReverseInPlace() {
        System.out.println("Testing reverseInPlace");
        int[] nums = {1, 2, 3, 4, 5};
        int[] expResult = {5, 4, 3, 2, 1};
        ExerciseUtilities.reverseInPlace(nums);
        assertArrayEquals(expResult, nums);
    }

    @Test
    public void testReverseInPlaceEmptyArray() {
        System.out.println("Testing reverseInPlace with an empty array");
        int[] nums = {};
        int[] expResult = {};
        ExerciseUtilities.reverseInPlace(nums);
        assertArrayEquals(expResult, nums);
    }

    @Test
    public void testReverseInPlaceNullArray() {
        System.out.println("Testing reverseinPlace where array supplied is null");
        int[] nums = null;

        assertThrows(NullPointerException.class, () -> {
            ExerciseUtilities.reverseInPlace(nums);
        }, "NullPointerException was expected");
    }
}
