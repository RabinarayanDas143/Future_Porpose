package com.example.InterviewCoding19;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindKthSmallestElementThroughDSA19 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int kth = 3;
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i < array.length; i++) {
			pq.add(array[i]);
			if (pq.size() > kth)
				pq.poll();
		}
		System.out.println(pq.peek());
	}
}
