package ru.lesson.lessons;

import org.junit.Test;

import static jdk.nashorn.internal.objects.Global.Infinity;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;
import org.hamcrest.*;

/**
 * @(#)CalculateTest.java
 *
 * Copyright (c)
 * Free to any use.
 *
 * @author_for_template		peterarsentev
 * @author_tester           k0r0tk0ff
 * @date		16/09/2016
 * @version		1.1
 *
 * Test methods for "+","-","*","/","^" operation.
 *
 */

public class CalculateTest {
    @Test
    public void testAdd() throws Exception {

        /**
         * Checking the "ADD" operation
         * (for tests)
         * public Calculator(double first, double second)
         */

        Calculator calculator = new Calculator(1, 2);
        //assertEquals(3.0, calculator.add(calculator.first,calculator.second), 0.0);

        /**need to use assertThat from developer`s test packet hamcrest-all
        * /http://www.vogella.com/tutorials/Hamcrest/article.html
        * https://en.wikipedia.org/wiki/Hamcrest
        * http://hamcrest.org/JavaHamcrest/
        */

        assertThat(3.0, equalTo(calculator.add(calculator.first,calculator.second)));
    }

    @Test
    public void testSubstract() throws Exception {

        /**
         * Checking the "substract" operation
         * (for tests)
         * public Calculator(double first, double second)
         */

        Calculator calculator = new Calculator(5,2);
        assertThat(3.0, equalTo(calculator.substract(calculator.first,calculator.second)));
    }

    @Test
    public void testMultiple() throws Exception {

        /**
         * Checking the "multiple" operation
         * (for tests)
         * public Calculator(double first, double second)
         */

        Calculator calculator = new Calculator(5,2);

        assertThat(10.0, equalTo(calculator.multiple(calculator.first,calculator.second)));
    }

    @Test
    public void testDiv() throws Exception {

        /**
         * Checking the "multiple" operation
         * (for tests)
         * public Calculator(double first, double second)
         */

        Calculator calculator = new Calculator(10,2);

        assertThat(5.0, equalTo(calculator.div(calculator.first,calculator.second)));
    }

    @Test
    public void testExpand() throws Exception {

        /**
         * Checking the "multiple" operation
         * (for tests)
         * public Calculator(double first, double second)
         */

        Calculator calculator = new Calculator(10,2);

        assertThat(100.0, equalTo(calculator.expand(calculator.first,calculator.second)));
    }

    @Test
    public void testDivOnZero() throws Exception {

        /**
         * Checking the "multiple" operation
         * (for tests)
         * public Calculator(double first, double second)
         */

        Calculator calculator = new Calculator(10,0);

        assertThat(Infinity, equalTo(calculator.div(calculator.first,calculator.second)));
    }

}