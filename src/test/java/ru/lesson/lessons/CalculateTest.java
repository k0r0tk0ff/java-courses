package ru.lesson.lessons;

import org.junit.Test;

import static org.junit.Assert.*;
import org.hamcrest.*;

/**
 * Created by k0r0tk0ff on 11.09.2016.
 */
public class CalculateTest {
    @Test
    public void testAdd() throws Exception {

        /**
         * Checking the "ADD" operation
         * (for tests)
         * public Calculator(double first, String entered_operation, double second)
         */

        Calculator calculator = new Calculator(1, "+", 2);
        assertEquals(3.0, calculator.add(calculator.first,calculator.second), 0.0);

        //need to use
        assertThat(3.0, );
    }
}