package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringEngineTest {

    @Test
    @DisplayName("Concat Strings")
    void concatString() {
        String str = "";
        assertAll(() -> assertEquals("random str", StringEngine.concatString("random str", "")),
                () -> assertEquals("random str", StringEngine.concatString("", "random str")),
                () -> assertEquals("random str random str", StringEngine.concatString("random str ", "random str")),
                () -> assertEquals(str, StringEngine.concatString(str, str)));
    }

    @Test
    @DisplayName("Multiplicate String n times")
    void multiplicateString() {
        assertAll(() -> assertEquals("", StringEngine.multiplicateString("random str", 0)),
                () -> assertEquals("rand", StringEngine.multiplicateString("rand", 1)),
                () -> assertEquals("randrandrand", StringEngine.multiplicateString("rand", 3)),
                () -> assertEquals("rand rand rand rand rand rand rand rand rand ", StringEngine.multiplicateString("rand ", 9)));
    }
}