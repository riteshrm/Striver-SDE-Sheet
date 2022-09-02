
//Problem Link:-https://leetcode.com/problems/median-of-two-sorted-arrays/

import java.io.*;
import java.util.*;

public class median_of_two_sorted_arrays {


	 public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         if(nums2.length<nums1.length){
            return findMedianSortedArrays(nums2, nums1);
        }
        int m = nums1.length;
        int n = nums2.length;
        int low = 0;
        int high = m;
        while(low<=high){
            int cut1 = (low+high)/2;
            int cut2 = (m+n+1)/2-cut1;
            int l1 = cut1==0?Integer.MIN_VALUE:nums1[cut1-1];
            int r1 = cut1==m?Integer.MAX_VALUE:nums1[cut1];
            int l2 = cut2==0?Integer.MIN_VALUE:nums2[cut2-1];
            int r2 = cut2==n?Integer.MAX_VALUE:nums2[cut2];
            
            if(l1<=r2 && l2<=r1){
                if((m+n)%2==0){
                    return ((double)Math.max(l1,l2)+(double)Math.min(r1,r2))/2.0;
                }
                return Math.max(l1,l2);
            }
            if(l1>r2){
                high = cut1-1;
            }
            else if(l2>r1){
                low = cut1+1;
            }
            
        }
        return 0.0;
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
