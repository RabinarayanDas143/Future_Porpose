package com.example.InterviewCoding18;

public class CountVowelsAndConsonants18 {
	public static void main(String[] args) {
		String str = "I am a java Developer";
		int vowel = 0, consonant = 0;
		for (int i = 0; i < str.toLowerCase().length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowel++;
			} else {
				consonant++;
			}
		}
		System.out.println("vowel :" + vowel);
		System.out.println("consonant :" + consonant);
	}
}
