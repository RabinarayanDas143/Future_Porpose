package com.example.InterviewCoding24;

public class CountVowelsAndConsonants24 {
	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		int vowel = 0, consonant = 0;
		for (char c : str.toLowerCase().toCharArray()) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				vowel++;
			else
				consonant++;
		}
		System.out.println("vowel :" + vowel);
		System.out.println("consonant :" + consonant);
	}
}
