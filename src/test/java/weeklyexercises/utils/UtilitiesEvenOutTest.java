package weeklyexercises.utils;

import java.io.FileNotFoundException;
import org.junit.jupiter.api.Test;
import weeklyexercises.part01_exercises.utils.ExerciseUtilities;
import weeklyexercises.part01_exercises.utils.FileHandlingUtilities;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author michelle
 */
public class UtilitiesEvenOutTest {

    public UtilitiesEvenOutTest() {
    }

    /**
      * Test of evenOut method, of class ExerciseUtilities.
      */

    @Test
    public void testEvenOut_SomeNegative()
    {
        System.out.println("Testing the evenOut method where some elements negative");
        int [] expectedResult = {-2, -4, -6, 8, 10};
        int[] nums = {-1, -4, -3, 8, 5};
        ExerciseUtilities.evenOut(nums);
        assertArrayEquals(expectedResult, nums);
    }

    @Test
    public void testEvenOut_SomeOdd()
    {
        System.out.println("Testing the evenOut method where some elements are odd");
        int [] expectedResult = {2, 4, 6, 8, 10};
        int[] nums = {1, 4, 3, 8, 5};
        ExerciseUtilities.evenOut(nums);
        assertArrayEquals(expectedResult, nums);
    }

    @Test
    public void testEvenOut_NoneOdd()
    {
        System.out.println("Testing the evenOut method where no elements are odd");
        int [] expectedResult = {2, 4, 6, 8, 10};
        int[] nums = {2, 4, 6, 8, 10};
        ExerciseUtilities.evenOut(nums);
        assertArrayEquals(expectedResult, nums);
    }

    @Test
    public void testEvenOut_AllOdd()
    {
        System.out.println("Testing the evenOut method where all elements are odd");
        int [] expectedResult = {2, 6, 10, 14, 18};
        int[] nums = {1, 3, 5, 7, 9};
        ExerciseUtilities.evenOut(nums);
        assertArrayEquals(expectedResult, nums);
    }

    @Test
    public void testEvenOutUsingInputFile2() throws FileNotFoundException
    {
        System.out.println("Testing evenOut using input file2 as parameters");
        int [] fileNumbers = FileHandlingUtilities.readNumericFile("SampleInput/Part1SampleInput2.txt");

        int [] expectedResult = FileHandlingUtilities.readNumericFile("SampleInput/Part1SampleInput2EvenOutResults" +
                ".txt");

        ExerciseUtilities.evenOut(fileNumbers);
        assertArrayEquals(expectedResult, fileNumbers);
    }
}
