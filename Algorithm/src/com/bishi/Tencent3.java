package com.bishi;

import java.util.Scanner;

public class Tencent3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String p = sc.nextLine();
		char[] strArray = str.toCharArray();
		char[] pArray = p.toCharArray();
		int num = 0;
		for(int i = 0;i < str.length()-p.length()+1;i++) {
			int tag = 0;
			for(int j = 0;j < p.length();j++) {
				if(strArray[i+j]==pArray[j]) {
					tag++;
				}
			}
			if(tag==p.length()) {
				num+=p.length();
			}
		}
		System.out.println(num*num);
	}

}
