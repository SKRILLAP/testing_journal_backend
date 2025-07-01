package net.arlynplay.journalApp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JournalApplicationTest {

    // Example method to test
    public int add(int a, int b) {
        return a + b;
    }

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
}
