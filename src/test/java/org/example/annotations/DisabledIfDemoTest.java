package org.example.annotations;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledIf;

import java.time.LocalTime;

public class DisabledIfDemoTest {

    // @DisableIf- condicional para desabilitar testes com base em uma expressão

    static boolean isMorning() {

        var hour = LocalTime.now().getHour();

        return (hour >=6 && hour <=12);
    }

    @DisabledIf("isMorning")
    @Test
    void testInMorning() {
        System.out.println("It's not morning");
    }
}
