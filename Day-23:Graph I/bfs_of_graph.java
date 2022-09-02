
//Problem Link:-https://practice.geeksforgeeks.org/problems/bfs-traversal-of-graph/1

import java.io.*;
import java.util.*;

public class bfs_of_graph {


	public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        ArrayList<Integer> ans = new ArrayList<>();
        int[] vis = new int[V];
        vis[0]=1;
        while(!q.isEmpty()){
            int a = q.poll();
            ans.add(a);
            
            for(int i=0;i<adj.get(a).size();i++){
                if(vis[adj.get(a).get(i)]==0){
                    vis[adj.get(a).get(i)]=1;
                    q.add(adj.get(a).get(i));
                }
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
