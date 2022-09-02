
//Problem Link:-https://www.codingninjas.com/codestudio/problems/630519?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class trapping_rain_water {

	 public static long getTrappedWater(long[] arr, int n) {
        // Write your code here.
       long ans = 0;
        int l = 0;
        int r = n-1;
        long lmax = 0;
        long rmax = 0;
        while(l<r){
            if(arr[l]<=arr[r]){
                if(lmax<arr[l]){
                    lmax = arr[l];
                }
                else{
                    ans+=(lmax-arr[l]);
                }
                l++;
            }
            else{
                if(rmax<arr[r]){
                    rmax = arr[r];
                }
                else{
                    ans+=(rmax-arr[r]);
                }
                r--;
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
		int n  =sc.nextInt();
		System.out.println(n);
		
		
	}
}
