
//Problem Link:-https://www.codingninjas.com/codestudio/problems/1550954?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=0

import java.io.*;
import java.util.*;

public class subset_sum {
	 static boolean fun(int[][] dp,int[] arr,int i,int k){
        if(k==0){
            return true;
        }
        if(i>=arr.length){
            return false;
        }
        if(k<0){
            return false;
        }
        if(dp[i][k]!=-1){
            return dp[i][k]==0?false:true;
        }
        boolean t = false;
        t = fun(dp,arr,i+1,k-arr[i]) || fun(dp,arr,i+1,k);
        if(t){
            dp[i][k] = 1;
        }
        else{
            dp[i][k] = 0;
        }
        return t;
    }
    public static boolean subsetSumToK(int n, int k, int arr[]){
        // Write your code here.
       int dp[][] = new int[n][k+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return fun(dp,arr,0,k);
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
