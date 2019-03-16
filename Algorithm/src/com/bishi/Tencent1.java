package com.bishi;

import java.util.Scanner;

public class Tencent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		String[] nums = new String[num];
		for(int i = 0;i < num;i++) {
			nums[i] = sc.nextLine();
		}
		for(int i = 0;i < num;i++) {
			String[] single = nums[i].split("");
			int sum = 0;
			for(int j = 0;j < single.length;j++) {
				sum+=Integer.parseInt(single[j]);
			}
			int number = Integer.parseInt(nums[i]);
			if(number%sum==0) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}

}
