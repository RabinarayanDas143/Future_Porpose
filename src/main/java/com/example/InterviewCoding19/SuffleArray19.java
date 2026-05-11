package com.example.InterviewCoding19;

import java.util.Arrays;
import java.util.Random;

public class SuffleArray19 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			int index = rand.nextInt(array.length);
			int temp = array[i];
			array[i] = array[index];
			array[index] = temp;
		}
		System.out.println(Arrays.toString(array));
	}
}
