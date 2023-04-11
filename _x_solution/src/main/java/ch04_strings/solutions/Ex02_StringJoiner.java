package ch04_strings.solutions;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Beispielprogramm für das Buch "Java Challenge"
 *
 * @author Michael Inden
 *
 * Copyright 2020 by Michael Inden
 */
public class Ex02_StringJoiner
{
    private Ex02_StringJoiner()
    {
    }

    static String join(final List<String> values, final String delimiter)
    {
        var sb = new StringBuilder();
        for (int i = 0; i < values.size(); i++)
        {
            sb.append(values.get(i));

            // one before last
            if (i < values.size() - 1)
            {
                sb.append(delimiter);
            }
        }
        return sb.toString();
    }

    static String joinStrings(final List<String> values, final String delimiter)
    {
        return values.stream().collect(Collectors.joining(delimiter));
    }
}
