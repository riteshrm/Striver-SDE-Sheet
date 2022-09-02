
//Problem Link:-https://leetcode.com/problems/remove-duplicates-from-sorted-array/

import java.io.*;
import java.util.*;

public class remove_duplicates {

	public int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            while(i>0 && i<nums.length && nums[i]==nums[i-1]){
                i++;
            }
            if(i<nums.length){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
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

		System.out.println(removeDuplicates(arr));
	}
}
