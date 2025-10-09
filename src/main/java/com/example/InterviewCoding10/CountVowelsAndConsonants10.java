package com.example.InterviewCoding10;

import java.util.HashMap;
import java.util.Map;

public class CountVowelsAndConsonants10 {
	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		Map<String, Integer> map = getCountVowelAndConsonant(str);
		System.out.println("Map is :"+map);
	}

	private static Map<String, Integer> getCountVowelAndConsonant(String str) {
		Map<String, Integer> map = new HashMap<>();
		int vowel = 0;
		int consonant = 0;
		char[] charArray = str.toLowerCase().toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			char ch = charArray[i];
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowel++;
			} else {
				consonant++;
			}
		}
		map.put("Vowel", vowel);
		map.put("Consonant", consonant);
		return map;
	}
}
