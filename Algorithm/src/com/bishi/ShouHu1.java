package com.bishi;

import java.util.Scanner;

public class ShouHu1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		String str1 = sc.nextLine();
//		String str2 = sc.nextLine();
		String[] str = sc.nextLine().split(" ");
		String str1 = str[0];
		String str2 = str[1];
		if(str1.length()!=str2.length()||str1==""||str2=="") {
			System.out.println(0);
		}else {
			int len = str1.length();
			int tag = 0,j=0,test=0;
			int[] differ = new int[len];
			char[] array1 = str1.toCharArray();
			char[] array2 = str2.toCharArray();
			for(int i = 0;i <len-1;i++) {
				if(array1[i]==array1[i+1]&&array2[i]==array2[i+1]) {
					continue;
				}else {
					test=1;
				}
			}
			if(test!=1&&array1[0]==array2[0]) {
				System.out.println(1);
				return;
			}
			for(int i = 0;i < len;i++) {
				if(array1[i]==array2[i]) {
					continue;
				}else {
					tag++;
					differ[j++] = i;
				}
			}
			if(tag==2) {
				if(array1[differ[0]]==array2[differ[1]]&&array1[differ[1]]==array2[differ[0]]) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
			}else {
				System.out.println(0);
			}
		}
	}

}
