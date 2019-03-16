package com.sort_algorithm;

import java.util.Arrays;

public class HeapSort {
	//heapSize的作用是为了防止最后排序的时候一直对数组最后一个数做maxHeapify.
	//会导致结果错误。
	public int heapSize;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {12,3,42,24,33,44,21,333};
		System.out.println(Arrays.toString(A));
		new HeapSort().heapSort(A);
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(A));
	}
	//堆排序算法
	//由于数组的原因最后再-1
	public  void heapSort(int[] A) {
		buildMaxHeap(A);
		//System.out.println(Arrays.toString(A));
		for(int i = A.length;i > 1;i--) {
			Exchange.swap(A,0,i-1);
			heapSize--;//heapSize是有作用的呀
			maxHeapify(A,1);
			//System.out.println(Arrays.toString(A));
		}
	}
	
	//建立大顶堆
	public void buildMaxHeap(int[] A) {
		heapSize = A.length;
		for (int i = A.length/2;i > 0;i--) {
			maxHeapify(A,i);
		}
	}
	
	//让每个含叶子结点的子树都成为大顶堆
	public void maxHeapify(int[] A,int i) {//只要涉及到和数组下标相关的，都要注意下标是否需要减1
		int l = left(i)-1;
		int r = right(i)-1;
		int largest = i-1;
		if(l < heapSize &&A[l] > A[i-1]) {//防止数组越界
			largest = l;
		}
		if(r < heapSize &&A[r] > A[largest]) {//防止数组越界
			largest = r;
		}
		if(largest != i-1) {
			Exchange.swap(A, i-1, largest);
			maxHeapify(A,largest+1);
		}
	}
	//结点之间的关系
	public int parent(int i) {
		return i/2;
	}
	public int left(int i) {
		return 2*i;
	}
	public int right(int i) {
		return 2*i+1;
	}

}
