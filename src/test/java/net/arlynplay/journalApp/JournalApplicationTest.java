package net.arlynplay.journalApp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JournalApplicationTest {

    // Example method to test addition
    public int add(int a, int b) {
        return a + b;
    }

    // Example method to test subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    // Simulate a method that should not throw an exception (auto-closure logic)
    public boolean testAutoClosure() {
        try {
            // Simulate resource auto-close or safe block
            int x = 5 / 1;  // Replace with any logic that might throw
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // Test cases for addition
    @ParameterizedTest
    @CsvSource({
            "1, 2, 3",
            "5, 5, 10",
            "-3, 3, 0",
            "0, 0, 0",
            "10, -5, 5"
    })
    public void testAddition(int a, int b, int expected) {
        assertEquals(expected, add(a, b));
    }

    // Test cases for subtraction
    @ParameterizedTest
    @CsvSource({
            "5, 3, 2",
            "10, 10, 0",
            "-5, -5, 0",
            "7, -2, 9"
    })
    public void testSubtraction(int a, int b, int expected) {
        assertEquals(expected, subtract(a, b));
    }

    // Test the auto-closure method
    @Test
    public void testAutoClosureLogic() {
        assertTrue(testAutoClosure(), "Auto-closure logic should return true");
    }
}
