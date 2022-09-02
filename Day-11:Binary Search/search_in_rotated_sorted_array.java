
//Problem Link:-https://leetcode.com/problems/search-in-rotated-sorted-array/

import java.io.*;
import java.util.*;

public class search_in_rotated_sorted_array {
	
	public int search(int[] nums, int target) {
        
       int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(target==nums[mid]){
                return mid;
            }
            if(nums[low]<=nums[mid]){
            if(nums[low]<=target && nums[mid]>=target){
                high =mid;
            }
                else{
                    low = mid+1;
                }
            }
            else{
                if(target>=nums[mid] && target<=nums[high]){
                    low = mid;
                }
                else{
                    high = mid-1;
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
		int n = c.nextInt();
		System.out.println(n);
		
	}
}
