package number;
import Binarysearcher.BinarySearcher;
import Binarysearcher.Time;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class NumberTest {
    @Test
    public void theNumberShouldBeExistInTheList(){
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        int lastIndex = numbers.size() - 1;
        assertEquals(1, BinarySearcher.elementFinder(20, numbers, 0, lastIndex));
    }
    @Test
    public void theNumberShouldBeNotExistInTheList() {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        int lastIndex = numbers.size() - 1;
        assertEquals(-1, BinarySearcher.elementFinder(60, numbers, 0, lastIndex));
    }
    @Test
    public void theStringShouldBeExistInTheList(){
        List<String> strings = Arrays.asList("a", "b", "c", "d", "e");
        int lastIndex =strings.size() - 1;
        assertEquals(0, BinarySearcher.elementFinder("a", strings, 0, lastIndex));
    }
    @Test
    public void theDecimalNumberShouldBeExistInTheList(){
        List<Double> numbers = Arrays.asList(10.1,20.2,30.3,40.4);
        int lastIndex = numbers.size() - 1;
        assertEquals(2, BinarySearcher.elementFinder(30.3, numbers, 0, lastIndex));
    }
    @Test
    public void theObjectShouldBeExistInTheList(){
        List<Time> objects = new ArrayList<>();
        List<Time> userInput = new ArrayList<>();
        Time time = new Time(1);
        objects.add(time);
        Time time1 = new Time(2);
        objects.add(time1);
        userInput.add(time1);
        Time time2 = new Time(3);
        objects.add(time2);
        Time time3 = new Time(4);
        objects.add(time3);
        int lastIndex = objects.size() - 1;
        assertEquals(1, BinarySearcher.elementFinder(time1, objects, 0, lastIndex));
    }
}
