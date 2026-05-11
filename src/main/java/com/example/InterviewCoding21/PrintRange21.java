package com.example.InterviewCoding21;

public class PrintRange21 {
public static void main(String[] args) {
	int num =10;
	for(int i=1;i<=10;i++) {
		for(int j=1;j<=10;j++) {
			System.out.print((i+j)-1);
			if(j<num) {
				System.out.print(",");
			}
		}
		System.out.println();
	}
}
}
