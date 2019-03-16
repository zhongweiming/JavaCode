package com.dp;

import java.util.Scanner;

public class LCSubSequence {
	
	int[][] c;
	String[][] b;
	//计算LCS的长度
	public int lcsLength(char[] X,char[] Y) {
		int m = X.length;
		int n = Y.length;
		c = new int[m+1][n+1];
		b = new String[m+1][n+1];
		for(int i = 1;i <= m;i++) {
			c[i][0] = 0;
		}
		for(int j = 1;j < n; j++) {
			c[0][j] = 0;
		}
		for(int i = 1;i <= m;i++) {
			for (int j = 1;j <= n;j++) {
				if(X[i-1]==Y[j-1]) {
					c[i][j] = c[i-1][j-1]+1;
					b[i][j] = "diagonal";//对角线
				}else if(c[i-1][j]>=c[i][j-1]) {
					c[i][j] = c[i-1][j];
					b[i][j] = "up";
				}else {
					c[i][j] = c[i][j-1];
					b[i][j] = "left";
				}
			}
		}
		return c[m][n];
	}

	//输出LCS
	public void printLCS(String[][] b,char[] x,int i,int j) {
		if(i==0||j==0) {
			return;
		}
		if(b[i][j]=="diagonal") {
			printLCS(b,x,i-1,j-1);
			System.out.print(x[i-1]);
		}else if(b[i][j]=="up") {
			printLCS(b,x,i-1,j);
		}else {
			printLCS(b,x,i,j-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个字符串：");
		x = sc.nextLine().toCharArray();
		System.out.println("请输入第二个字符串：");
		y = sc.nextLine().toCharArray();
		LCSubSequence lcss = new LCSubSequence();
		lcss.lcsLength(x, y);
		lcss.printLCS(lcss.b, x, x.length, y.length);

	}

}
