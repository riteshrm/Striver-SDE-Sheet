
//Problem Link:-https://www.codingninjas.com/codestudio/problems/630471?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class coin_change{
	
	static long fun(long[][] dp,int i,int sum,int[] arr){
        if(i==0){
            if(sum%arr[0]!=0) return 0;
            return 1;
        }
       
        if(dp[i][sum]!=-1){
            return dp[i][sum];
        }
       long no = fun(dp,i-1,sum,arr);
        long ta  = 0;
        if(sum>=arr[i]){
            ta = fun(dp,i,sum-arr[i],arr);
        }
           
        return dp[i][sum]=no+ta;
    }
	public static long countWaysToMakeChange(int num[], int x){
        //write your code here			
      long[][] dp = new long[num.length][x+1];
        for(int i=0;i<num.length;i++){
            Arrays.fill(dp[i],-1);
        }
        
        return fun(dp,num.length-1,x,num);
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
