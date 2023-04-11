package ch04_strings.intro;

/**
 * Beispielprogramm für das Buch "Java Challenge"
 *
 * @author Michael Inden
 *
 * Copyright 2020 by Michael Inden
 */
public class CharacterExample
{
    public static void main(final String[] args)
    {
        System.out.println(Character.getNumericValue('0'));
        System.out.println(Character.getNumericValue('3'));
        System.out.println(Character.getNumericValue('7'));
        System.out.println(Character.getNumericValue('9'));

        System.out.println(Character.getNumericValue('A'));
        System.out.println(Character.getNumericValue('a'));

        System.out.println(Character.getNumericValue('F'));
        System.out.println(Character.getNumericValue('f'));

        System.out.println(Character.getNumericValue('G'));
        System.out.println(Character.getNumericValue('g'));

        System.out.println(Character.getNumericValue('Z'));
        System.out.println(Character.getNumericValue('z'));
    }
}
