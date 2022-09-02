
//Problem Link:-https://www.codingninjas.com/codestudio/problems/1062679?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class nth_root {

	

	  public static double findNthRootOfM(int n, long m) {
    	// Write your code here.
        double low = 1;
        double high = m;
        double eps = 1e7; 
        
        while((high - low) > eps) {
            double mid = (low + high) / 2.0; 
            if(Math.pow(mid,n) < m) {
                low = mid; 
            }
            else {
                high = mid; 
            }
        }
        
        return low;  
        
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
		int m = sc.nextInt();
		System.out.println(NthRoot(n,m));
		
	}
}
