
//Problem Link:-https://leetcode.com/problems/max-consecutive-ones/

import java.io.*;
import java.util.*;

public class max_consecutive_ones {

	public static int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count=0;
            }
            else{
                count++;
            }
            ans = Math.max(count,ans);
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
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}

		System.out.println(findMaxConsecutiveOnes(arr));
	}
}
