
//Problem Link:-https://leetcode.com/problems/next-greater-element-i/

import java.io.*;
import java.util.*;

public class next_greater_element {

	 public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        st.push(nums2[0]);
        for(int i=1;i<nums2.length;i++){
           
            if(st.peek()<nums2[i]){
                while(!st.isEmpty() && st.peek()<nums2[i]){
                    map.put(st.pop(),nums2[i]);
                }
            }
             st.push(nums2[i]);
        }
       
        int ans[] = new int[nums1.length];
        Arrays.fill(ans,-1);
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                ans[i] = map.get(nums1[i]);
            }
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
