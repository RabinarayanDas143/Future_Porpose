package com.example.java8CodingQuestion9;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CheckStringAnnagram9 {
	public static void main(String[] args) {
		String str1 = "RaceCar";
		String str2 = "carRace";

		str1 = Arrays.stream(str1.split("")).sorted().map(e -> e.toLowerCase()).collect(Collectors.joining());
		str2 = Arrays.stream(str2.split("")).sorted().map(e -> e.toLowerCase()).collect(Collectors.joining());

		if (str1.equalsIgnoreCase(str2))
			System.out.println("Given Strings are Annagram.");
		else
			System.out.println("Given Strings are not Annagram.");
	}
}
