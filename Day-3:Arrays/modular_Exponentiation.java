
//Problem Link:-https://www.codingninjas.com/codestudio/problems/1082146?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class modular_Exponentiation {

	public static int modularExponentiation(int x, int n, int m) {
        // Write your code here. 
        long ans = 1;
      long xx = x; 
        while(n>0){
            if(n%2==0){
                xx = ((xx%m)*(xx%m))%m;
                n/=2;
            }
            else{
                ans = ((ans%m)*(xx%m))%m;
                
                n--;
            }
        } 
        return (int)(ans%m);    
    }
	

	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
			int x = sc.nextInt();
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    System.out.println(modularExponentiation(x,n,m));
			t--;
		}
		
		
		
	}
}
