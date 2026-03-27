package com.example.InterviewCoding16;

public class PalindromString16 {
	public static void main(String[] args) {
		String str = "Level";
		StringBuilder sb = new StringBuilder();
		for (int i = str.toLowerCase().length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}

		if (sb.toString().equalsIgnoreCase(str)) {
			System.out.println("Given String is a Palindrom String");
		} else {
			System.out.println("Given String is not a Palindrom String");
		}
	}
}
