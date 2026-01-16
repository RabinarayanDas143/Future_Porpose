package com.example.InterviewCoding11;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachChar11 {
	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		Map<Character, Integer> map = getFrequencyOfEachChar(str);
		//System.out.println(map);
	}

	public static Map<Character, Integer> getFrequencyOfEachChar(String str) {
           Map<Character, Integer> map = new HashMap<>();
           char[] charArray = str.toCharArray();
           for(int i=0;i<charArray.length;i++) {
        	   if(map.containsKey(charArray[i])) {
        		   map.put(charArray[i], map.get(charArray[i])+1);
        	   }else {
        		   map.put(charArray[i], 1);
        	   }
           }
           return map;
	}
}
