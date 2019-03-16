package com.bishi;
import java.util.*;
public class haoweilai2 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().split(" ");
		long min = Integer.parseInt(s[0]);
		long max = Integer.parseInt(s[1]);
		long num = 0;
		for(long i = min;i < max+1;i++) {
			if(i<10) {
				num++;
			}else {
				String str = i+"";
				char[] array = str.toCharArray();
				if(array[0]==array[array.length-1]) {
					num++;
				}
			}
		}
		System.out.println(num);
	}

}
