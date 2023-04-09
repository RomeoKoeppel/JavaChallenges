package ch04_strings.solutions;

import java.util.Comparator;

/**
 * Beispielprogramm für das Buch "Java Challenge"
 *
 * @author Michael Inden
 *
 * Copyright 2020 by Michael Inden
 */
public class Ex14_VersionNumberComparator
{
    private Ex14_VersionNumberComparator()
    {
    }

    static int compareVersions(final String v1, final String v2)
    {
        var v1Numbers = v1.split("\\."); // Achtung: Reg-Ex, . macht jedes Zeichen!
        var v2Numbers = v2.split("\\.");

        int pos = 0;
        int compareResult = 0;
        while (pos < v1Numbers.length && pos < v2Numbers.length && compareResult == 0)
        {
            var currentV1 = Integer.valueOf(v1Numbers[pos]);
            var currentV2 = Integer.valueOf(v2Numbers[pos]);

            compareResult = Integer.compare(currentV1, currentV2);
            pos++;
        }

        if (compareResult == 0)
        {
            // same prefix number (eg. 3.1 and 3.1.7)
            return Integer.compare(v1Numbers.length, v2Numbers.length);
        }

        return compareResult;
    }

    static Comparator<String> versioNumberComparator = (v1, v2) -> compareVersions(v1, v2);
}
