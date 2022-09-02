
//Problem Link:-https://practice.geeksforgeeks.org/problems/maximum-sum-increasing-subsequence4749/1

import java.io.*;
import java.util.*;

public class max_sum_increasing_subsequence {


		public int maxSumIS(int arr[], int n)  
	{  
	    //code here.
	    int[] dp = new int[n];
	    for(int i=0;i<n;i++){
	        dp[i] = arr[i];
	    }
	    
	    int ans = 0;
	    for(int i=0;i<n;i++){
	        for(int j=0;j<i;j++){
	            if(arr[i]>arr[j] && dp[j]+arr[i]>dp[i]){
	                dp[i] = dp[j] + arr[i];
	                
	            }
	        }
	        ans = Math.max(ans,dp[i]);
	    }
	    return ans;
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
