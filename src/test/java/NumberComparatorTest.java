import org.testng.annotations.Test;
import static org.testng.Assert.*;
import org.example.NumberComparator;

public class NumberComparatorTest {
    @Test
    public void testComparison() {
        assertEquals(NumberComparator.compare(5, 3), "5 > 3");
        assertEquals(NumberComparator.compare(2, 4), "2 < 4");
        assertEquals(NumberComparator.compare(7, 7), "7 == 7");
    }
}