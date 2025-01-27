package org.example.math;

public class Calculator {

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int division(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            throw new DivisionByZeroException("/ by zero");
        }
        return firstNumber / secondNumber;
    }

    public double squareRoot(int number) {
        return Math.sqrt(number);
    }

    public long factorial(long number) {

        long result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }
}
