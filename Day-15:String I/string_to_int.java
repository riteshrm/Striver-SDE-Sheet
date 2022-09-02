
//Problem Link:-https://leetcode.com/problems/string-to-integer-atoi/

import java.io.*;
import java.util.*;

public class string_to_int {

	
	 public static int myAtoi(String s) {
          if(s.length()==0){
              return 0;
          }
        int index = 0;
        while(index<s.length() && s.charAt(index)==' '){index++;}
       
        int sign=1;
        if(index<s.length() && (s.charAt(index)=='+' || s.charAt(index)=='-')){
            sign = s.charAt(index)=='+'?1:-1;
            index++;
        }

        int num = 0;
        while(index<s.length() && (s.charAt(index)>='0' && s.charAt(index)<='9')){

            if(num>Integer.MAX_VALUE/10 || (num==Integer.MAX_VALUE/10 && s.charAt(index)-'0'>Integer.MAX_VALUE%10)){
                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            num=num*10+(s.charAt(index)-'0');
            index++;
        }
        return num*sign;
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
