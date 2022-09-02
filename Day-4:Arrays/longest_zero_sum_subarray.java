
//Problem Link:-https://www.codingninjas.com/codestudio/problems/920321?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class longest_zero_sum_subarray {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
		int sum = 0;
		int ans = 0;
		for(int i=0;i<arr.size();i++){
			sum+=arr.get(i);
			if(sum==0){
				ans = Math.max(ans,i+1);
			}
			if(!map.containsKey(sum)){
				map.put(sum,new ArrayList<>());
			}
			map.get(sum).add(i);
			if(map.get(sum).size()>1){
				ans = Math.max(ans,(map.get(sum).get(map.get(sum).size()-1)-map.get(sum).get(0)));
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
		int t = sc.nextInt();
		while(t>0){
			int n = sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i=0;i<n;i++){
				arr.add(sc.nextInt());
			}
			System.out.println(LongestSubsetWithZeroSum(arr));
			t--;
		}
		
		
	}
}
