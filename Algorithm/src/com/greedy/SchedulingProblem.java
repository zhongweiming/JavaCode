package com.greedy;
import java.util.Arrays;

import com.sort_algorithm.*;
public class SchedulingProblem {

	//处理调度问题
	public void scheduling(int[] p) {
		new QuickSort().quickSort(p,0,p.length-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] p = {15,8,3,10};
		SchedulingProblem sp = new SchedulingProblem();
		sp.scheduling(p);
		System.out.println("调度顺序应该如下：");
		System.out.println(Arrays.toString(p));

	}

}
