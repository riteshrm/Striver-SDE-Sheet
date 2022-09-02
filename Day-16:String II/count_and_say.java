
//Problem Link:-https://leetcode.com/problems/count-and-say/

import java.io.*;
import java.util.*;

public class count_and_say {


	 public String countAndSay(int n) {
       String s = "1";
        for(int i=1;i<n;i++){
            s = fun(s);
        }
        return s;
        
    }
    
    String fun(String s){
        StringBuilder sb = new StringBuilder();
        int count=1;
        char c = s.charAt(0);
        int i=1;
        while(i<s.length()){
            
            if(s.charAt(i)==c){
                 while(i<s.length() && s.charAt(i)==c){
                count++;
                i++;
            }
            }
            
            else{
                sb.append(count);
                sb.append(c);
                c = s.charAt(i);
                count=1;
                i++;
            }
           
        }
        sb.append(count);
        sb.append(c);
        return sb.toString();
        
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
