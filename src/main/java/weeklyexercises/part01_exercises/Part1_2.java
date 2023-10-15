package weeklyexercises.part01_exercises;

import weeklyexercises.part01_exercises.utils.FileHandlingUtilities;

import java.io.IOException;
import java.text.MessageFormat;

import static weeklyexercises.part01_exercises.utils.ExerciseUtilities.*;


/**
 * @author michelle
 */
public class Part1_2 {
    public static void main(String[] args) throws IOException {
        // Reading in a file of text
        // This will read in the file specified and return an array of the lines of text in the file
        String[] fileText = FileHandlingUtilities.readTextFile("SampleInput/Part1SampleInput3.txt");
//        for(String text: fileText){
//            System.out.println(text);
//        }
        System.out.println(MessageFormat.format("The longest string is:\n{0}", findLongest(fileText)));
    }

}
