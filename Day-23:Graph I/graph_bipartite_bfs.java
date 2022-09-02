
//Problem Link:-

import java.io.*;
import java.util.*;

public class graph_bipartite_bfs {

	 int[] vis;
    int[] col;
    
   boolean dfs(int node,int[][] graph,int c){
         Queue<Integer> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int i=0;i<size;i++){
                int n = q.poll();
                vis[n] = 1;
                col[n] = c;
                for(int child:graph[n]){
                    if(vis[child]==0){
                        q.add(child);
                    }
                    else{
                        if(col[child]==col[n]){
                            return false;
                        }
                    }
                }
            }
            c=c^1;
            
            
        }
       return true;
    }

    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        vis = new int[n];
        col = new int[n];
        boolean t = true;
        
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                t = t&&dfs(i,graph,0);
            }
        }
       
        return t;
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
