import org.testng.annotations.Test;
import static org.testng.Assert.*;
import org.example.ArithmeticOperations;

public class ArithmeticOperationsTest {
    @Test
    public void testAdd() {
        assertEquals(ArithmeticOperations.add(2, 3), 5);
    }

    @Test
    public void testDivide() {
        assertEquals(ArithmeticOperations.divide(10, 2), 5.0);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideByZero() {
        ArithmeticOperations.divide(1, 0);
    }
}
