package weeklyexercises.part03_exercises.utils;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author michelle
 */
public class StringUtilitiesPartitionTest {

    public StringUtilitiesPartitionTest() {
    }

    /**
     * Test of partition method, of class StringUtilities.
     */
    @Test
    public void testPartition() {
        System.out.println("Testing partition method with empty array");
        String[] text = {};
        String pivot = "Test";
        String [] expResult = {};
        String [] result = StringUtilities.partition(text, pivot);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testPartitionWithOneElement() {
        System.out.println("Testing partition method with single element in array");
        String[] text = {"Hello"};
        String pivot = "Test";
        String [] expResult = {"Hello"};
        String [] result = StringUtilities.partition(text, pivot);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testPartitionWithTwoElements() {
        System.out.println("Testing partition method with two elements in array");
        String[] text = {"Hello", "Stranger"};
        String pivot = "Mayday";
        String [] expResult = {"Stranger", "Hello"};
        String [] result = StringUtilities.partition(text, pivot);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testPartitionWithTwoElementsIgnoringCase() {
        System.out.println("Testing partition method with two elements in array - confirming case irrelevance");
        String[] text = {"Hello", "stranger"};
        String pivot = "Mayday";
        String [] expResult = {"stranger", "Hello"};
        String [] result = StringUtilities.partition(text, pivot);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testPartitionWithMultipleElements() {
        System.out.println("Testing partition method with multiple elements in array");
        String[] text = {"Hello", "Stranger", "It's", "Nice", "To", "See", "You"};
        String pivot = "Mayday";
        String [] expResult = {"Stranger", "Nice", "To", "See", "You", "Hello", "It's"};
        String [] result = StringUtilities.partition(text, pivot);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testPartitionWithMultipleElementsIgnoringCase() {
        System.out.println("Testing partition method with multiple elements in array - confirming case irrelevance");
        String[] text = {"Hello", "stranger", "it's", "Nice", "to", "See", "You"};
        String pivot = "Mayday";
        String [] expResult = {"stranger", "Nice", "to", "See", "You", "Hello", "it's"};
        String [] result = StringUtilities.partition(text, pivot);
        assertArrayEquals(expResult, result);
    }
}
