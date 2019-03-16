package com.sort_algorithm;
import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int A[]= {13,45,12,75,3,443,23,445,7};
		//输入排序的数量和对应的数
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int A[] = new int[count];
		for(int i = 0;i < count;i++) {
			A[i] = sc.nextInt();
		}
//		try {
//			new QuickSort().quickSort(A,0,A.length-1);
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		new QuickSort().quickSort(A,0,A.length-1);
		System.out.println(Arrays.toString(A));
	}
	//实现快排的函数
	public  void quickSort(int[] A,int p,int r) {
		if(p >= r) {
			return ;//排完了退出当前递归即可
		}
		else {
			int q = partition(A,p,r);
			quickSort(A,p,q-1);
			quickSort(A,q+1,r);
		}
	}
	public int partition(int[] A,int p,int r) {
		int x = A[r],i = p-1;
			for(int j = p;j < r;j++) {
				if(A[j] <= x) {
					i++;
					Exchange.swap(A,i,j);
				}
			}
			Exchange.swap(A,i+1,r);
		return i+1;
	}
}

