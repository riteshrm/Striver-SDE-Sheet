
//Problem Link:-https://practice.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1

import java.io.*;
import java.util.*;

public class knapsack_0_1 {

	 static int tab(int[] w,int v[],int wt,int n){
        
        int[][] dp = new int[n][wt+1];
        for(int i=w[n-1];i<=wt;i++){
            dp[n-1][i] = v[n-1];
        }
        for(int i=n-2;i>=0;i--){
            for(int j=0;j<=wt;j++){
                 int left = dp[i+1][j];
                int right = 0;
               if(j>=w[i]){
                   right = v[i]+dp[i+1][j-w[i]];
           }
       dp[i][j] = Math.max(left,right);
            }
        }
        return dp[0][wt];
       
        
    }

	static int fun(int[][] dp,int[] w,int v[],int wt,int i){
        if(i==w.length-1){
            if(wt>=w[i]){
                return v[i];
            }
            return 0;
        }
        if(dp[i][wt]!=-1){
            return dp[i][wt];
        }
        int left = fun(dp,w,v,wt,i+1);
        int right = 0;
        if(wt>=w[i]){
            right = v[i]+fun(dp,w,v,wt-w[i],i+1);
        }
        return dp[i][wt] = Math.max(left,right);
        
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
