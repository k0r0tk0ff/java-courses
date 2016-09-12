package ru.lesson.lessons;

/*
 * @(#)Calculator.java
 *
 * Copyright (c)
 * Free to any use.
 *
 * @author_for_template		peterarsentev
 * @author_tester           k0r0tk0ff
 * @date		12/09/2016
 * @version		2.2
 *
 * Create class Calculator. Calculate first argument, entered operation, second argument.
 *
 * Use SOLID princips.
 */

public class Calculator {
    double first;
    String entered_operation;
    double second;
    double Result;




    public double add(double first, double second){
        return first + second;
    }

    public double substract(double first, double second){
        return first - second;
    }

    public double multiple(double first, double second){
        return first * second;
    }

    public double div(double first, double second) throws IllegalStateException{
        return first / second;
    }

    public double expand(double first, double second) {
        double expand_value = 1.0;
        if(second == 0) expand_value = 1.0;
        else if(second == 1) expand_value = first;
        else {
            for (int i = 0; i < second; i++) {
                expand_value = expand_value * first;
            }
        }
        return expand_value;
    }

    public Calculator(double first, String entered_operation, double second) {
        this.first = first;
        this.entered_operation = entered_operation;
        this.second = second;

        /**
         * Switch to arithmetic operation
         *
         */

         switch (entered_operation) {
         case "+":
             Result = add(first, second);
         break;
         case "-":
             Result = substract(first, second);
         break;
         case "x":
             Result = multiple(first, second);
         break;
         case "^":
             Result = expand(first, second);
         break;
         case "/":
             try{
             div(first, second);
             Result = div(first, second);
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
         * Checking the entered arguments
         * (for tests)
         */

        System.out.println ("\nArgument 1: "+first);
        System.out.println ("Operation: "+entered_operation);
        System.out.println ("Argument 2: "+second);
        System.out.println("\n Result is "+Result);

        /**
         * Do arithmetic operation, that has been entered whith If-Else construction
         *
         * if(entered_operation.equals("+")){
         *       getResult(add(first, second));
         * }else if(entered_operation.equals("-")){
         *       getResult(substract(first, second));
         * }else if(entered_operation.equals("x")){
         *       getResult(multiple(first, second));
         * }else if(entered_operation.equals("^")){
         *       getResult(expand(first, second));
         * }else if(entered_operation.equals("/")){
         *     try{
         *       div(first, second);
         *       getResult(div(first, second));
         *       if (div(first, second) == Double.POSITIVE_INFINITY ||
         *               div(first, second) == Double.NEGATIVE_INFINITY)
         *           throw new IllegalStateException();
         *   } catch (IllegalStateException e) {
         *       System.out.println(" div on 0 !!!");
         *   }
         *   }else System.out.println("\n Invalid entered operation");
         */
    }
}
