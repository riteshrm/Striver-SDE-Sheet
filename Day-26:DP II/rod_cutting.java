
//Problem Link:-https://leetcode.com/problems/minimum-cost-to-cut-a-stick/

import java.io.*;
import java.util.*;

public class tmp {


	 static int tab(int[] price,int n){
        int[][] dp = new int[n][n+1];
        for(int i=0;i<=n;i++){
            dp[0][i] = i*price[0];
        }
       for(int i=1;i<n;i++){
           for(int j=1;j<=n;j++){
                int left = dp[i-1][j];
               int right = j*price[0];
              if(j>=i+1){
                 right = Math.max(price[i]+dp[i][j-i-1],right);
                 }
        dp[i][j]=Math.max(left,right);
           }
       }
       return dp[n-1][n];
    }


	static int fun(int[][] dp,int[] price,int len,int i){
        if(i==0){
           return len*price[0];
            
        }
        if(len==0){
            return 0;
        }
        if(dp[i][len]!=-1){
            return dp[i][len];
        }
        int left = fun(dp,price,len,i-1);
        int right = len*price[0];
        if(len>=i+1){
            right = Math.max(price[i]+fun(dp,price,len-i-1,i),right);
        }
        return dp[i][len]=Math.max(left,right);
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
