package com.example.InterviewCoding11;

public class PalindromString11 {
	public static void main(String[] args) {
		String str = "Level";
		String result = checkPalindrom(str);
		System.out.println(result);
	}
	
	public static String checkPalindrom(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i=str.toLowerCase().length()-1;i>=0;i--) {
			sb.append(str.charAt(i));
		}
		if(str.equalsIgnoreCase(sb.toString())) {
			return "Given Stirng is a Palindrom";
		}else {
			return "Given String is not a Palindrom";
		}
	}
}
