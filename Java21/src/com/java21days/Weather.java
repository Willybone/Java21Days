package com.java21days;

public class Weather {
    public static void main (String[] arguments) {
    
    float fah = 86;
    System.out.println(fah + " degress Fahrenheit is...");
    // To convert to Celsius, first subtract 32
    fah = fah - 32;
    // Divide by 9
    fah = fah / 9;
    // Multiply by 5
    fah = fah * 5;
    System.out.println(fah + " degrees Celsius.\n");
    
    float cel = 33;
    System.out.println(cel + " degress Celsius is...");
    // To convert to Fahrenheit, first divide by 5
    cel = cel / 5;
    // Multiply by 9
    cel = cel * 9;
    // Add 32
    cel = cel + 32;
    System.out.println(cel + " degrees Fahrenheit.\n");
    }
}