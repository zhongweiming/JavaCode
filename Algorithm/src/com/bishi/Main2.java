package com.bishi;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main2 {


/*请完成下面这个函数，实现题目要求的功能
当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^ 
******************************开始写代码******************************/
    static int solve(int n) {
		int temp=0,res=0;
		temp=n-2;
		if(temp%2==0) {
			res=(temp/2)*(temp/2);
		}else {
			res=((temp+1)/2)*((temp-1)/2);
		}
		return res;

    }
/******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res,n;
        n=Integer.parseInt(in.nextLine());
        String[] s=new String[n-1];
        for(int i=0;i<n-1;i++){
			s[i]=in.nextLine();
        }
        res = solve(n);
        System.out.println(String.valueOf(res));    

    }
}
