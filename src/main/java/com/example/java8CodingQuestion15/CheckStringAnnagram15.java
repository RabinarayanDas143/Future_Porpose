package com.example.java8CodingQuestion15;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CheckStringAnnagram15 {
	public static void main(String[] args) {
		String str1 = "RaceCar";
		String str2 = "CarRace";

		str1 = Arrays.stream(str1.split("")).sorted().collect(Collectors.joining());
		str2 = Arrays.stream(str2.split("")).sorted().collect(Collectors.joining());

		if (str1.equalsIgnoreCase(str2))
			System.out.println("Both strings are annagram");
		else
			System.out.println("Both strings are not annagram");
	}
}
