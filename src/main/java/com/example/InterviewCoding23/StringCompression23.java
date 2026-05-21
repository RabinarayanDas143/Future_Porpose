package com.example.InterviewCoding23;

public class StringCompression23 {
	public static void main(String[] args) {
		String str = "aabbbcccc";
		StringBuilder sb = new StringBuilder();
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
				count++;
				i++;
			}
			sb.append(str.charAt(i)).append(count);
			count = 1;
		}
		System.out.println(sb.toString());
	}
}
