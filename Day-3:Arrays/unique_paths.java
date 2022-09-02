
//Problem Link:-https://www.codingninjas.com/codestudio/problems/1081470?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class unique_paths {

	public static int fun(int[][] dp,int x,int y){
		if(x==0 && y==0){
			return 1;
		}
		if(x<0 || y<0){
			return 0;
		}
		if(dp[x][y]!=-1){
			return dp[x][y];
		}
		int up = fun(dp,x-1,y);
		int left = fun(dp,x,y-1);

		return dp[x][y] = up+left;

	}
	
	public static int uniquePaths(int m, int n) {
		// Write your code here.
		int[][] dp = new int[m][n];
		for(int i=0;i<m;i++){
			Arrays.fill(dp[i],-1);
		}

		return fun(dp,m-1,n-1);

        
	}


	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
			int m = sc.nextInt();
		    int n = sc.nextInt();
		    System.out.println(uniquePaths( m,  n));
			t--;
		}
		

		
	}
}
