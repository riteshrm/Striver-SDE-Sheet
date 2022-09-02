
//Problem Link:-https://leetcode.com/problems/maximum-product-subarray/

import java.io.*;
import java.util.*;

public class max_product_subarray {


	public int maxProduct(int[] nums) {
        int ans = nums[0];
        int maxi = nums[0];
        int mini = nums[0];
        for(int i=1;i<nums.length;i++){
         int tmp = maxi;
            maxi = Math.max(Math.max(maxi*nums[i],mini*nums[i]),nums[i]);
            mini = Math.min(Math.min(tmp*nums[i],mini*nums[i]),nums[i]);
            ans = Math.max(ans,maxi);
            
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
		
		
	}
}
