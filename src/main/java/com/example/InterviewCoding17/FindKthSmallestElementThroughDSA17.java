package com.example.InterviewCoding17;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindKthSmallestElementThroughDSA17 {
	public static void main(String[] args) {
		int[] array = { 5, 3, 1, 8, 9 };
		int k = 3;
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for (int i : array) {
			pq.add(i);
			if (pq.size() > 3) {
				pq.poll();
			}
		}
		System.out.println(pq.peek());
	}
}
