
//Problem Link:-https://leetcode.com/problems/repeated-string-match/

import java.io.*;
import java.util.*;

public class rabin_karp {
	
	static long power(long x, long y, long m)
    {
        if (y == 0)
            return 1;
        long p = power(x, y / 2, m) % m;
        p = (int)((p * (long)p) % m);
        if (y % 2 == 0)
            return p;
        else
            return ((x * (long)p) % m);
    }
    public int repeatedStringMatch(String a, String b) {
        String A="";
        int count=0;
        while(A.length()<b.length()){
            A+=a;
            count++;
        }
        A+=a;
        long[] hashcode = new long[A.length()+1];
        long[] pow = new long[A.length()];
        long[] inv = new long[A.length()];
        long m = 1000000;;
        long p=31;
        pow[0]=1;
        
        hashcode[0] = 0;
        for(int i=1;i<A.length();i++){
            pow[i] = (pow[i-1]*p)%m;
        }
        for(int i=0;i<A.length();i++){
            hashcode[i+1] = (hashcode[i] + (A.charAt(i)-'a'+1)*pow[i])%m;
        }
        
        long target = 0;
        for(int i=0;i<b.length();i++){
            target+=((b.charAt(i)-'a'+1)*pow[i])%m;
        }
        int j=0;
        
        for(j=0;j+b.length()-1<A.length()-a.length();j++){
            long cur_h = (hashcode[j+b.length()] + m - hashcode[j]) % m; 
             if (cur_h == target * pow[j] % m){
                 if(A.substring(j,j+b.length()).equals(b)){
                     return count;
                 }
             }
        
        }
        
        for(;j+b.length()-1<A.length();j++){
            long cur_h = (hashcode[j+b.length()] + m - hashcode[j]) % m; 
             if (cur_h == target * pow[j] % m){
                 if(A.substring(j,j+b.length()).equals(b)){
                     return count+1;
                 }
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
		
		
	}
}
