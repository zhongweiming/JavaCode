package com.shortestpaths;

import java.util.Scanner;

public class AllSourcesShortestPaths {

	//Floyed-Warshall算法
	public void floyedWarshall(int[][] c,int n) {
		for(int k = 0;k < n;k++) {
			for(int i = 0;i < n;i++) {
				for(int j = 0;j < n;j++) {
					if(c[i][j]>c[i][k]+c[k][j]){
						c[i][j] = c[i][k]+c[k][j];
					}
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入结点数：");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] c = new int[n][n];
		System.out.println("请输入各条边权值，边不存在的默认写9999");
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < n;j++) {
				c[i][j]=sc.nextInt();
			}
		}
		AllSourcesShortestPaths assp = new AllSourcesShortestPaths();
		assp.floyedWarshall(c, n);
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < n;j++) {
				System.out.println("结点"+i+"到结点"+j+"的最短路径为："+c[i][j]);
			}
		}

	}

}
