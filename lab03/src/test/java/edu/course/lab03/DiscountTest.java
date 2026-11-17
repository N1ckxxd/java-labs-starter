package edu.course.lab03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DiscountTest {
    @Test
    void testNoDiscount() {
        PriceCalculator calc = new PriceCalculator(new NoDiscount());
        assertEquals(100.0, calc.calculate(100.0));
    }

    @Test
    void testPercentDiscount() {
        PriceCalculator calc = new PriceCalculator(new PercentDiscount(10));
        assertEquals(90.0, calc.calculate(100.0));
    }
}