
//Problem Link:-https://leetcode.com/problems/reverse-words-in-a-string/

import java.io.*;
import java.util.*;

public class reverse_words_in_string {

	public String reverseWords(String s) {
        String[] ss = s.trim().split(" +");
        String ans = "";
        for(int i=ss.length-1;i>0;i--){
            ans = ans + ss[i] + " ";
        }
        ans+=ss[0];
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
