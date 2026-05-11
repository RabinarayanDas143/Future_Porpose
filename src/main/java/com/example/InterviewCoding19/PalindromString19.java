package com.example.InterviewCoding19;

public class PalindromString19 {
public static void main(String[] args) {
	String str = "Level";
	StringBuilder sb = new StringBuilder();
	for(int i=str.length()-1;i>=0;i--) {
		sb.append(str.charAt(i));
	}
	
	if(str.equalsIgnoreCase(sb.toString()))
		System.out.println("Given String is a Palindrom");
	else
		System.out.println("Given Stirng is not a Palindrom");
}
}
