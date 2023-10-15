package weeklyexercises.part02_exercises;

import org.junit.jupiter.api.Test;
import weeklyexercises.part02_exercises.utils.ExerciseUtilities;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author michelle
 */
public class UtilitiesReverseTest {

    public UtilitiesReverseTest() {
    }

    /**
     * Test of reverse method, of class ExerciseUtilities.
     */
    @Test
    public void testReverse() {
        System.out.println("Testing reverse");
        int[] nums = {1, 2, 3, 4, 5};
        int[] expResult = {5, 4, 3, 2, 1};
        int[] result = ExerciseUtilities.reverse(nums);
        assertArrayEquals(expResult, result);
        int[] origArray = {1, 2, 3, 4, 5};
        assertArrayEquals(origArray, nums);
    }

    @Test
    public void testReverseEmptyArray() {
        System.out.println("Testing reverse with an empty array");
        int[] nums = {};
        int[] expResult = {};
        int[] result = ExerciseUtilities.reverse(nums);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testReverseNullArray() {
        System.out.println("Testing reverse where array supplied is null");
        int[] nums = null;

        assertThrows(NullPointerException.class, () -> {
            ExerciseUtilities.reverse(nums);
        }, "NullPointerException was expected");
    }
}
