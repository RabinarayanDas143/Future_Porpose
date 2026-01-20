package com.example.java8CodingQuestion9;

import java.util.Arrays;

public class FindLongestWordInaString9 {
public static void main(String[] args) {
	String str = "Good Morning Rabinarayan";
	String res = Arrays.stream(str.split(" ")).reduce(" ", (a,b)->a.length()>b.length()?a:b);
	System.out.println(res);
}
}
