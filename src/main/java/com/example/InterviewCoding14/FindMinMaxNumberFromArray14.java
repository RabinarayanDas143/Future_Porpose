package com.example.InterviewCoding14;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindMinMaxNumberFromArray14 {
	public static void main(String[] args) {
		int[] array = { 5, 1, 4, 2, 3, 6, 9, 7, 8, 10 };
		int minValue = array[0];
		int maxValue = array[0];
		for (int i : array) {
			if (i < minValue) {
				minValue = i;
			} else if (i > maxValue) {
				maxValue = i;
			}
		}
		// System.out.println("Min Value :"+minValue);
		// zSystem.out.println("Max value :"+maxValue);

		PriorityQueue<Integer> prior = new PriorityQueue<>();
		for (int i : array) {
			prior.add(i);
		}
		System.out.println("Min value :" + prior.peek());

		PriorityQueue<Integer> prior1 = new PriorityQueue<>(Collections.reverseOrder());
		for (int i : array) {
			prior1.add(i);
		}
		System.out.println("Max value :" + prior1.peek());
	}
}
