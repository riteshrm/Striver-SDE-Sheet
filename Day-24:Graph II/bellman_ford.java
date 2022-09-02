
//Problem Link:-https://practice.geeksforgeeks.org/problems/distance-from-the-source-bellman-ford-algorithm/0

import java.io.*;
import java.util.*;

public class bellman_ford {

	class Solution
{
    static int[] bellman_ford(int V, ArrayList<ArrayList<Integer>> adj, int S)
    {
        // Write your code here
        int[] dis = new int[V];
        Arrays.fill(dis,100000000);
        dis[S] = 0;
        for(int k=0;k<V;k++){
            for(int i=0;i<adj.size();i++){
                
               int u = adj.get(i).get(0);
               int v = adj.get(i).get(1);
               int w = adj.get(i).get(2);
               
               if(dis[u]!=100000000){
                   dis[v] = Math.min(dis[v],dis[u]+w);
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
