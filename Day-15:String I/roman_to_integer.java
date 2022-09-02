
//Problem Link:-https://leetcode.com/problems/roman-to-integer/

import java.io.*;
import java.util.*;

public class roman_to_integer {


	 int fun(char c){
        if(c=='I'){
            return 1;
        }
        if(c=='V'){
            return 5;
        }
        if(c=='X'){
            return 10;
        }
        if(c=='L'){
            return 50;
        }
        if(c=='C'){
            return 100;
        }
        if(c=='D'){
            return 500;
        }
        if(c=='M'){
            return 1000;
        }
        return 0;
    }
    public int romanToInt(String s) {
        int prev = 0;
        int ans = 0;
        for(int i=s.length()-1;i>=0;i--){
            int xx = fun(s.charAt(i));
            if(prev<=xx){
                ans+=xx;
            }
            else{
                ans-=xx;
            }
            prev=xx;
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
		
		
	}
}
