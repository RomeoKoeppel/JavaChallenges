package ch06_dateprocessing.solutions;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * Beispielprogramm für das Buch "Java Challenge"
 *
 * @author Michael Inden
 *
 * Copyright 2020 by Michael Inden
 */
public class Ex12_NextPaydayAdjuster implements TemporalAdjuster
{
    @Override
    public Temporal adjustInto(final Temporal temporal)
    {
        LocalDate date = LocalDate.from(temporal);

        boolean isDecember = date.getMonth() == Month.DECEMBER;
        int paymentDay = isDecember ? 15 : 25;

        if (date.getDayOfMonth() > paymentDay)
        {
            date = date.plusMonths(1);

            // Abfragen nochmals nötig, da eventuell um einen Monat verschoben
            isDecember = date.getMonth() == Month.DECEMBER;
            paymentDay = isDecember ? 15 : 25;
        }

        date = date.withDayOfMonth(paymentDay);

        if (date.getDayOfWeek() == DayOfWeek.SATURDAY ||
                        date.getDayOfWeek() == DayOfWeek.SUNDAY)
        {
            if (isDecember)
                date = date.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
            else
                date = date.with(TemporalAdjusters.previousOrSame(DayOfWeek.FRIDAY));
        }
        return temporal.with(date);
    }
}