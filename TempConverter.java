//****************************************************************
// TempConverter.java
//
// Converts a Celsius temperature to Fahrenheit.
//****************************************************************

public class TempConverter
{
    //-----------------------------------------------------------------
    // Computes the Fahrenheit equivalent of a specific Celsius
    // value using the formula F = (9/5)C + 32.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        final int BASE = 32;
        final double CONVERSION_FACTOR = 9.0 / 5.0;

        int celsiusTemp = 24; // value to convert
        double fahrenheitTemp;

        fahrenheitTemp = celsiusTemp * CONVERSION_FACTOR + BASE;

        System.out.println("Celsius Temperature: " + celsiusTemp);
        System.out.println("Fahrenheit Equivalent: " + fahrenheitTemp);

        int fahrenheitIntTemp = (int) fahrenheitTemp;
        System.out.println("Fahrenheit Equivalent (int): " + fahrenheitIntTemp);
    }
}