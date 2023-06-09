package ch04_strings.solutions;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Beispielprogramm für das Buch "Java Challenge"
 *
 * @author Michael Inden
 *
 * Copyright 2020 by Michael Inden
 */
public class Ex04_PalindromeTest
{
    @ParameterizedTest(name = "isPalindromeRec({0} => {1}")
    @CsvSource({ "Otto, true", "ABCBX, false", "ABCXcba, true" })
    void isPalindromeRec(String value, boolean expected)
    {
        boolean result = Ex04_Palindrome.isPalindromeRec(value);

        assertEquals(expected, result);
    }

    @ParameterizedTest(name = "''{0}'' should be {1}")
    @CsvSource({ "Dreh mal am Herd., true", "Das ist kein Palindrom!, false" })
    void isPalindrome(String value, boolean expected)
    {
        boolean result = Ex04_Palindrome.isPalindrome(value, true);

        assertEquals(expected, result);
    }

    @ParameterizedTest(name = "isPalindromeIterative({0} => {1}")
    @CsvSource({ "Otto, true", "ABCBX, false", "ABCXcba, true" })
    void isPalindromeIter(String value, boolean expected)
    {
        boolean result = Ex04_Palindrome.isPalindromeIterative(value);

        assertEquals(expected, result);
    }

}
