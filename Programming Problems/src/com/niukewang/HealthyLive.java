package com.niukewang;
import java.util.*;
public class HealthyLive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = Integer.parseInt(str);
		String[] str1 = new String[n];
		for(int i = 0 ;i < n;i++) {
			str1[i] = sc.nextLine();
		}
		for(int i = 0; i <n;i++) {
			String[] str2 = str1[i].split(" ");
			int N = Integer.parseInt(str2[0]);
			int A = Integer.parseInt(str2[1]);
			int B = Integer.parseInt(str2[2]);
			int C = Integer.parseInt(str2[3]);
			if((3*C%6+2*B%6)==7&&A==0) {//c剩下3,b剩下4时，如果a一个也没有，那么要么中暑，要么闹肚子
				if((3*C/6+2*B/6) >=N) {
					System.out.println("Yes");
				}else {
					System.out.println("No");
				}
			}else {
				if((3*C/6+2*B/6+(3*C%6+2*B%6+A)/6) >=N) {
					System.out.println("Yes");
				}else {
					System.out.println("No");
				}
			}
		}

	}

}
