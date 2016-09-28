package ru.lesson.lessons;

/**
 * @(#)Calculate.java
 *
 * Copyright (c)
 * Free to any use.
 *
 * @author		peterarsentev
 * @author      k0r0tk0ff
 * @since 		28/09/2016
 * @version		3.1
 *
 * Create class Calculator. Calculate first argument, entered operation, second argument.
 *
 * Use SOLID princips.
 */

class Calculator{
    double first;
    private String entered_operation;
    double second;
    double result;

    Calculator(double first, double second){
        /**
         * Use variables from input in method`s body
         */
        this.first = first;
        this.second = second;
    }

    Calculator(double first, String entered_operation, double second) {
        /**
         * Upgrade constructor, use previos version Calculator(double first, double second)
         * this(first, second); equal this.first = first; this.second = second;
         */
        this(first, second);
        this.entered_operation = entered_operation;
    }

    /**
     * Write methods for arithmetic operation
     */

    double add(double first, double second){
        return first + second;
    }

    double substract(double first, double second){
        return first - second;
    }

    double multiple(double first, double second){
        return first * second;
    }

    double div(double first, double second) throws IllegalStateException{
        return first / second;
    }

    double expand(double first, double second){
        double expand_value = 1.0;
        if(second == 0) expand_value = 1.0;
        else if(second == 1) expand_value = first;
        else{
            for (int i=0; i < second; i++){
                expand_value = expand_value * first;
            }
        }
        return expand_value;
    }

    private void printResultOfWorkCalculator() {
        /**
         *  System.out.println ("\n Argument 1: "+first);
         *  System.out.println (" Operation: "+entered_operation);
         *  System.out.println (" Argument 2: "+second);
         *  System.out.println("\n Result is "+result);
         */

        /**
         * Variant with use method String.format
         */

        System.out.println(String.format("\n Argument 1: %s", first));
        System.out.println(String.format(" Operation: %s", entered_operation));
        System.out.println(String.format(" Argument 2: %s", second));
        System.out.println(String.format("\n Result is: %s", result));
    }

    /**
     * Write main method, whose calculate
     */

    void runCalculator(){
         /**
         * Switch to arithmetic operation
         */

        switch (entered_operation){
        case "+":
            result = add(first, second);
        break;
        case "-":
            result = substract(first, second);
        break;
        case "x":
            result = multiple(first, second);
        break;
        case "^":
            result = expand(first, second);
        break;
        case "/":
            try{
            div(first, second);
            result = div(first, second);
            if (div(first, second) == Double.POSITIVE_INFINITY ||
                div(first, second) == Double.NEGATIVE_INFINITY)
                throw new IllegalStateException();
            } catch (IllegalStateException e) {
                System.out.println(" div on 0 !!!");
            }
        break;
        default: System.out.println("\n Invalid entered operation");
        break;
        }

        /**
         * Checking on monitor the entered arguments
         */

        printResultOfWorkCalculator();
    }
}
