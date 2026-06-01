package com.example.java8CodingQuestion14;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CheckStringAnnagram14 {
	public static void main(String[] args) {
		String str1 = "RaceCar";
		String str2 = "CarRace";

		str1 = Arrays.stream(str1.split("")).sorted().collect(Collectors.joining(""));
		str2 = Arrays.stream(str1.split("")).sorted().collect(Collectors.joining(""));

		if (str1.equals(str2))
			System.out.println("Annagram..");
		else
			System.out.println("Not");
	}
}
