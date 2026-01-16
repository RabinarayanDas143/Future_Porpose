package com.example.InterviewCoding13;

import java.util.HashMap;
import java.util.Map;

public class CountVowelsAndConsonants13 {
	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		Map<String, Integer> map = new HashMap<>();
        int vowel=0,consonant=0;
		for(int i=0;i<str.toLowerCase().length();i++) {
			char ch = str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowel++;
			}else {
				consonant++;
			}
		}
		map.put("Vowel", vowel);
		map.put("Consonant", consonant);
		
		System.out.println(map);
	}
}
