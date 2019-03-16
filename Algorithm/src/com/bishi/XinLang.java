package com.bishi;

import java.util.Scanner;

public class XinLang {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strArray = str.split("[|]");
		String str1 = strArray[0];
		int n = Integer.parseInt(strArray[1]);
		String[] str1Array = str1.split(",");
		int length = str1Array.length;
		int[] intArray = new int[length];
		for(int i = 0;i < length;i++) {
			intArray[i] = Integer.parseInt(str1Array[i]);
		}
		int num = 0;
		for(int i = 0;i < length;i++) {
			for(int j = i;j < length;j++) {
				if(intArray[i]+intArray[j]==n) {
					num++;
				}
			}
		}
		System.out.println(num);
	}

}
