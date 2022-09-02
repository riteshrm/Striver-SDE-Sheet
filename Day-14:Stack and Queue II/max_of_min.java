
//Problem Link:-https://www.codingninjas.com/codestudio/problems/max-of-min_982935?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class max_of_min {
	
	 public static int[] maxMinWindow(int[] nums, int n) {
        // Write your code here
        int[] ps = new int[n];
        int[] ns = new int[n];
        Arrays.fill(ps,-1);
        Arrays.fill(ns,n);
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[st.peek()]>nums[i]){
                ns[st.pop()] = i;
            }
            st.push(i);
        }
        st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]>nums[i]){
                ps[st.pop()] = i;
            }
            st.push(i);
        }
        for(int i=0;i<n;i++){
        	System.out.print(ps[i]+" ");
        }

        System.out.println();

        for(int i=0;i<n;i++){
        	System.out.print(ns[i]+" ");
        }
        int[] ans = new int[n];
        Arrays.fill(ans,Integer.MIN_VALUE);
        for(int i=0;i<n;i++){
            int k = ns[i]-ps[i]-1;
            ans[k-1] = Math.max(ans[k-1],nums[i]);
        }
        for(int i=n-2;i>=0;i--){
           
                ans[i] =Math.max(ans[i],ans[i+1]);
            
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
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int[] ans = maxMinWindow(arr,n);
         System.out.println();
		for(int i=0;i<n;i++){
			System.out.print(ans[i]+" ");
		}

		
	}
}
