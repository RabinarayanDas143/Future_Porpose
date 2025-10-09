package com.example.InterviewCoding10;

public class TrimaString10 {
public static void main(String[] args) {
	String str = "Rabinarayan Das";
	String res = str.substring(0, 4).concat("...").trim();
	System.out.println(res);
}
}
