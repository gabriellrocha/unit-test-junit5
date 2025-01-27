package org.example.annotations;

import org.example.math.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test AssertAll")
public class AssertAllDemoTest {

    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    void testWithAssertAll() {

        int n1 = 5, n2 = 10;

        assertAll(
                "Grouped Assertions",
                () -> assertEquals(
                        15,
                        calculator.add(n1, n2),
                        "Result should be 15"
                ),
                () -> assertEquals(
                        50,
                        calculator.multiply(n1, n2),
                        "Result should be 50"
                ),
                () -> assertEquals(
                        -5,
                        calculator.subtract(n1, n2),
                        "Result should be -5"
                )
        );
    }
}
