package com.niukewang;
import java.util.*;
public class LiveDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int days = 0;
        int x = Integer.parseInt(str[0]);
        int f = Integer.parseInt(str[1]);
        int d = Integer.parseInt(str[2]);
        int p = Integer.parseInt(str[3]);
        if(d/x <=f) {
        	days = d/x;
        	System.out.println(days);
        }else {
        	days = f+(d-x*f)/(x+p);
        	System.out.println(days);
        }


	}

}
