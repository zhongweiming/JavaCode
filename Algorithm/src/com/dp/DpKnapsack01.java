package com.dp;

public class DpKnapsack01 {

	int[][] c;
	public void knapsack01(int[] v,int[] w,int n,int W){
		c = new int[n+1][W+1];
		for(int i = 0;i <= W;i++) {
			c[0][i]=0;
		}
		for(int i = 1;i <= n;i++) {
			c[i][0]=0;
			for(int j = 1;j <= W;j++) {
				if(w[i-1]<=j) {//如果某物品的质量小于背包剩余质量
					if((c[i-1][j-w[i-1]]+v[i-1]) > c[i-1][j]) {//如果加入一个物品的最大价值大于不加该物品的最大价值
						c[i][j] = c[i-1][j-w[i-1]]+v[i-1];
					}else {
						c[i][j] = c[i-1][j];
					}
				}else {
					c[i][j] = c[i-1][j];
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DpKnapsack01 dpk = new DpKnapsack01();
		int[] v = {65,20,30,60,40};
		int[] w = {30,10,20,50,40};
		int W = 100;
		dpk.knapsack01(v, w, v.length, W);
		System.out.println(dpk.c[v.length][W]);

	}

}
