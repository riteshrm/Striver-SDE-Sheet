
//Problem Link:-https://leetcode.com/problems/top-k-frequent-elements/

import java.io.*;
import java.util.*;

public class k_most_frequent {

	 public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
       LinkedList<Integer>[] arr = new LinkedList[nums.length+1];
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(arr[entry.getValue()]==null){
                arr[entry.getValue()] = new LinkedList<>();
            }
            arr[entry.getValue()].add(entry.getKey());
        }
      int [] ans = new int[k];
        int i =  0;
        int j = arr.length-1;
        while(i<k && j>=0){
            if(arr[j]!=null){
                int K = 0;
                while(i<k && K<arr[j].size()){
                    ans[i] = arr[j].get(K);
                    i++;
                    K++;
                }
            }
            j--;
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
        
	}
}
