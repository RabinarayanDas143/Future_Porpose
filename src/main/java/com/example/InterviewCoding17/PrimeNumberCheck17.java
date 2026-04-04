package com.example.InterviewCoding17;

public class PrimeNumberCheck17 {
public static void main(String[] args) {
	int num = 7;
	boolean isPrime=false;
	if(num<=1)
		isPrime=false;
	
	for(int i=2;i<=Math.sqrt(num);i++) {
		if(num%i==0) {
			isPrime=false;
			//break;
		}
	}
	
	if(isPrime)
		System.out.println("Given num is a prime number");
	else
		System.out.println("Given num is not a prime number");
}
}
