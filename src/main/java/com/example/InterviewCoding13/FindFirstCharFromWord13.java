package com.example.InterviewCoding13;

public class FindFirstCharFromWord13 {
	public static void main(String[] args) {
		String str = "I am a Java Developer";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				if (i == 0 || str.charAt(i-1) == ' ') {
					sb.append(str.charAt(i) + " ");
				}
			}
		}
		System.out.println(sb.toString());
	}
}
