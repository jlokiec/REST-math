package pl.threee.recruitmenttask.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathServiceTest {
    @Test
    public void testAdd_PositiveNumbers() {
        MathService mathService = new MathService();
        assertEquals(3.5801, mathService.add(1.2345, 2.3456), 1e-10);
    }

    @Test
    public void testAdd_NegativeNumbers() {
        MathService mathService = new MathService();
        assertEquals(-3.5801, mathService.add(-1.2345, -2.3456), 1e-10);
    }

    @Test
    public void testAdd_PositiveAndNegativeNumber() {
        MathService mathService = new MathService();
        assertEquals(1.1111, mathService.add(-1.2345, 2.3456), 1e-10);
    }
}
