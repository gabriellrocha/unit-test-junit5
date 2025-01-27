package org.example.annotations;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class EnableOnOsDemoTest {

    @BeforeAll
    @DisplayName("Check OS Name")
    static void printOsName() {
        System.out.println(System.getProperty("os.name"));
    }

    @Test
    @DisplayName("Test ")
    @EnabledOnOs(OS.LINUX)
    void testOnlyOnLinux() {
        System.out.println("The operating system is Linux");
    }

    @Test
    @DisplayName("Test ")
    @EnabledOnOs(OS.WINDOWS)
    void testOnlyOnWindows() {
        System.out.println("The operating system is Windows");
    }
}
