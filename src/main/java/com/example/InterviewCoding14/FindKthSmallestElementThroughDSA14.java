package com.example.InterviewCoding14;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindKthSmallestElementThroughDSA14 {
public static void main(String[] args) {
	int[] array = {5,3,1,8,9};
	int k = 3;
	PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
	for(int i : array) {
		maxHeap.add(i);
		if(maxHeap.size()>3) {
			maxHeap.poll();
		}
	}
	System.out.println("Kth Smallest Element is :"+maxHeap.peek());
}
}
