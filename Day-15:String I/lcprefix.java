
//Problem Link:-https://leetcode.com/problems/longest-common-prefix/

import java.io.*;
import java.util.*;

public class lcprefix {

	public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[strs.length-1];
        String s2 = strs[0];
        int st = 0;
        int en = 0;
        while(en<s2.length() && s1.charAt(en)==s2.charAt(en)){
            en++;
        }
        return s1.substring(st,en);
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
