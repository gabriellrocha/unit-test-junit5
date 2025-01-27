package org.example.math;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator Operations Test")
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }


    @DisplayName("Test - Addition of Two Numbers")
    @Test
    void testAdd(){ // This is Template

        // Arrange
        Calculator calculator = new Calculator();
        int firstNumber = 5;
        int secondNumber = 5;
        int expected = 10;

        // Act
        int actual = calculator.add(firstNumber, secondNumber);

        // Assert
        assertEquals(
                expected, actual,
                () -> "%d + %d don't produce %d".formatted(firstNumber, secondNumber, expected)
        );
    }

    @DisplayName("Test - Subtraction of Two Numbers")
    @Test
    void testSubtract(){

        int n1 = 5;
        int n2 = 5;
        int expected = 0;

        assertEquals(
                expected, calculator.subtract(n1, n2),
                () -> "%d - %d don't produce %d".formatted(n1, n2, expected)
        );

    }

    @DisplayName("Test - Multiplication of Two Numbers")
    @Test
    void testMultiply(){

        int n1 = 5;
        int n2 = 5;
        int expected = 25;

        assertEquals(
                expected, calculator.multiply(n1, n2),
                () -> "%d * %d don't produce %d".formatted(n1, n2, expected)
        );
    }

    @DisplayName("Test - Division of Two Numbers")
    @Test
    void testDivision(){

        int n1 = 5;
        int n2 = 5;
        int expected = 1;

        assertEquals(
                expected, calculator.division(n1, n2),
                () -> "%d / %d don't produce %d".formatted(n1, n2, expected)
        );
    }

    @Disabled("Test - Disable")
    @DisplayName("Test - Square Root of the Number")
    @Test
    void testSquareRoot(){

        int n1 = 144;
        int expected = 12;

        assertEquals(
                expected, calculator.squareRoot(n1),
                () -> "square root of %d does not produce %d".formatted(n1, expected)
        );
    }

    @DisplayName("Test - Factorial of a Number")
    @Test
    void testFactorial(){

        int n1 = 5;
        int expected = 120;

        assertEquals(
                expected, calculator.factorial(n1),
                () -> "factorial of %d! does not produce %d".formatted(n1, expected)
        );
    }

    @DisplayName("Test - DivisionByZero is thrown ")
    @Test
    void testDivisionByZero(){

        int n1 = 5;
        int n2 = 0;
        int expected = 0;

        assertThrowsExactly(
                DivisionByZeroException.class,
                () -> calculator.division(n1, n2),
                () -> "DivisionByZeroException must be thrown"
        );
    }
}