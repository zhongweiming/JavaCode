package com.greedy;

public class GreedyKnapsack {

	double x = 0;//记录最后一种物品装入背包的质量
	double v = 0;//记录总价值
	//求解装入背包的方案,返回装入背包的物品种类数量
	public int fractionalKnapsack(double[] p,double[] w,double W,int n) { 
		double c=W;
		int i = 0;
		for(i = 0;i<n;i++) {
			if(w[i]<=c) {
				c-=w[i];
				v+=p[i];
			}else {
				break;
			}
		}
		if(i<n) {
			x=c/w[i];
			v+=x*p[i];
			return i;
		}else {
			return n;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] p = {65,20,30,60,40};
		double[] w = {30,10,20,50,40};
		double W = 100;
		GreedyKnapsack gk = new GreedyKnapsack();
		int i = gk.fractionalKnapsack(p, w, W, p.length);
		System.out.println("装入背包的类型有:"+i+"种"+"  "+"总价值为:"+gk.v);

	}

}
