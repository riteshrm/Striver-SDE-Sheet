
//Problem Link:-https://leetcode.com/problems/longest-increasing-subsequence/

import java.io.*;
import java.util.*;

public class longest_increasing_subsequence{


	 public int lengthOfLIS(int[] nums) {
       int n = nums.length;
        int maxi = 1;
        int last_index = 0;
        int[] dp = new int[n];
        int[] hash = new int[n];
        Arrays.fill(hash,-1);
        Arrays.fill(dp,1);
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j] && dp[j]+1>dp[i]){
                    dp[i] = 1 + dp[j];
                    hash[i] = j;
                }
                
            }
            
            if(dp[i]>maxi){
                maxi = dp[i];
                last_index = i;
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
       
        while(last_index>=0){
            arr.add(0,nums[last_index]);
            last_index  = hash[last_index];
        }
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        return maxi;
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
