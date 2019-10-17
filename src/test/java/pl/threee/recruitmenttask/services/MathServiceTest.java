package pl.threee.recruitmenttask.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathServiceTest {
    private MathService mathService;

    @BeforeEach
    public void init() {
        mathService = new MathService();
    }

    @Test
    public void testAdd_PositiveNumbers() {
        assertEquals(3.5801, mathService.add(1.2345, 2.3456), 1e-10);
    }

    @Test
    public void testAdd_NegativeNumbers() {
        assertEquals(-3.5801, mathService.add(-1.2345, -2.3456), 1e-10);
    }

    @Test
    public void testAdd_PositiveAndNegativeNumber() {
        assertEquals(1.1111, mathService.add(-1.2345, 2.3456), 1e-10);
    }

    @Test
    public void testDivide_DivisionByZeroThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> mathService.divide(1.2345, 0));
    }

    @Test
    public void testDivide_PositiveNumbers() {
        assertEquals(12.5, mathService.divide(31.25, 2.5), 1e-10);
    }

    @Test
    public void testDivide_NegativeNumbers() {
        assertEquals(0.526304570259208, mathService.divide(-1.2345, -2.3456), 1e-10);
    }

    @Test
    public void testDivide_PositiveAndNegativeNumber() {
        assertEquals(-0.526304570259208, mathService.divide(-1.2345, 2.3456), 1e-10);
    }
}
