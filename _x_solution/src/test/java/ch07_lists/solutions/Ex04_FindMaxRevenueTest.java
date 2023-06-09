package ch07_lists.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Beispielprogramm für das Buch "Java Challenge"
 *
 * @author Michael Inden
 *
 * Copyright 2020 by Michael Inden
 */
public class Ex04_FindMaxRevenueTest
{
    @ParameterizedTest(name = "maxRevenue({0}) = {1}")
    @MethodSource("listInputsAndExpected")
    public void findLongestGrowingSequence(final List<Integer> inputs, final int expected)
    {
        final int result = Ex04_FindMaxRevenue.maxRevenue(inputs);

        assertEquals(expected, result);
    }

    @ParameterizedTest(name = "maxRevenueV2({0}) = {1}")
    @MethodSource("listInputsAndExpected")
    public void maxRevenueV2(final List<Integer> inputs,  final int expected)
    {
        final int result = Ex04_FindMaxRevenue.maxRevenueV2(inputs);

        assertEquals(expected, result);
    }

    static Stream<Arguments> listInputsAndExpected()
    {
        return Stream.of(Arguments.of(List.of(255, 260, 250, 240, 228, 270, 300, 210, 245), 72),
                         Arguments.of(List.of(0, 10, 20, 30, 40, 50, 60, 70), 70),
                         Arguments.of(List.of(70, 60, 50, 40, 30, 20, 10, 0), 0),
                         Arguments.of(List.of(), 0));
    }
}
