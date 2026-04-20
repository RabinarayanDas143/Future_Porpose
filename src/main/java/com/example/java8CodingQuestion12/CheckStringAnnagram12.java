package com.example.java8CodingQuestion12;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CheckStringAnnagram12 {
public static void main(String[] args) {
	String str1 = "RaceCar";
	String str2 = "CarRace";
	str1 = Arrays.stream(str1.toLowerCase().split("")).sorted().collect(Collectors.joining());
	str2 = Arrays.stream(str2.toLowerCase().split("")).sorted().collect(Collectors.joining());
	
	if(str1.equalsIgnoreCase(str2))
		System.out.println("Given Strings are Annagram..");
	else
		System.out.println("Given Strings are not Annagram..");
}
}
