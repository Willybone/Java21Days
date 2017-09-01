package com.java21days;

import java.util.StringTokenizer;

public class Day3Test {
    public static void main (String[] arguments) {
        String day, month, year;
        StringTokenizer dateToken;
        String dateString = "06/12/1970";
        dateToken = new StringTokenizer(dateString, "/");
        
        day = dateToken.nextToken();
        month = dateToken.nextToken();
        year = dateToken.nextToken();
        
        System.out.println("Day: \t" + day);
        System.out.println("Month: \t" + month);
        System.out.println("Year: \t" + year);        
    }
}