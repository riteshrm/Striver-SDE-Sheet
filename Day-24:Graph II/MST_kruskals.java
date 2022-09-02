
//Problem Link:-https://practice.geeksforgeeks.org/problems/minimum-spanning-tree/1

import java.io.*;
import java.util.*;

public class MST_kruskals {


	class Solution
{
    //Function to find sum of weights of edges of the Minimum Spanning Tree.
   static int find(int n,int[] par){
        if(par[n]==n){
            return n;
        }
        return par[n] = find(par[n],par);
    }
    
   static class Pair implements Comparable<Pair>{
        int a;
        int b;
        int w;
        Pair(int a,int b,int w){
            this.a = a;
            this.b = b;
            this.w = w;
        }
        public int compareTo(Pair o){
            return this.w-o.w;
        }
    }
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) 
    {
        // Add your code here
        int[] par = new int[V];
        for(int i=0;i<V;i++){
            par[i] = i;
        }
            
            PriorityQueue<Pair> pq = new PriorityQueue<>();
            for(int i=0;i<adj.size();i++){
                ArrayList<ArrayList<Integer>> arr = adj.get(i);
            for(int j=0;j<arr.size();j++){
                pq.add(new Pair(i,arr.get(j).get(0),arr.get(j).get(1)));
            }
            }
            int sum = 0;
            while(!pq.isEmpty()){
                Pair pp = pq.poll();
                int p1 = find(pp.a,par);
                int p2 = find(pp.b,par);
                if(p1==p2) continue;
                par[p1] = p2;
                sum+=pp.w;
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
