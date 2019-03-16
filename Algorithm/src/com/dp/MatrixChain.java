package com.dp;

import java.util.Scanner;

public class MatrixChain {

	public int[][] m,s;
	public int n;
	
	public void matrixChainOrder(int[] p) {
		n = p.length - 1;
		m = new int[n+1][n+1];
		s = new int[n+1][n+1];
		for(int i=1;i <= n;i++) {//m[0][0]这部分不要了
			m[i][i]=0;
		}
		for(int l = 2;l <= n;l++) {
			for(int i = 1;i <= n-l+1;i++) {
				int j = i+l-1;
				m[i][j] = m[i][i]+m[i+1][j]+p[i-1]*p[i]*p[j];
				for(int k = i;k <= j-1;k++) {
					int q = m[i][k]+m[k+1][j]+p[i-1]*p[k]*p[j];
					if(q <= m[i][j]) {
						m[i][j] = q;
						s[i][j] = k;
					}
				}
			}
		}
	}
	public void printOptimalParens(int[][] s,int i,int j) {
		if(i==j) {
			System.out.print("A"+i);
		}else {
			System.out.print("(");
			printOptimalParens(s,i,s[i][j]);
			printOptimalParens(s,s[i][j]+1,j);
			System.out.print(")");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] p = {30,35,15,5,10,20,25};
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		String[] str = num.split(" ");
		int[] p = new int[str.length];
		int i = 0;
		for(String str2:str) {
			p[i++] = Integer.parseInt(str2);
		}
		MatrixChain mc = new MatrixChain();
		mc.matrixChainOrder(p);
		mc.printOptimalParens(mc.s,1,p.length -1);
		

	}

}
