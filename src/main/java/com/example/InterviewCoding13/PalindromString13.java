package com.example.InterviewCoding13;

public class PalindromString13 {
public static void main(String[] args) {
	String str = "Level";
	StringBuilder sb = new StringBuilder();
	for(int i=str.toLowerCase().length()-1;i>=0;i--) {
		sb.append(str.charAt(i));
	}
	if(str.equalsIgnoreCase(sb.toString())) {
		System.out.println("Given String is a Palindrom String");
	}else {
		System.out.println("Given String is not a Palindrom String");
	}
}
}
