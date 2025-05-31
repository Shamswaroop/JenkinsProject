package com.mycompany.app;

import org.junit.jupiter.api.Test; // <-- JUnit 5 import
import static org.junit.jupiter.api.Assertions.assertTrue; // <-- JUnit 5 import

/**
 * Unit test for simple App.
 */
public class AppTest { // Keep public class
    /**
     * Rigorous Test :-)
     */
    @Test // <-- JUnit 5 annotation
    void shouldAnswerWithTrue() { // Test methods can be package-private in JUnit 5
        assertTrue( true, "The test should always be true" ); // Added message for clarity
    }
}
