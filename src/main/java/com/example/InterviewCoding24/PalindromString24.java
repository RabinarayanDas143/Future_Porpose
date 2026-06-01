package com.example.InterviewCoding24;

public class PalindromString24 {
	public static void main(String[] args) {
		String str = "Level";
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		if (sb.toString().equalsIgnoreCase(str))
			System.out.println("Palindrom string");
		else
			System.out.println("Nottt");
	}
}
