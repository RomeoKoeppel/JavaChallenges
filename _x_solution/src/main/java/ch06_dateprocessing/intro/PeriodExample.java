package ch06_dateprocessing.intro;

import java.time.Period;

/**
 * Beispielprogramm für das Buch "Java Challenge"
 *
 * @author Michael Inden
 *
 * Copyright 2020 by Michael Inden
 */
public class PeriodExample
{
    public static void main(final String[] args)
    {
        // Erzeuge ein Period-Objekt mit 1 Jahr, 6 Monaten und 3 Tagen
        final Period oneYear_sixMonths_ThreeDays = Period.ofYears(1).withMonths(6).
                        withDays(3);

        Period.ofMonths(2);
        Period.ofWeeks(1);
        // Chaining von of() arbeitet anders, als man es eventuell erwartet!
        // Hier ein Period-Objekt mit 3 Tagen statt 2 Monate, 1 Woche und 3 Tagen
        final Period twoMonths_OneWeek_ThreeDays = Period.
                        ofDays(3);

        final Period twoMonths_TenDays = Period.ofMonths(2).withDays(10);
        final Period sevenWeeks = Period.ofWeeks(7);
        final Period threeDays = Period.ofDays(3);

        System.out.println("1 year 6 months ...:  " + oneYear_sixMonths_ThreeDays);
        System.out.println("Surprise just 3 days: " + twoMonths_OneWeek_ThreeDays);
        System.out.println("2 months 10 days:     " + twoMonths_TenDays);
        System.out.println("sevenWeeks:           " + sevenWeeks);
        System.out.println("threeDays:            " + threeDays);
    }
}