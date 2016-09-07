package ru.lesson.lessons;

import org.junit.Assert.*;
import org.junit.Test;


import static org.junit.Assert.*;

/*
 * @(#)CalculateTest.java
 *
 * Copyright (c)
 * Free to any use.
 *
 * @author_for_template		peterarsentev
 * @author_tester           k0r0tk0ff
 * @date		07/09/2016
 * @version		3.2
 *
 * Test methods of class Calculate
 * (Use test methods aka "black box")
 *
 * testadd test Calculator.add
 * testdiv test Calculator.div
 * and similary
 */

public class CalculateTest {
    @Test
    public void testadd() throws Exception {
        Calculate Calculator = new Calculate();

        /**
         * For compare float oe double type, need to use
         * assertEquals(etalon, what_is_compare, delta)
         */

        assertEquals(2.0, Calculator.add(1.0,1.0), 0.0);
    }

    @Test
    public void testdiv() throws Exception {
        Calculate Calculator = new Calculate();
        assertEquals(2.0, Calculator.div(2.0,1.0), 0.0);
    }

    @Test
    public void testsubstract() throws Exception {
        Calculate Calculator = new Calculate();
        assertEquals(1.0, Calculator.substract(2.0,1.0), 0.0);
    }

    @Test
    public void testmultiple() throws Exception {
        Calculate Calculator = new Calculate();
        assertEquals(4.0, Calculator.multiple(2.0,2.0), 0.0);
    }

    @Test
    public void testexpand() throws Exception {
        Calculate Calculator = new Calculate();
        assertEquals(8.0, Calculator.expand(2.0,3.0), 0.0);
    }
}