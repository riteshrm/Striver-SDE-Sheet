
//Problem Link:-https://practice.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1

import java.io.*;
import java.util.*;

public class kth_element_of_sorted_arrays {
	
	public long kthElement( int nums1[], int nums2[], int n, int m, int K) {
        
       
         if(nums2.length<nums1.length){
            return kthElement(nums2, nums1,m,n,K);
        }
       
        int low = 0;
        int high = n;
        while(low<=high){
            int cut1 = (low+high)/2;
            if(K-cut1>m){
                low=cut1+1;
            }
            
            else if(K<cut1){
                high = cut1-1;
            }
            else{
            int cut2 = K-cut1;
            int l1 = cut1==0?Integer.MIN_VALUE:nums1[cut1-1];
            int r1 = cut1==n?Integer.MAX_VALUE:nums1[cut1];
            int l2 = cut2==0?Integer.MIN_VALUE:nums2[cut2-1];
            int r2 = cut2==m?Integer.MAX_VALUE:nums2[cut2];
            if(l1<=r2 && l2<=r1){
                
                
                    return Math.max(l1,l2);
                
                
            }
            
            if(l1>r2){
                high = cut1-1;
            }
            else{
                low = cut1+1;
            }
            }
        }
        
        return 0;
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
