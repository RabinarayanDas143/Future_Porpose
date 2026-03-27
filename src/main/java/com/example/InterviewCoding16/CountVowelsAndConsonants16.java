package com.example.InterviewCoding16;

public class CountVowelsAndConsonants16 {
	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		int vowel=0,consonant=0;
		char[] charArray = str.toLowerCase().toCharArray();
		for(int i=0;i<charArray.length;i++) {
			char ch = charArray[i];
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowel++;
			}else {
				consonant++;
			}
		}
		System.out.println("Vowel count is :"+vowel);
		System.out.println("Consonant count is :"+consonant);
	}
}
