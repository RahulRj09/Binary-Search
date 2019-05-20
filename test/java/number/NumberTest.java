package number;
import Binarysearcher.BinarySearcher;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class NumberTest {
    @Test
    public void theNumberShouldBeExistOrNotInTheList(){
        int listOfNumbers[] = {10,20,30,40,50};
        int firstIndex = 0;
        int lastIndex = listOfNumbers.length - 1;
        assertEquals("Element is found at index: 1", BinarySearcher.numberChecker(20, listOfNumbers, firstIndex, lastIndex));

    }
}
