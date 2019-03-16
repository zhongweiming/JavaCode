package com.backtracking;

public class KnapsackProblem {

	int fw,fp;
	//解决0-1背包问题
	public void knapsack(int M,int n,int[] w,int[] p ) {
		int cw=0,cp = 0,k=1;
		int[] Y = new int[n+1];
		fp = -1;
		while(true) {
		    while (k<= n&&(cw+w[k-1]) <= M) {
		    	cw+=w[k-1];
		    	cp+=p[k-1];
		    	Y[k] = 1;
		    	k++;
		    }
	    if(k > n) {
	    	fp = cp;
	    	fw = cw;
	    	k = n;
	    }else {
	    	Y[k] = 0;
	    }
	    while(bound(cp,cw,k,M,n,w,p)<=fp) {
	    	while(k!=0&&Y[k]!=1) {
	    		k--;
	    	}
	    	if(k==0) {
	    		return;
	    	}
	    	Y[k]=0;
	    	cw-=w[k-1];
	    	cp-=p[k-1];
	    }
	    k++;
}
}
			    
	public int bound(int cp,int cw,int k,int M,int n,int[] w,int[] p) {
		int b = cp,c =cw;
		for(int i = k+1;i <= n;i++) {
			c = c+w[i-1];
			if(c<M) {
				b+=p[i-1];
			}else {
				return (b+(1-(c-M)/w[i-1])*p[i-1]);
			}
		}
		return b;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] p = {65,20,30,60,40};
		int[] w = {30,10,20,50,40};
		KnapsackProblem kp = new KnapsackProblem();
		kp.knapsack(100, 5, w, p);
		System.out.println("背包占用："+kp.fw);
		System.out.println("价值为："+kp.fp);
		
	}

}
