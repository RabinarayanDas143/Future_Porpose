package com.example.InterviewCoding27;

public class RevStringSeq27 {
	public static void main(String[] args) {
		String str = "Welcome";
		StringBuilder sb = new StringBuilder();
		for (int i = 0, j = 0; i < str.length(); i++, j++) {
			if (j % 2 == 0)
				sb.append(Character.toLowerCase(str.charAt(i)));
			else
				sb.append(Character.toUpperCase(str.charAt(i)));
		}
		System.out.println(sb.toString());
	}
}
