package com.example.InterviewCoding17;

import java.util.Stack;

public class RemoveAdjacent17 {
	public static void main(String[] args) {
       String str = "aabbaca";
       Stack<Character> st = new Stack<>();
       for(int i=0;i<str.length();i++) {
    	   if(!st.isEmpty() && st.peek()==str.charAt(i))
    		   st.pop();
    	   else
    		   st.add(str.charAt(i));
       }
       System.out.println(st);
	}
}
