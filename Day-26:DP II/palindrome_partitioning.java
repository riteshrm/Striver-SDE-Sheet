
//Problem Link:-https://www.codingninjas.com/codestudio/problems/873266?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class palindrome_partitioning {

	  static int fun(int[] dp,String str,int x){
       if(x>=str.length()){
           return 0;
       }
       if(dp[x]!=-1){
           return dp[x];
       }
       int ans = Integer.MAX_VALUE;;
       StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
       for(int i=x;i<str.length();i++){
            
            
                sb1.insert(0,str.charAt(i));
                sb2.append(str.charAt(i));
                if(sb1.toString().equals(sb2.toString())){
                  ans = Math.min(ans,(1+fun(dp,str,i+1)));  
                }
                
            
        }
       return dp[x] = ans;
   }
	public static int palindromePartitioning(String str) {
	    // Write your code here
        int[] dp = new int[str.length()];
        Arrays.fill(dp,-1);
        
        return fun(dp,str,0)-1;
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
