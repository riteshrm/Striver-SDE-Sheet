
//Problem Link:-https://www.codingninjas.com/codestudio/problems/630420?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class edit_distance {

	 static int fun(int[][] dp,String s1,String s2,int i1,int i2){
       if(i1<0){
           return i2+1;
       }
       if(i2<0){
           return i1+1;
       }
        if(dp[i1][i2]!=-1){
            return dp[i1][i2];
        }
        if(s1.charAt(i1)==s2.charAt(i2)){
            return dp[i1][i2] = fun(dp,s1,s2,i1-1,i2-1);
        }
        int in = fun(dp,s1,s2,i1,i2-1);
        int del = fun(dp,s1,s2,i1-1,i2);
        int re = fun(dp,s1,s2,i1-1,i2-1);
        return dp[i1][i2] = 1+Math.min(in,Math.min(del,re));
    }

    public static int editDistance(String str1, String str2) {
        //Your code goes here
        int[][] dp = new int[str1.length()][str2.length()];
       for(int i=0;i<str1.length();i++){
           Arrays.fill(dp[i],-1);
       }
        return fun(dp,str1,str2,str1.length()-1,str2.length()-1);
            
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
