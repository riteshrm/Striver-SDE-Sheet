
//Problem Link:-https://leetcode.com/problems/kth-largest-element-in-an-array/

import java.io.*;
import java.util.*;

public class  kth_largest{


	  void swap(int i,int j,int[] nums){
        int tmp = nums[j];
        nums[j] = nums[i];
        nums[i] = tmp;
    }
    void heapify(int[] nums,int i,int n){
        int largest = i;
        if(2*i+1<n && nums[2*i+1]>nums[largest]){
            largest = 2*i+1;
        }
        if(2*(i+1)<n && nums[2*(i+1)]>nums[largest]){
            largest = 2*(i+1);
        }
        if(i!=largest){
            swap(i,largest,nums);
            heapify(nums,largest,n);
        }
    }
    void build(int[] nums){
        int n = nums.length;
        for(int i=n/2;i>=0;i--){
            heapify(nums,i,n);
        }
    }
    public int findKthLargest(int[] nums, int k) {
        build(nums);
        int n = nums.length-1;
        int tmp = 0;
       
        while(k>0){
            tmp = nums[0];
            swap(0,n,nums);
            heapify(nums,0,n);
            n--;
            k--;
        }
        return tmp;
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
        
	}
}
