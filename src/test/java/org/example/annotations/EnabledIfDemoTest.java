package org.example.annotations;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIf;

import java.time.LocalTime;

public class EnabledIfDemoTest {

    // @EnableIf - condicional para habilitar testes com base em uma expressão

    static boolean isAfternoon() {
        return LocalTime.now().getHour() > 12;
    }


    @EnabledIf("isAfternoon")
    @Test
    void testInAfternoon() {
        System.out.println("Good Afternoon!!");
    }
}
