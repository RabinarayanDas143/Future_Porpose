package com.example.InterviewCoding12;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountVowelsAndConsonants12 {
	public static void main(String[] args) {
		Map<String, Integer> map = countVowelAndConsonant("Rabinarayan Das");
		for (Entry<String, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

	public static Map<String, Integer> countVowelAndConsonant(String str) {
		int vowel = 0, consonant = 0;
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < str.toLowerCase().length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowel++;
			} else {
				consonant++;
			}
		}
		map.put("Vowel", vowel);
		map.put("consonant", consonant);

		return map;
	}
}
