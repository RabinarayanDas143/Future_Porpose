package com.example.java8CodingQuestion7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CheckStringAnnagram7 {
	public static void main(String[] args) {
        String str1 = "RaceCar";
        String str2 = "carRace";
        
        str1 = Arrays.stream(str1.split("")).map(e->e.toLowerCase()).sorted().collect(Collectors.joining());
        str2 = Arrays.stream(str2.split("")).map(e->e.toLowerCase()).sorted().collect(Collectors.joining());
        if(str1.equalsIgnoreCase(str2)) {
        	System.out.println("Given Strings are Annagram");
        }else {
        	System.out.println("Given Strings are not Annagram");
        }
	}
}
