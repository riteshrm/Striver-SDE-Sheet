
//Problem Link:-https://leetcode.com/problems/kth-largest-element-in-a-stream/

import java.io.*;
import java.util.*;

public class kth_largest_in_stream {

	class KthLargest {
    
    PriorityQueue<Integer> pq;
    int k;

    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>();
        this.k=k;
        for(int num:nums){
            add(num);
        }
    }
    
    public int add(int val) {
        if(pq.size()<k){
            pq.add(val);
        }
        else if(pq.peek()<val){
            pq.poll();
            pq.add(val);
        }
        return pq.peek();
    }
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
