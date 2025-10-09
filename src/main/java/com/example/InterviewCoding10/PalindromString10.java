package com.example.InterviewCoding10;

public class PalindromString10 {
	public static void main(String[] args) {
		String str = "Level";
		String pali = checkPali(str);
		System.out.println(pali);
	}

	private static String checkPali(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		if (str.equalsIgnoreCase(sb.toString()))
			return "Given String is Palindrom";
		else
			return "Given String is not Palindrom";
	}
}
