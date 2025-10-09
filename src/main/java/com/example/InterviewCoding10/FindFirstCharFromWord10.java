package com.example.InterviewCoding10;

public class FindFirstCharFromWord10 {
public static void main(String[] args) {
	String str = "My name is java";
	String result = getFirstCharFromString(str);
	System.out.println(result);
}

private static String getFirstCharFromString(String str) {
	 StringBuilder sb = new StringBuilder();
	 for(int i=0;i<str.length();i++) {
		 if(str.charAt(i)!=' ') {
			 if(i==0||str.charAt(i-1)==' ') {
				 sb.append(str.charAt(i)+" ");
			 }
		 }
	 }
	return sb.toString();
}
}
