package number;
import Binarysearcher.BinarySearcher;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NumberTest {
    @Test
    public void theNumberShouldBeExistInTheList(){
        int numbers[] = {10,20,30,40,50};
        int lastIndex = numbers.length - 1;
        assertEquals(1, BinarySearcher.numberChecker(20, numbers, 0, lastIndex));
    }
    @Test
    public void theNumberShouldBeNotExistInTheList() {
        int numbers[] = {10,20,30,40,50};
        int lastIndex = numbers.length - 1;
        assertEquals(-1, BinarySearcher.numberChecker(60, numbers, 0, lastIndex));
    }
}
