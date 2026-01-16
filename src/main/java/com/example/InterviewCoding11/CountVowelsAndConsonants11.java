package com.example.InterviewCoding11;

import java.util.HashMap;
import java.util.Map;

public class CountVowelsAndConsonants11 {
	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		Map<String, Integer> map = getCountVowelAndConsonant(str);
		 for(Map.Entry<String, Integer> entry :map.entrySet()) {
			 System.out.println(entry.getKey() +" "+ entry.getValue());
		 }
		 
		 map.forEach((k,v)->System.out.println(k+" "+v));
	}

	public static Map<String, Integer> getCountVowelAndConsonant(String str) {
		Map<String, Integer> map = new HashMap<>();
		int vowel = 0, consonant = 0;
		for (int i = 0; i < str.toLowerCase().length(); i++) {
			char ch = str.charAt(i);
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
