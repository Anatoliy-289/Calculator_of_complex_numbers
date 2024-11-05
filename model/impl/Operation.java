package model.impl;

import java.util.Scanner;

public final class Operation {
    private String result;
    
    public Operation() {
        this.result = null;
    }

    @Override
    public void sum(String complexNumber1, String complexNumber2) {
        String result(sum);
    }

    @Override
    public void subtraction(String complexNumber1, String complexNumber2) {
        String result(substraction);
    }

    @Override
    public void multiply(String complexNumber1, String complexNumber2) {
        String result(multiply);
    }

    @Override
    public void divide(String complexNumber1, String complexNumber2) {
        try {
            String result(divide);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Divide by zero exception");
        }
    }
    
    @Override
    public double result() {
        System.out.printf("Result: %s%n", result);
        return result;
    }

    @Override
    public void clear() {
        this.result = 0;
    }
}