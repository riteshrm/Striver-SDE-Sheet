
//Problem Link:-

import java.io.*;
import java.util.*;

public class graph_bipartite_dfs {


	 int[] vis;
    int[] col;
    
   boolean dfs(int node,int[][] graph,int c){
        vis[node] = 1;
        col[node] = c;
        for(int child: graph[node]){
            if(vis[child]==0){
                if(dfs(child,graph,c^1)==false){
                    return false;
                }
            }
            else {if(col[child]==col[node]){
                return false;}
            }
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
