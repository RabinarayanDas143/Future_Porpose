package com.example.InterviewCoding12;

public class FindFirstCharFromWord12 {
	public static void main(String[] args) {
		String str = "My name is java";
		String result = getFirstChar(str);
		System.out.println(result);
	}

	public static String getFirstChar(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				if (i == 0 || str.charAt(i - 1) == ' ') {
					sb.append(str.charAt(i) + " ");
				}
			}
		}
		return sb.toString().trim();
	}
}
