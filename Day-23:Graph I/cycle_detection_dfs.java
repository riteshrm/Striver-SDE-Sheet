
//Problem Link:-

import java.io.*;
import java.util.*;

public class cycle_detection_dfs {


	boolean dfs(HashMap<Integer,ArrayList<Integer>> map,int[] vis,int par,int node){
        
        vis[node] = 1;
        if(map.containsKey(node)){
             
            ArrayList<Integer> arr = map.get(node);
            for(int i=0;i<arr.size();i++){
               
                if(vis[arr.get(i)]==0){
                    
                    if(dfs(map,vis,node,arr.get(i))){
                       
                        return true;
                    }
                }
                else if(arr.get(i)!=par){
                    return true;
                }
                 
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
