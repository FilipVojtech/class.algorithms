package weeklyexcercises.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author michelle
 */
public class UtilitiesIsOddTest {

    public UtilitiesIsOddTest() {
    }

        /**
     * Test of isOdd method, of class ExerciseUtilities.
     */
    @Test
    public void testIsOddUsingZero()
    {
        System.out.println("Testing isOdd using 0 as parameter");
        int num = 0;
        boolean expResult = false;
        boolean result = ExerciseUtilities.isOdd(num);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsOddUsingNegativeOddNum()
    {
        System.out.println("Testing isOdd using a negative odd number as a parameter");
        int num = -3;
        boolean expResult = true;
        boolean result = ExerciseUtilities.isOdd(num);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsOddUsingNegativeEvenNum()
    {
        System.out.println("Testing isOdd using a negative even number as a parameter");
        int num = -4;
        boolean expResult = false;
        boolean result = ExerciseUtilities.isOdd(num);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsOddUsingPositiveOddNum()
    {
        System.out.println("Testing isOdd using a positive odd number as a parameter");
        int num = 15;
        boolean expResult = true;
        boolean result = ExerciseUtilities.isOdd(num);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsOddUsingPositiveEvenNum()
    {
        System.out.println("Testing isOdd using a positive even number as a parameter");
        int num = 612;
        boolean expResult = false;
        boolean result = ExerciseUtilities.isOdd(num);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsOddUsingInputFile1() throws FileNotFoundException
    {
        System.out.println("Testing isOdd using input file1 as parameters");

        String filename = "SampleInput/Part1SampleInput1.txt";
        Scanner inputFile = new Scanner(new FileReader(filename));

        String resultsFilename = "SampleInput/Part1SampleInput1Results.txt";
        Scanner resultsFile = new Scanner(new FileReader(resultsFilename));
        while(inputFile.hasNextInt() && resultsFile.hasNextBoolean()){
            int num = inputFile.nextInt();
            boolean expResult = resultsFile.nextBoolean();
            boolean result = ExerciseUtilities.isOdd(num);
            assertEquals(expResult, result);
        }
    }

    @Test
    public void testIsOddUsingInputFile2() throws FileNotFoundException
    {
        System.out.println("Testing isOdd using input file2 as parameters");

        String filename = "SampleInput/Part1SampleInput2.txt";
        Scanner inputFile = new Scanner(new FileReader(filename));

        String resultsFilename = "SampleInput/Part1SampleInput2Results.txt";
        Scanner resultsFile = new Scanner(new FileReader(resultsFilename));
        while(inputFile.hasNextInt() && resultsFile.hasNextBoolean()){
            int num = inputFile.nextInt();
            boolean expResult = resultsFile.nextBoolean();
            boolean result = ExerciseUtilities.isOdd(num);
            assertEquals(expResult, result);
        }
    }

}
