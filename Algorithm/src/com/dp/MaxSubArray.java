package com.dp;

import java.util.Scanner;

public class MaxSubArray {

	int start=0;
	int end = 0;
	
	//找最大子数组位置和其值
	//第一种
	public int findMaxSubArray(int[] array){
		int maxValue = array[0];//假设即使全是负的最少有一个不小于-10000
		int[] dp = new int[array.length];
		dp[0]=array[0];
		int temp = 0;//记录起始位置
		for(int i = 1;i < array.length;i++) {
			if(dp[i-1]<=0) {//前面的都不要了，因为前面的加起来小于0
				dp[i]=array[i];
				temp = i;
			}else {
				dp[i]=array[i]+dp[i-1];
			}
			if(dp[i]>maxValue) {
				maxValue = dp[i];
				start = temp;
				end = i;
			}
		}
		return maxValue;
		
	}
	//第二种,不用dp数组，直接一个变量就ok
	public int findMaxSubArray2(int[] array){
		int maxValue = array[0];//假设即使全是负的最少有一个不小于-10000
		int dp=array[0];
		for(int i = 1;i < array.length;i++) {
			if(dp<=0) {//前面的都不要了，因为前面的加起来小于0
				dp=array[i];
				start = i;
			}else {
				dp+=array[i];
			}
			if(dp>maxValue) {
				maxValue = dp;
				end = i;
			}
		}
		return maxValue;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数组，逗号分隔开：");
		String[] str = sc.nextLine().split(",");
		int[] a = new int[str.length];
		for(int i = 0;i < str.length;i++) {
			a[i] = Integer.parseInt(str[i]);
		}
		MaxSubArray msa = new MaxSubArray();
		int value = msa.findMaxSubArray2(a);
		for(int i = msa.start;i <= msa.end;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		System.out.println("值为："+value);

	}

}
