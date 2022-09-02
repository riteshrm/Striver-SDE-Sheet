
//Problem Link:-https://www.codingninjas.com/codestudio/problems/759408?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class longest_consecutive_sequence {

	public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        int ans = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<N;i++){
            pq.add(arr[i]);
        }
        
        while(pq.size()!=0){
            int k = 1;
            int prev = pq.poll();
            while(pq.size()!=0 && (pq.peek()-1==prev || pq.peek()==prev)){
                if(pq.peek()!=prev){
                    k++;
                }
               
                prev = pq.poll();
            }
            ans = Math.max(ans,k);
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
		int t = sc.nextInt();
		while(t>0){
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++){
				arr[i] = sc.nextInt();
			}
			System.out.println(lengthOfLongestConsecutiveSequence(arr,n));
			t--;
		}
		
		
	}
}
