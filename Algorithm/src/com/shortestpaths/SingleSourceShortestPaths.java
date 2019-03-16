package com.shortestpaths;

import java.util.Scanner;

public class SingleSourceShortestPaths {
	
	public static final int max = 10000;//假设最短路径长最多不超过10000
	//Dijkstra's algorithm
	
	
	//Bellman-Ford algorithm
	public void BellmanFord(Edge[] a,int[] d) {
		d[0] = 0;
		for(int i =1 ;i<d.length;i++) {
			d[i] = max;
		}
		for(int i=0;i<d.length-1;i++) {
			for(int j = 0;j<a.length;j++) {
				if(d[a[j].getV()]>d[a[j].getU()]+a[j].getW()) {
					d[a[j].getV()] = d[a[j].getU()]+a[j].getW();
				}
			}
		}
		for(int j = 0; j<a.length;j++) {
			if(d[a[j].getV()]>d[a[j].getU()]+a[j].getW()) {
				System.out.println("存在负环");
			}
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0,edgeNum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入结点数：");
		n = sc.nextInt();
		System.out.println("请输入边数：");
		edgeNum = sc.nextInt();
		Edge[] edge = new Edge[edgeNum];
		int[] d = new int[n];
		SingleSourceShortestPaths sssp = new SingleSourceShortestPaths();
//		for(int i = 0;i < edgeNum;i++) {
//			System.out.println("请输入第"+(i+1)+"条边及其权值，形如:0 2 3(边为0到2，权值为3)");
//			String str1 = sc.nextLine();
//			String[] str = str1.split(" ");
//			edge[i] = new Edge(Integer.parseInt(str[0].trim()), Integer.parseInt(str[1].trim()), Integer.parseInt(str[2].trim()));
//		}//为什么报格式转换错误！
		edge[0] = new Edge(0, 1, -1);
		edge[1] = new Edge(0, 2, 3);
		edge[2] = new Edge(1, 2, 3);
		edge[3] = new Edge(1, 3, 2);
		edge[4] = new Edge(1, 4, 2);
		edge[5] = new Edge(3, 1, 1);
		edge[6] = new Edge(3, 2, 5);
		edge[7] = new Edge(4, 3, -3);
		sssp.BellmanFord(edge, d);
		for(int i = 0;i < d.length; i++) {
			char a = (char) (i+65);
			System.out.println("结点"+a+"最短路径为:"+d[i]);
		}
	}
}
class Edge{
	int u,v,w;

	public Edge(int u,int v,int w) {
		this.u = u;
		this.v = v;
		this.w = w;
	}
	public int getU() {
		return u;
	}

	public void setU(int u) {
		this.u = u;
	}

	public int getV() {
		return v;
	}

	public void setV(int v) {
		this.v = v;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}
	
}
