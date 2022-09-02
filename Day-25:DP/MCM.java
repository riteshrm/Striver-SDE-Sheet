
//Problem Link:-https://practice.geeksforgeeks.org/problems/matrix-chain-multiplication0303/1

import java.io.*;
import java.util.*;

public class MCM {

	 static int fun(int[][] dp,int i,int j,int[] arr){
        if(i>=j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int mini = Integer.MAX_VALUE;
        for(int x=i;x<j;x++){
            int steps = arr[i-1]*arr[x]*arr[j] + fun(dp,i,x,arr) + fun(dp,x+1,j,arr);
            mini = Math.min(mini,steps);
        }
        return dp[i][j] = mini;
    }
    static int matrixMultiplication(int N, int arr[])
    {
        // code here
        int[][] dp = new int[N][N];
        for(int i=0;i<N;i++){
            Arrays.fill(dp[i],-1);
        }
        return fun(dp,1,N-1,arr);
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
