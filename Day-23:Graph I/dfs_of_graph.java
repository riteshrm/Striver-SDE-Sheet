
//Problem Link:-https://practice.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1

import java.io.*;
import java.util.*;

public class dfs_of_graph {

	 int vis[];
    ArrayList<Integer> ans;
    
    void dfs(int node,ArrayList<ArrayList<Integer>> adj){
        vis[node] = 1;
        ans.add(node);
        ArrayList<Integer> arr = adj.get(node);
        for(int i=0;i<arr.size();i++){
            if(vis[arr.get(i)]==0){
                dfs(arr.get(i),adj);
            }
        }
        
    }
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        vis = new int[V];
        ans = new ArrayList<>();
        dfs(0,adj);
        
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
