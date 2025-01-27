package org.example.annotations;

import org.example.math.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Test Annotations Before and After")
public class BeforeAfterEachAllDemoTest {

    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @BeforeAll
    static void sayTest() {
        System.out.println("Tests initializing...");
    }

    @AfterAll
    static void tearAll() {
        System.out.println("Tests completed...");
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
}
