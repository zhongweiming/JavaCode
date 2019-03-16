package com.bishi;
import java.util.*;
public class HaoWeiLai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		String[] s = str.split("\\s+");
//		int k = Integer.parseInt(s[0]),
//				b = Integer.parseInt(s[1]),
//				n = Integer.parseInt(s[2]),
//				t = Integer.parseInt(s[3]);
		int k = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		int t = sc.nextInt();
		int num = ceil(n,k,b);
		int result = second(t,num,k,b);
		System.out.println(num);
		System.out.println(result);
	}
	public static int ceil(int n,int k,int b) {
		if(n==1) {
			return k+b;
		}else {
			return k*ceil(n-1,k,b)+b;
		}
	}
	public static int second(int t,int num,int k,int b) {
		int temp = t*k+b;
		if(temp>=num) {
			return 1;
		}else {
			return 1+second(temp,num,k,b);
		}
	}
}
