
//Problem Link:-https://leetcode.com/problems/longest-palindromic-substring/

import java.io.*;
import java.util.*;

public class longest_palindrome {

	public String longestPalindrome(String s) {
       int st=0;
        int en=0;
        int maxLen = 0;
        for(int i=0;i<s.length();i++){
            int low = i-1;
            int high = i+1;
            while(low>=0 && s.charAt(low)==s.charAt(i)){
                low--;
            }
            while(high<s.length() && s.charAt(high)==s.charAt(i)){
                high++;
            }
            while(low>=0 && high<s.length() && s.charAt(low)==s.charAt(high)){
                low--;
                high++;
            }
            int len = high-low-1;
            if(len>maxLen){
                maxLen = len;
                st =low+1;
                en = high;
            }
        }
        return s.substring(st,en);
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
