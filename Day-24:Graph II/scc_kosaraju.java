
//Problem Link:-

import java.io.*;
import java.util.*;

public class scc_kosaraju {
	

	class Solution
{
    //Function to find number of strongly connected components in the graph.
      void dfs1(HashMap<Integer,ArrayList<Integer>> map,int[] vis,int node,ArrayList<Integer> order){
        vis[node] = 1;
       if(map.containsKey(node)){
           for(int i=0;i<map.get(node).size();i++){
            if(vis[map.get(node).get(i)]==0){
                dfs1(map,vis,map.get(node).get(i),order);
            }
        }
       }
        
        order.add(node);
    }
    
     void dfs2(HashMap<Integer,ArrayList<Integer>> map,int[] vis,int node){
        vis[node] = 1;
        if(map.containsKey(node)){
        for(int i=0;i<map.get(node).size();i++){
            if(vis[map.get(node).get(i)]==0){
                dfs2(map,vis,map.get(node).get(i));
            }
            }
        
        
        }}
    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj)
    {
        //code here
         HashMap<Integer,ArrayList<Integer>> ori = new HashMap<>();
        HashMap<Integer,ArrayList<Integer>> trans = new HashMap<>();
        for(int i=0;i<adj.size();i++){
            for(int j=0;j<adj.get(i).size();j++){
                int a = i;
                int b = adj.get(i).get(j);
                ArrayList<Integer> arr = ori.getOrDefault(a,new ArrayList<>());
            arr.add(b);
            ori.put(a,arr);
            arr = trans.getOrDefault(b,new ArrayList<>());
            arr.add(a);
            trans.put(b,arr);
            }
        }
       
        ArrayList<Integer> order = new ArrayList<>();
        int[] vis = new int[V];
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                dfs1(ori,vis,i,order);
            }
        }
       int ans = 0;
        Arrays.fill(vis,0);
        
        for(int i = order.size()-1;i>=0;i--){
            if(vis[order.get(i)]==0){
                ans++;
                dfs2(trans,vis,order.get(i));
            }
        }
        return ans;
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
