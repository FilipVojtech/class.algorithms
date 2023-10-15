package weeklyexercises.part01_exercises;

import weeklyexercises.part01_exercises.utils.FileHandlingUtilities;

import java.text.MessageFormat;
import java.util.Arrays;

import static weeklyexercises.part01_exercises.utils.ExerciseUtilities.*;

/**
 * @author michelle
 */
public class Part1_1 {

    public static void main(String[] args) {
        // Reading in a file of numbers
        // This will read in the file specified and return an array containing all the numbers from that file
        int[] fileNumbers = FileHandlingUtilities.readNumericFile("SampleInput/Part1SampleInput2.txt");
        var odd = 0;
        for (int i : fileNumbers) {
//            System.out.println(i);
            if (isOdd(i)) odd++;
        }

        System.out.println(MessageFormat.format("You entered {0} even and {1} odd numbers", fileNumbers.length - odd, odd));
        System.out.println(Arrays.toString(fileNumbers));
        evenOut(fileNumbers);
        System.out.println(Arrays.toString(fileNumbers));

    }

}
