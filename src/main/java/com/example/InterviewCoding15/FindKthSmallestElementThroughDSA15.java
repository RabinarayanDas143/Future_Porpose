package com.example.InterviewCoding15;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindKthSmallestElementThroughDSA15 {
	public static void main(String[] args) {
		int[] array = { 5, 3, 1, 8, 9 };
		int k = 3;
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for (int i : array) {
			pq.add(i);
			if (pq.size() > k) {
				pq.poll();
			}
		}
		System.out.println("Kth smallest number is :" + pq.peek());
	}
}
