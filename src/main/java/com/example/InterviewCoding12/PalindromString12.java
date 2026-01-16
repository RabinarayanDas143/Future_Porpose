package com.example.InterviewCoding12;

public class PalindromString12 {
	public static void main(String[] args) {
		String str = "Level";
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.toLowerCase().charAt(i));
		}
		if(str.equalsIgnoreCase(sb.toString())) {
			System.out.println("Given string is palindrom string.");
		}else {
			System.out.println("Given string is not palindrom string.");
		}
	}
}
