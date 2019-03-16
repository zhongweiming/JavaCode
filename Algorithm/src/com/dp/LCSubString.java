package com.dp;

import java.util.Scanner;

public class LCSubString {

	int[][] c;
	int m=0,n=0;
	//求解LCS
	public int LCSLength(String str1,String str2) {
		int len1 = str1.length();
		int len2 = str2.length();
		int result = 0;
		c = new int[len1+1][len2+1];
		for(int i=0;i<=len1;i++) {
			c[i][0] = 0;
		}
		for(int j = 0;j <=len2;j++) {
			c[0][j] = 0;
		}
		int max =0;
		for(int i=1;i<=len1;i++) {
			for(int j=1;j<=len2;j++) {
				if(str1.charAt(i-1)==str2.charAt(j-1)) {
					c[i][j]=c[i-1][j-1]+1;
					if(c[i][j]>max) {
						m=i;//为了获得最大字串最后的值，以便能够找到输出最大子串
						n=j;
						max=c[i][j];
					}
				}else {
					c[i][j]=0;
				}
			}
		}
		return max;
	}
	//输出最大子串
	public void printLCS(int[][] c,String str1,int m,int n) {
		if(c[m][n]==0) {
			return ;
		}else {
			printLCS(c,str1,m-1,n-1);
			System.out.print(str1.charAt(m-1));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 ;
		String str2 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个字符串：");
		str1 = sc.nextLine();
		System.out.println("请输入第二个字符串：");
		str2 = sc.nextLine();
		LCSubString lcss = new LCSubString();
		int a = lcss.LCSLength(str1, str2);
		System.out.println(a);
		lcss.printLCS(lcss.c, str1,lcss.m, lcss.n);
	}

}
