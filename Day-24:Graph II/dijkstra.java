
//Problem Link:-https://practice.geeksforgeeks.org/problems/implementing-dijkstra-set-1-adjacency-matrix/1

import java.io.*;
import java.util.*;

public class dijkstra {

	class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
     static class Pair implements Comparable<Pair> {
        int a;
        int d;

        public Pair(int a,int d){
            this.a = a;
            this.d = d;

        }
        public int compareTo(Pair o){
            return this.d-o.d;
        }
    }
    
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        // Write your code here
        int[] dis = new int[V];
        Arrays.fill(dis,Integer.MAX_VALUE);
        dis[S] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(S,0));
        while(!pq.isEmpty()){
             Pair pp = pq.poll();
            int node = pp.a;
            int d = pp.d;
            ArrayList<ArrayList<Integer>> arr =adj.get(node);
            for(int i=0;i<arr.size();i++){
                int dd = d+arr.get(i).get(1);
                if(dd<dis[arr.get(i).get(0)]){
                    dis[arr.get(i).get(0)] = dd;
                    pq.add(new Pair(arr.get(i).get(0),dd));
                }
            }
        }
        return dis;
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
