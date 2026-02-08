package com.example.InterviewCoding14;

import java.util.HashMap;
import java.util.Map;

public class CountVowelsAndConsonants14 {
	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		Map<String, Integer> map = new HashMap<>();
		int consonant = 0, vowel = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.toLowerCase().charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				vowel++;
			else
				consonant++;
		}
		map.put("Vowel", vowel);
		map.put("Consonant", consonant);
		System.out.println(map);
	}
}
