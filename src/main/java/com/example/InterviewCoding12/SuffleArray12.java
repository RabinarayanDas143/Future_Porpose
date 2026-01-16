package com.example.InterviewCoding12;

import java.util.Arrays;
import java.util.Random;

public class SuffleArray12 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			int randomIndex = rand.nextInt(array.length - 1);
			int randIndexNum = array[randomIndex];
			int temp = array[i];
			array[i] = randIndexNum;
			array[randomIndex] = temp;
		}
		System.out.println(Arrays.toString(array));
	}
}
