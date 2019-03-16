package com.sort_algorithm;

import java.util.Scanner;

public class InsertSort {

	public static void insertSort(int[] A) {
		for(int j = 2;j <= A.length;j++) {
			int key = A[j-1];
			int i = j-1;
			while(i > 0&&A[i-1]>key) {//转化成数组下标时要减一
				A[i-1+1] = A[i-1];
				i--;
			}
			A[i-1+1] = key;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		String[] str = num.split(" ");
		int[] p = new int[str.length];
		int i = 0;
		for(String str2:str) {
			p[i++] = Integer.parseInt(str2);
		}
		for(int j = 0;j < p.length;j++) {
			System.out.print(p[j]+" ");
		}
		insertSort(p);
		System.out.println("");
		System.out.println("排序后结果如下：");
		for(int j = 0;j < p.length;j++) {
			System.out.print(p[j]+" ");
		}
		System.out.println("");
	}

}
