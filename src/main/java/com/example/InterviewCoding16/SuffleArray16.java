package com.example.InterviewCoding16;

import java.util.Arrays;
import java.util.Random;

public class SuffleArray16 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			int randNum = rand.nextInt(array.length - 1);
			int temp = array[i];
			array[i] = array[randNum];
			array[randNum] = temp;
		}
		System.out.println(Arrays.toString(array));
	}
}
