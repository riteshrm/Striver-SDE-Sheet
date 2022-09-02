
//Problem Link:-https://practice.geeksforgeeks.org/problems/m-coloring-problem-1587115620/1#

import java.io.*;
import java.util.*;

public class m_coloring {

	boolean fun(boolean graph[][],int node,int[] col,int M){
        if(node==graph.length)return true;
        for(int i=1;i<=M;i++){
            boolean t = true;
            for(int ii = 0;ii<graph.length;ii++){
                if(graph[node][ii] && col[ii]==i){
                    t = false;
                    break;
                }
            }
            if(t){
                col[node] = i;
                if(fun(graph,node+1,col,M)){
                    return true;
                }
                col[node] = 0;
                
            }
            
        }
        return false;
    }
    public boolean graphColoring(boolean graph[][], int m, int n) {
        // Your code here
       
        int[] col = new int[n];
        return fun(graph,0,col,m);
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
