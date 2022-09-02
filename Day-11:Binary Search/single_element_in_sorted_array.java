
//Problem Link:-https://leetcode.com/problems/single-element-in-a-sorted-array/

import java.io.*;
import java.util.*;

public class single_element_in_sorted_array {
	

	public int singleNonDuplicate(int[] nums) {
         int l = 0;
        int r = nums.length-1;
        while(l<r){
            int mid = (l+r)/2;
            if(mid%2==1){
                mid--;
            }
            if(nums[mid]!=nums[mid+1])r = mid;
            
            else{
                l = mid+2;
            }
        }
        
        return nums[r];
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
