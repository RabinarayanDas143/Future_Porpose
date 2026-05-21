package com.example.InterviewCoding22;

public class CountVowelsAndConsonants22 {
	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		int consonant = 0, vowel = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.toLowerCase().charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				vowel++;
			else
				consonant++;
		}
		System.out.println("vowel :" + vowel);
		System.out.println("consonant :" + consonant);
	}
}
