package com.example.InterviewCoding19;

public class PrimeNumberCheck19 {
public static void main(String[] args) {
	int num = 3;
	boolean flag=true;
	if(num<=1)
		flag=false;
	
	for(int i=2;i<=Math.sqrt(num);i++) {
		if(num%i==0)
			flag=false;
	}
	
	if(flag)
		System.out.println("Given num. is a prime number");
	else
		System.out.println("Given num. is not a prime number."); 
}
}
