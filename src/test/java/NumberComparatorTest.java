import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.NumberComparator;

class NumberComparatorTest {
    @Test
    void testComparison() {
        assertEquals("5 > 3", NumberComparator.compare(5, 3));
        assertEquals("2 < 4", NumberComparator.compare(2, 4));
        assertEquals("7 == 7", NumberComparator.compare(7, 7));
    }
}
