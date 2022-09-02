
//Problem Link:-https://www.codingninjas.com/codestudio/problems/983605?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class four_sum{

	

	 public static String fourSum(int[] arr, int target, int n) {
      // Write your code here.
	 	 Arrays.sort(arr);
       
        for(int j=0;j<n;j++){
             
        for(int i=j+1;i<n;i++){
            
            int L = i+1;
            int R = n-1;
            while(L<R){
                int sum = (arr[i]+arr[L]+arr[R]+arr[j]);
                
                if(sum==target){
                   return "Yes";
                   
                }
                
                else if(sum>target){
                    R--;
                }
                else{
                    L++;
                }
            }
        }
        }
        return "No";
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
			int target = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++){
				arr[i] = sc.nextInt();
			}
			System.out.println(fourSum(arr,target,n));
			t--;
		}
		
	}
}
