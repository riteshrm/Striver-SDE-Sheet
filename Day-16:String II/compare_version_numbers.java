
//Problem Link:-https://leetcode.com/problems/compare-version-numbers/

import java.io.*;
import java.util.*;

public class compare_version_numbers {


	 public int compareVersion(String version1, String version2) {
        String[] s1 = version1.split("\\.");
        String[] s2 = version2.split("\\.");
        
        int maxlen = Math.max(s1.length,s2.length);
        for(int i=0;i<maxlen;i++){
            Integer v1 = i<s1.length?Integer.parseInt(s1[i]):0;
            Integer v2 = i<s2.length?Integer.parseInt(s2[i]):0;
            int compare = v1.compareTo(v2);
    	   if (compare != 0) {
    		   return compare;
    	  }
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
		int n = sc.nextInt();
		System.out.println(n);
		System.out.println('9'-'0');
		
		
	}
}
