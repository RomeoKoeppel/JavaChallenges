package ch04_strings.solutions;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Beispielprogramm für das Buch "Java Challenge"
 *
 * @author Michael Inden
 *
 * Copyright 2020 by Michael Inden
 */
public class Ex05_CheckNoDuplicateChars
{
    private Ex05_CheckNoDuplicateChars()
    {
    }

    public static boolean checkNoDuplicateChars(final String input)
    {
        final char[] allCharsOfInput = input.toLowerCase().toCharArray();

        final Set<Character> containedChars = new HashSet<>();
        for (final char currentChar : allCharsOfInput)
        {
            if (containedChars.contains(currentChar))
                return false;

            containedChars.add(currentChar);
        }

        return true;
    }

    static boolean checkNoDuplicateCharsWithStream(final String input)
    {
        return input.toLowerCase().chars().boxed().collect(Collectors.toSet()).size() == input.length();
    }

    static boolean checkNoDuplicateCharsWithStreamOpt(final String input)
    {
        return input.toLowerCase().chars().distinct().count() == input.length();
    }
}
