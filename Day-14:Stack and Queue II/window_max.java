
//Problem Link:-https://leetcode.com/problems/sliding-window-maximum/

import java.io.*;
import java.util.*;

public class window_max {
	
	 public int[] maxSlidingWindow(int[] nums, int k) {
        if(k<=1){
            return nums;
        }
        int n = nums.length;
        int[] ans = new int[n-k+1];
       Deque<Integer> pq = new LinkedList<>();
        for(int i=0;i<k;i++){
            while(!pq.isEmpty() && pq.getLast()<nums[i]){
                pq.removeLast();
            }
            pq.addLast(nums[i]);
        }
        
        ans[0] = pq.getFirst();
        int j=1;
        
        for(int i=k;i<n;i++){
             while(!pq.isEmpty() && pq.getLast()<nums[i]){
                pq.removeLast();
            }
            if(!pq.isEmpty() && pq.getFirst()==nums[i-k]){
                pq.removeFirst();
            }
            pq.addLast(nums[i]);
           
            ans[j++] = pq.getFirst();
            
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
		int n = sc.nextInt();
		System.out.println(n);
		
	}
}
