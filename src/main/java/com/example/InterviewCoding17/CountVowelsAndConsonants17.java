package com.example.InterviewCoding17;

public class CountVowelsAndConsonants17 {
	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		int vowel = 0, consonant = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.toLowerCase().charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				vowel++;
			else
				consonant++;

		}

		System.out.println("vowel :" + vowel);
		System.out.println("consonant :" + consonant);
	}
}
