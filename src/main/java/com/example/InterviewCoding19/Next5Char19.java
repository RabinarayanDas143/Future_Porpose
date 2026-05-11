package com.example.InterviewCoding19;

public class Next5Char19 {
public static void main(String[] args) {
	char c = 'e';
	for(int i=1;i<=5;i++) {
		char r = (char) (c+i);
		System.out.print(r+",");
	}
}
}
