package com.sort_algorithm;

import java.util.Arrays;

public class MergeSortAndBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {12,3,21,44,4,55,43,2};
		boolean result = false;
		System.out.println(Arrays.toString(A));
		try {
			result = new MergeSortAndBinarySearch().judge(A, 100);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Arrays.toString(A));
		System.out.println(result);
	}
	
	//输入一个数组S和一个数x ，判断数组中是否存在两数之和为x
	public boolean judge(int[] A,int x) throws Exception{
		mergeSort(A,1,A.length);
		int n = A.length;
		for(int i = 0;i < n-1;i++) {
			if(binarySearch(A,x-A[i],i+1,n-1)) {
				return true;
			}
		}
		return false;
	}
	
	//归并排序
	public void mergeSort(int[] A,int p,int r) throws Exception{
		if(p < r) {
			int q = (p+r)/2;
			mergeSort(A,p,q);
			mergeSort(A,q+1,r);
			merge(A,p,q,r);
		}else {
			return ;
		}
	}
	public void merge(int[] A,int p,int q,int r) throws Exception{
		int n1 = q-p+1,n2 = r-q,i = 0,j = 0;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for(i = 0;i < n1;i++) {
			L[i] = A[p+i-1];
		}
		for(j = 0;j < n2;j++) {
			R[j] = A[q+j];
		}
		i=0;
		j=0;
		for(int k = p-1;k < r;k++) {
			if(i<n1&&j<n2) {
				if(L[i] <= R[j]) {
					A[k] = L[i++];
				}
				else {
					A[k] = R[j++];
				}
			}
			else if(i==n1) {
				A[k] = R[j++];
			}
			else if(j==n2) {
				A[k] = L[i++];
			}
		}
		
	}
	public boolean binarySearch(int[] A,int num,int i,int n) {
		if(i < n) {
			if(num==A[i]||num==A[n]) {
				return true;
			}
			int half = (i+n)/2;
			if(num==A[half]) {
				return true;
			}
			else if(num < A[half]) {
				//binarySearch(A,num,i,half);错误做法，因为如果递归调用了这个
				//，返回true,会继续往下执行到最后的false，加一个return 就可以把true返回，
				//这才叫递归返回啊！！！记住了
				return binarySearch(A,num,i,half);
			}else {
				return binarySearch(A,num,half+1,n);
			}
		}
		else if(i==n) {
			if(A[i]==num) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}

}
