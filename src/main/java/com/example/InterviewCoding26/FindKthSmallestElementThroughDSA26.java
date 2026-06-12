package com.example.InterviewCoding26;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindKthSmallestElementThroughDSA26 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int k = 3;
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for (int i : array) {
			pq.add(i);
			if (pq.size() > k)
				pq.poll();
		}
		System.out.println(pq.peek());
	}
}
