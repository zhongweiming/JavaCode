package com.bishi;

import java.util.Scanner;

public class AiQiYi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String[] str1Array = str1.split(" ");
		int N = Integer.parseInt(str1Array[0]);
		int M = Integer.parseInt(str1Array[1]);
		int P = Integer.parseInt(str1Array[2]);
		String str2 = sc.nextLine();
		String[] str2Array = str2.split(" ");
		int[] A = new int[N];
		for(int i = 0;i < N;i++) {
			A[i] = Integer.parseInt(str2Array[i]);
		}
		String[][] strArray2 = new String[M][2];
		for(int i = 0;i < M;i++) {
			String str = sc.nextLine();
			String[] strArray = str.split(" ");
			strArray2[i][0] = strArray[0];
			strArray2[i][1] = strArray[1];
		}
		for(int i = 0;i < M;i++) {
			for(int j = 1;j <= N;j++) {
				if(Integer.parseInt(strArray2[i][1])==j) {
					if(strArray2[i][0].equals("A")) {//cannot use =="A"
						A[j-1]++;
					}else {
						A[j-1]--;
					}
				}
			}
		}
		int tag = A[P-1];
		int paiming = 1;
		quickSort(A,0,N-1);
		for(int i = 0; i < N;i++) {
			if(A[i]>tag) {
				paiming++;
			}
		}
		System.out.println(paiming);
	}
	public static void quickSort(int[] A,int p,int r) {
		if(p >= r) {
			return ;//排完了退出当前递归即可
		}
		else {
			int q = partition(A,p,r);
			quickSort(A,p,q-1);
			quickSort(A,q+1,r);
		}
	}
	public static int partition(int[] A,int p,int r) {
		int x = A[r],i = p-1;
			for(int j = p;j < r;j++) {
				if(A[j] <= x) {
					i++;
					swap(A,i,j);
				}
			}
			swap(A,i+1,r);
		return i+1;
	}
	public static void swap(int A[],int i,int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}

}
