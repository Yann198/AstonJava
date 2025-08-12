import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.TriangleArea;

class TriangleAreaTest {
    @Test
    void testArea() {
        assertEquals(6.0, TriangleArea.calculateArea(3, 4, 5), 0.001);
        assertThrows(IllegalArgumentException.class, () -> TriangleArea.calculateArea(1, 1, 3));
    }
}
