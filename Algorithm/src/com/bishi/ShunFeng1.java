package com.bishi;
import java.text.DateFormat;
import java.util.*;
public class ShunFeng1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		try {
			Date data1 = new Date(str1);
			Date data2 = new Date(str2);
			System.out.println(data1);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(1);
			return;
		}
	}

}
