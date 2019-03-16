package com.bishi;

import java.util.Scanner;

public class ShouHu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		String str1 = str[0];
		String str2 = str[1];
		String[] str11 = str1.split("[.]");
		String[] str22 = str2.split("[.]");
		if(str11.length==str22.length) {
			for(int i = 0;i<str11.length;i++) {
				if(Integer.parseInt(str11[i])<Integer.parseInt(str22[i])) {
					System.out.println(-1);
					return;
				}else if(Integer.parseInt(str11[i])>Integer.parseInt(str22[i])) {
					System.out.println(1);
					return;
				}
			}
			System.out.println(0);
		}

	}

}
