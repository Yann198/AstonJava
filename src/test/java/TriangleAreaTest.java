import org.testng.annotations.Test;
import static org.testng.Assert.*;
import org.example.TriangleArea;

public class TriangleAreaTest {
    @Test
    public void testArea() {
        assertEquals(TriangleArea.calculateArea(3, 4, 5), 6.0, 0.001);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testInvalidTriangle() {
        TriangleArea.calculateArea(1, 1, 3);
    }
}
