package com.bishi;
import java.util.*;
public class Tencent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String str = sc.nextLine();
		String[] strArray = str.split(" ");
		int[] num = new int[n];
		int sum = 0;
		for(int i = 0;i < n;i++) {
			num[i] = Integer.parseInt(strArray[i]);
			sum+=num[i];
		}
		if(sum==1||sum==n) {
			System.out.println(1);
		}
		
		
		
	}

}
