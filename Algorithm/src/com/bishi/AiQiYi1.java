package com.bishi;

import java.util.Scanner;

public class AiQiYi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strArray = str.split("");
		int[] num = new int[strArray.length];
		for(int i = 0;i < strArray.length;i++) {
			num[i] = Integer.parseInt(strArray[i]);
		}
		int previous = num[0]+num[1]+num[2];
		int last = num[3]+num[4]+num[5];
		if(previous==last) {
			System.out.println(0);
		}else {
			int max = previous>last?previous:last;
			int min = previous<last?previous:last;
			int temp = max-min;
			if(previous>last) {
				if(num[3]+temp<=9||num[4]+temp<=9||num[5]+temp<=9) {
					System.out.println(1);
					return;
				}
				if(num[0]>=temp||num[1]>=temp||num[2]>=temp) {
					System.out.println(1);
				}else if(num[0]+num[1]>=temp||num[0]+num[2]>=temp||num[1]+num[2]>=temp) {
					System.out.println(2);
				}else {
					System.out.println(3);
				}
			}else {
				if(num[0]+temp<=9||num[1]+temp<=9||num[2]+temp<=9) {
					System.out.println(1);
					return;
				}
				if(num[3]>=temp||num[4]>=temp||num[5]>=temp) {
					System.out.println(1);
				}else if(num[3]+num[4]>=temp||num[3]+num[5]>=temp||num[4]+num[5]>=temp) {
					System.out.println(2);
				}else {
					System.out.println(3);
				}
			}
		}
	}

}
