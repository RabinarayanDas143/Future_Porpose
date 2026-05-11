package com.example.InterviewCoding21;

public class PalindromString21 {
	public static void main(String[] args) {
		String str = "Level";
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		
		if(sb.toString().equalsIgnoreCase(str))
			System.out.println("Given string is a Palindrom String");
		else
			System.out.println("Given String is not a Palindrom");
	}
}
