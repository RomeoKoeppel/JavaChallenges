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
public class Ex10_AnagramCheckerTest
{
    @ParameterizedTest(name = "isAnagram({0}, {1}) => {2}")
    @CsvSource({"Otto, Toto, true",
        "Mary, Army, true",
    "Ananas, Bananas, false" })
    public void testIsAnagram(String value1, String value2, boolean expected)
    {
        boolean result = Ex10_AnagramChecker.isAnagram(value1, value2);

        assertEquals(expected, result);
    }
}
