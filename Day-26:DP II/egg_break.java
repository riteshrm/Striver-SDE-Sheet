
//Problem Link:-https://practice.geeksforgeeks.org/problems/egg-dropping-puzzle-1587115620/1

import java.io.*;
import java.util.*;

public class egg_break {

	static int fun(int[][] dp,int n,int k){
         if(k==0 || k==1){
	        return k;
	    }
         if(n==1){
	        return k;
	    }
	   
	    if(dp[n][k]!=-1){
	        return dp[n][k];
	    }
	    int mm = Integer.MAX_VALUE;
	    for(int i=1;i<=k;i++){
	        int left = fun(dp,n,k-i);
	        int right = fun(dp,n-1,i-1);
	        int tmp = 1+Math.max(left,right);
	        mm = Math.min(mm,tmp);
	    }
	    return dp[n][k] = mm;
    }
    static int eggDrop(int n, int k) 
	{
	   int[][] dp = new int[n+1][k+1];
	   for(int i=0;i<=n;i++){
	       Arrays.fill(dp[i],-1);
	   }
	   return fun(dp,n,k);
	    
	}
	

	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}

		Scanner sc = new Scanner(System.in);
		
		
	}
}
