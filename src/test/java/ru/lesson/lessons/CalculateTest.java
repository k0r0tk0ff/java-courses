package ru.lesson.lessons;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
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
        //assertEquals(3.0, calculator.add(calculator.first,calculator.second), 0.0);

        //need to use assertThat from developer`s test packet hamcrest-all
        //http://www.vogella.com/tutorials/Hamcrest/article.html
        //https://en.wikipedia.org/wiki/Hamcrest
        //http://hamcrest.org/JavaHamcrest/
        assertThat(3.0, equalTo(calculator.add(calculator.first,calculator.second)));
    }

    @Test
    public void testsubstract() throws Exception {

        /**
         * Checking the "ADD" operation
         * (for tests)
         * public Calculator(double first, String entered_operation, double second)
         */

        Calculator calculator = new Calculator(5,"+",2);
        assertThat(3.0, equalTo(calculator.substract(calculator.first,calculator.second)));
    }

    @Test
    public void testmultiple() throws Exception {

        /**
         * Checking the "ADD" operation
         * (for tests)
         * public Calculator(double first, String entered_operation, double second)
         */

        Calculator calculator = new Calculator(5, "-", 2);
        //assertEquals(3.0, calculator.multiple(calculator.first,calculator.second), 0.0);

        //need to use assertThat from developer`s test packet hamcrest-all
        //http://www.vogella.com/tutorials/Hamcrest/article.html
        //https://en.wikipedia.org/wiki/Hamcrest
        //http://hamcrest.org/JavaHamcrest/
        assertThat(10.0, equalTo(calculator.multiple(calculator.first,calculator.second)));
    }
}