package com.dp;

import java.util.Scanner;

//改进版，不用b
public class LCSubSequenceModify {

	int[][] c;
	//计算LCS的长度
	public int lcsLength(char[] X,char[] Y) {
		int m = X.length;
		int n = Y.length;
		c = new int[m+1][n+1];
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
				}else if(c[i-1][j]>=c[i][j-1]) {
					c[i][j] = c[i-1][j];
				}else {
					c[i][j] = c[i][j-1];
				}
			}
		}
		return c[m][n];
	}

	//输出LCS
	public void printLCS(int[][] c,char[] x,int i,int j) {
		if(i==0||j==0) {
			return;
		}
		if(c[i][j]==c[i-1][j]) {
			printLCS(c,x,i-1,j);
		}else if(c[i][j]==c[i][j-1]) {
			printLCS(c,x,i,j-1);
		}else if(c[i][j]==(c[i-1][j-1]+1)) {//要把这个判断条件放在最后面，否则诸如ABCD和AB这种前缀关系的字符串比较都会出现问题。
			printLCS(c,x,i-1,j-1);
			System.out.print(x[i-1]);
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
		LCSubSequenceModify lcssm = new LCSubSequenceModify();
		lcssm.lcsLength(x, y);
		lcssm.printLCS(lcssm.c, x, x.length, y.length);

	}

}
