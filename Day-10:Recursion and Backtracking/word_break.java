
//Problem Link:-https://www.codingninjas.com/codestudio/problems/983635?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class word_break {


	 static void fun(int j, String s,Set<String> set,String sb, ArrayList<String> ans){
        if(j==s.length()){
            ans.add(new String(sb.substring(1,sb.length())));
            return;
        }
       
        for(int i=j+1;i<=s.length();i++){
            if(set.contains(s.substring(j,i))){
                fun(i,s,set,sb+" "+s.substring(j,i),ans);
            }
        }

    }
	public static ArrayList<String> wordBreak(String s, ArrayList<String> dictionary) {
		// Write your code here.
        HashSet<String> set  =new HashSet<>(dictionary);
        ArrayList<String> ans = new ArrayList<>();
        fun(0,s,set,new String(),ans);
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
