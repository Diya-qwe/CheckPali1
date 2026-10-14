package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringPalindromeTest {

    @Test
    void testPalindrome() {
        assertTrue(StringPalindrome.isPalindrome("madam"));
    }

    @Test
    void testNonPalindrome() {
        assertFalse(StringPalindrome.isPalindrome("hello"));
    }

    @Test
    void testSingleCharacter() {
        assertTrue(StringPalindrome.isPalindrome("a"));
    }

    @Test
    void testEmptyString() {
        assertTrue(StringPalindrome.isPalindrome(""));
    }

    @Test
    void testUppercaseString() {
        assertTrue(StringPalindrome.isPalindrome("MADAM"));
    }

    @Test
    void testMixedCaseString() {
        assertTrue(StringPalindrome.isPalindrome("MadAm"));
    }

    @Test
    void testNullString() {
        assertThrows(IllegalArgumentException.class,
                () -> StringPalindrome.isPalindrome(null));
    }
}