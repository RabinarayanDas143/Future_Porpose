package com.example.InterviewCoding12;

public class ReverseStringWordBasis12 {
public static void main(String[] args) {
	String str = "My Name is Rabi";
	String st[] = str.split(" ");
	StringBuilder sb = new StringBuilder();
	for(int i=0;i<st.length;i++) {
		String reverse = doReverse(st[i]);
		sb.append(reverse+" ");
	}
	System.out.println(sb.toString());
}

private static String doReverse(String str) {
	 StringBuilder sb = new StringBuilder();
	 for(int i=str.length()-1;i>=0;i--) {
		 sb.append(str.charAt(i));
	 }
	return sb.toString();
}
}
