package weeklyexcercises.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 *
 * @author michelle
 */
public class UtilitiesFindLongestTest {

    public UtilitiesFindLongestTest()
    {
    }

    @Test
    public void testFindLongest(){
        System.out.println("Testing findLongest where only one element has the most characters");
        String [] textArray = {"five", "four", "seven", "one", "eleven", "fourteen"};

        String expResult = "fourteen";
        String result = ExerciseUtilities.findLongest(textArray);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindLongest_MultipleSameLength(){
        System.out.println("Testing findLongest where only multiple elements have the most characters");
        String [] textArray = {"five", "four", "seven", "one", "eleven", "fourteen", "eighteen"};

        String expResult = "fourteen";
        String result = ExerciseUtilities.findLongest(textArray);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindLongest_EmptyArray(){
        System.out.println("Testing findLongest where the array is empty");
        String [] textArray = {};

        String expResult = null;
        String result = ExerciseUtilities.findLongest(textArray);
        assertEquals(expResult, result);
    }

    /**
     * Test of findLongest method, of class ExerciseUtilities.
     */
    @Test
    public void testFindLongestUsingInputFile3()
    {
        System.out.println("Testing findLongest using input file3 as parameters");
        String [] fileText = FileHandlingUtilities.readTextFile("SampleInput/Part1SampleInput3.txt");

        String expResult = "Cras gravida, enim sit amet dapibus condimentum, leo purus dapibus velit, at rhoncus ex turpis semper lectus.";
        String result = ExerciseUtilities.findLongest(fileText);
        assertEquals(expResult, result);
    }
}
