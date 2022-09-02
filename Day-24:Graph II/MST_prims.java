
//Problem Link:-https://practice.geeksforgeeks.org/problems/minimum-spanning-tree/1

import java.io.*;
import java.util.*;

public class MST_prims {

	class Solution
{
    //Function to find sum of weights of edges of the Minimum Spanning Tree.
 
    
   static class Pair implements Comparable<Pair>{
        int a;
        int w;
        Pair(int a,int w){
            this.a = a;
            this.w = w;
        }
        public int compareTo(Pair o){
            return this.w-o.w;
        }
    }
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) 
    {
         int[] vis = new int[V];
         PriorityQueue<Pair> pq = new PriorityQueue<>();
         int sum = 0;
         pq.add(new Pair(0,0));
         while(!pq.isEmpty()){
            Pair x = pq.poll();
             if(vis[x.a]==0){
             vis[x.a]=1;
                 sum+=x.w;
                 ArrayList<ArrayList<Integer>> arr = adj.get(x.a);
                 for(int i=0;i<arr.size();i++){
                 
                     pq.add(new Pair(arr.get(i).get(0),arr.get(i).get(1)));
                 }
             }
         }
         return sum;
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
