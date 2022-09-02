
//Problem Link:-https://www.codingninjas.com/codestudio/problems/pair-sum_697295?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class pair_sum {
	
	public static class Pair implements Comparable<Pair>{
		int first;
		int second;
		public Pair(int first,int second){
			this.first = first;
			this.second = second;
		}

		public int compareTo(Pair o){
			return this.first-o.first;
		}
	}

	public static int[][] pairSum(int[] arr, int s) {
        // Write your code here.
      TreeMap<Integer,Integer> map = new TreeMap<>();
      for(int i=0;i<arr.length;i++){
      	map.put(arr[i],map.getOrDefault(arr[i],0)+1);
      }
      Set<Integer> first = new HashSet<>();
      PriorityQueue<Pair> pq = new PriorityQueue<>();
      for(Map.Entry<Integer,Integer> entry:map.entrySet()){
      	if(map.containsKey(s-entry.getKey()) && !first.contains(entry.getKey()) && !first.contains(s-entry.getKey())){
      		first.add(entry.getKey());
      		if(entry.getKey()!=s-entry.getKey()){
      		for(int i=0;i<entry.getValue();i++){
      			for(int j=0;j<map.get(s-entry.getKey());j++){
      				pq.add(new Pair(entry.getKey(),s-entry.getKey()));
      			}
      		}
      	}
      	else{
      		for(int i=0;i<entry.getValue();i++){
      			for(int j=i+1;j<map.get(s-entry.getKey());j++){
      				pq.add(new Pair(entry.getKey(),s-entry.getKey()));
      			}
      		}

      	}
      	}
      }
      
      int[][] aa = new int[pq.size()][2];
      int ii=0;
      while(pq.size()!=0){
      	Pair pp = pq.poll();
      	aa[ii][0] = pp.first;
      	aa[ii][1] = pp.second;
      	ii++;
      }
return aa;
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
		int s = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		int[][] ans = pairSum(arr,s);
		
		for(int i=0;i<ans.length;i++){
			System.out.println(ans[i][0]+" "+ans[i][1]);
		}
		
	}
}
