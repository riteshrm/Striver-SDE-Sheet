
//Problem Link:-

import java.io.*;
import java.util.*;

public class cycle_detection_bfs {

	class Node{
		int num;
		int par;
		Node(int num,int par){
			this.num = num;
			this.par = par;
		}
	}

	boolean bfs(ArrayList<ArrayList<Integer>> adj, int s,
            int vis[])
    {
       Queue<Node> q =  new LinkedList<>()
       q.add(new Node(s, -1));
       vis[s] =1;
       
       while(!q.isEmpty())
       {
           int node = q.peek().first;
           int par = q.peek().second;
           q.remove(); 
           
           for(Integer it: adj.get(node))
           {
               if(vis[it]==0)  
               {
                   q.add(new Node(it, node));
                   vis[it] = 1; 
               }
        
               else if(par != it) return true;
           }
       }
       
       return false;
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
