package com.sort_algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class PriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {12,334,42,20,3,42};
		//用ArrayList 实现增加和删除元素
//		ArrayList<Integer> B = new ArrayList<Integer>();
//		for(int i = 0;i < 10;i++) {
//			B.add((int)(Math.random()*100));
//		}
//		B.
//		System.out.println(B.toString());
		PriorityQueue pq = new PriorityQueue();
		//System.out.println(pq.heapMaximum(A));
		//System.out.println(pq.heapExtractMax(A));
		pq.HeapIncreaseKey(A, 3, 50);
		System.out.println(Arrays.toString(A));
		
		
	}
	
	//返回集合中的最大值
	public int heapMaximum(int[] A) {
		new HeapSort().buildMaxHeap(A);
		return A[0];
	}
	
	//去掉并返回集合中的最大元素//对数组去掉也有点问题
	public int heapExtractMax(int[] A) {
		if(A.length < 1) {
			System.out.println("error");
			return 0;
		}
		HeapSort hs = new HeapSort();
		hs.buildMaxHeap(A);
		//System.out.println(Arrays.toString(A));
		int max = A[0];
		A[0] = A[A.length-1];
		hs.heapSize--;
		hs.maxHeapify(A, 1);
		//System.out.println(Arrays.toString(A));
		return max;
	}
	
	//将某元素的值增加到k
	public void HeapIncreaseKey(int[] A,int i,int k) {
		if(k < A[i-1]) {
			System.out.println("error,new key is smaller then the current key");
			return ;
		}
		new HeapSort().buildMaxHeap(A);

		A[i-1] = k;
		while(i > 1 && A[i/2-1] < A[i-1]) {//要特别注意数组用的时候要-1
			Exchange.swap(A, i-1, i/2-1);
			i = i/2;
		}
	}
	
	//将某元素插入集合中//数组添加元素要考虑考虑
	//public void 

}
