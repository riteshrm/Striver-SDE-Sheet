
//Problem Link:-https://www.codingninjas.com/codestudio/problems/799400?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class no_plateforms {

	 public static int calculateMinPatforms(int at[], int dt[], int n) {
        // Write your code here.
       int ans = 0;
        Arrays.sort(at);
        Arrays.sort(dt);
        int count = 0;
        int i = 0;
        int j = 0;
        while(i<n && j<n){
            if(at[i]<=dt[j]){
                count++;
                i++;
            }
            else{
                count--;
                j++;
            }
            ans = Math.max(ans,count);
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
		int t = sc.nextInt();
		while(t>0){
			int n = sc.nextInt();
			int[] at = new int[n];
			int[] dt = new int[n];
			for(int i =0;i<n;i++){
				at[i] = sc.nextInt();
			}
			for(int i =0;i<n;i++){
				dt[i] = sc.nextInt();
			}
			System.out.println(calculateMinPatforms(at,  dt,  n))
			t--;
		}
		
	}
}
