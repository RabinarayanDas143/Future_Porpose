package com.example.InterviewCoding21;

import java.util.Arrays;
import java.util.List;

public class CountVowelsAndConsonants21 {
	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		int count = 0, vowel = 0;
		List<Character> list = Arrays.asList('a', 'e', 'i', 'o', 'u');
		for (int i = 0; i < str.length(); i++) {
			char ch = str.toLowerCase().charAt(i);
			if (list.contains(ch)) {
				vowel++;
			} else {
				count++;
			}
		}
		System.out.println("vowel :" + vowel);
		System.out.println("count :" + count);
	}
}
