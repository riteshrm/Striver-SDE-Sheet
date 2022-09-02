
//Problem Link:-https://leetcode.com/problems/implement-strstr/

import java.io.*;
import java.util.*;

public class kmp {


	public int strStr(String haystack, String needle) {
        int m = needle.length();
        int n = haystack.length();
        int[] lps = new int[m];
        lps[0]=0;
        int i=1;
        int len = 0;
        while(i<m){
            if(needle.charAt(i)==needle.charAt(len)){
                lps[i] = len + 1;
                len++;
                i++;
            }
            else{
                if(len!=0){
                    len = lps[len-1];
                }
                else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        
        int j=0;
        i=0;
        while(i<n){
            if(haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
            }
            else{
               if(j!=0){
                   j = lps[j-1];
               }
                else{
                    i++;
                }
            }
            if(j==m){
                return i-j;
            }
        }
        return -1;
    }
	

	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n);
		
		
	}
}
