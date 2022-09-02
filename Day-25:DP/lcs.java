
//Problem Link:-https://www.codingninjas.com/codestudio/problems/624879?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class lcs {

	 static int fun(int[][] dp,String s,String t,int i1,int i2){
        
        if(i1>=s.length() || i2>=t.length()){
            return 0;
        }
        if(dp[i1][i2]!=-1){
            return dp[i1][i2];
        }
        int kk=0;
        if(s.charAt(i1)==t.charAt(i2)){
            kk = 1+fun(dp,s,t,i1+1,i2+1);
        }
        int left = fun(dp,s,t,i1,i2+1);
        int right = fun(dp,s,t,i1+1,i2);
        return dp[i1][i2] = Math.max(kk,Math.max(left,right));
    }

    static int tab(String s,String t){
        int[][] dp = new int[s.length()+1][t.length()+1];
       for(int i1 = s.length()-1;i1>=0;i1--){
           for(int i2 = t.length()-1;i2>=0;i2--){
                int kk=0;
        if(s.charAt(i1)==t.charAt(i2)){
            kk = 1+dp[i1+1][i2+1];
        }
        int left = dp[i1][i2+1];
        int right = dp[i1+1][i2];
        dp[i1][i2] = Math.max(kk,Math.max(left,right));
           }
       }
       return dp[0][0];
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
