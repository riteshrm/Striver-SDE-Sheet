
//Problem Link:-https://www.interviewbit.com/problems/minimum-characters-required-to-make-a-string-palindromic/

import java.io.*;
import java.util.*;

public class min_chars_to_make_palindrome {
	

	 public int solve(String A) {
         int ans = Integer.MAX_VALUE;
        int n = A.length();
        for(int i=0;i<n;i++){
            int low = i-1;
            int high = i+1;
            while(low>=0 && A.charAt(low)==A.charAt(i)){
                low--;
            }
            while(high<n && A.charAt(high)==A.charAt(i)){
                high++;
            }

            while(low>=0 && high<n && A.charAt(high)==A.charAt(low)){
                    low--;
                    high++;
                }

            if(low==-1){
                ans = Math.min(ans,n-high);
            }


        }
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
		int n = sc.nextInt();
		System.out.println(n);
		
		
	}
}
