
//Problem Link:-https://www.codingninjas.com/codestudio/problems/minimum-path-sum_985349?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=1

import java.io.*;
import java.util.*;

public class minimum_path_sum {

	 static int rec(int[][] dp,int[][] grid,int x,int y){
        if(x<0 || y<0){
            return (int)Math.pow(10,9);
        }
        if(x==0 && y==0){
            return grid[0][0];
        }
        if(dp[x][y]!=-1){
            return dp[x][y];
        }
        int up = rec(dp,grid,x-1,y);
        int left = rec(dp,grid,x,y-1);
        return dp[x][y] = (Math.min(up,left)+grid[x][y]);
    }
    public static int minSumPath(int[][] grid) {
    	// Write your code here.
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return rec(dp,grid,n-1,m-1);
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
