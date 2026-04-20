package com.example.InterviewCoding19;

public class CountVowelsAndConsonants19 {
	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		int vowel = 0, consonant = 0;
		for (int i = 0; i < str.toLowerCase().length(); i++) {
			char c = str.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				vowel++;
			else
				consonant++;
		}
		System.out.println("vowel :" + vowel);
		System.out.println("consonant :" + consonant);
	}
}
