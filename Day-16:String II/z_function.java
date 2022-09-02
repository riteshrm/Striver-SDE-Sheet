
//Problem Link:-https://leetcode.com/problems/implement-strstr/

import java.io.*;
import java.util.*;

public class z_function {


	 public int strStr(String haystack, String needle) {
        int m = needle.length();
        int n = haystack.length();
        String newS = needle+"$"+haystack;
        int[] z = new int[newS.length()];
        int l=0,r=0;
        for(int i=1;i<newS.length();i++){
            if(i<=r){
                z[i] = Math.min(r-i+1,z[i-l]);
            }
            while(i+z[i]<newS.length() && newS.charAt(i+z[i])==newS.charAt(z[i])){
                z[i]++;
            }
            if(z[i]==needle.length()){
                return i-needle.length()-1;
            }
            
            if(i+z[i]-1>r){
                l = i;
                r = i+z[i]-1;
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
