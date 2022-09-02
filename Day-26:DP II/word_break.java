
//Problem Link:-https://practice.geeksforgeeks.org/problems/word-break1352/1

import java.io.*;
import java.util.*;

public class word_break {

	  static boolean valid(String s, Set<String> set){
         return set.contains(s);
    }
    
    static boolean fun(int[] dp,int i,String s,Set<String> set){
        if(i>=s.length()){
            return true;
        }
        if(dp[i]!=-1){
            return dp[i]==1?true:false;
        }
        boolean t = false;
        for(int j=i;j<s.length();j++){
            String ss = s.substring(i,j+1);
            if(valid(ss,set)){
                t = t||fun(dp,j+1,s,set);
            }
        }
        dp[i] = t?1:0;
        return t;
        
    }
    public static int wordBreak(String A, ArrayList<String> B )
    {
        //code here
        Set<String> set = new HashSet<>(B);
        int[] dp = new int[A.length()+1];
        Arrays.fill(dp,-1);
       if(fun(dp,0,A,set)){
           return 1;
       }
       return 0;
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
