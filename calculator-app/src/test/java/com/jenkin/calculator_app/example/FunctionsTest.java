package com.jenkin.calculator_app.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionsTest {

    @Test
    public void testAdd() {
        Functions calc = new Functions();
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testSubtract() {
        Functions calc = new Functions();
        assertEquals(1, calc.subtract(3, 2));
    }
}