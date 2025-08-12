import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.ArithmeticOperations;

class ArithmeticOperationsTest {
    @Test
    void testOperations() {
        assertEquals(5, ArithmeticOperations.add(2, 3));
        assertEquals(-1, ArithmeticOperations.subtract(2, 3));
        assertEquals(6, ArithmeticOperations.multiply(2, 3));
        assertEquals(0.666, ArithmeticOperations.divide(2, 3), 0.001);
        assertThrows(ArithmeticException.class, () -> ArithmeticOperations.divide(1, 0));
    }
}
