package com.backtracking;

import java.util.Scanner;

public class NQueenProblem {

	public int[] x;
	public void nQueen(int n) {
		x = new int[n+1];
		x[1] = 0;
		int k = 1;
		while(k>0) {
			x[k]++;
			while(x[k]<=n&&!place(k)) {//判断该皇后所在位置合不合法，找到合法位置为止
				x[k]++;
			}
			if(x[k]<=n) {
				if(k==n) {
					k=0;//找到，退出循环，结束
				}else {
					k++;
					x[k]=0;
				}
			}else {
				k--;
			}
		}
	}
	//判断该皇后为止是否合法
	public boolean place(int k) {
		int i = 1;
		while(i<k) {
			if(x[i]==x[k]||(x[i]-x[k])==(i-k)||(x[i]-x[k])==(k-i)) {
				return false;
			}
			i++;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NQueenProblem nq = new NQueenProblem();
		System.out.println("请输入多少个皇后:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		nq.nQueen(n);
		for(int i = 1;i <= n;i++) {
			System.out.println("第"+i+"个皇后在: 第"+i+"行"+nq.x[i]+"列");
		}

	}

}
