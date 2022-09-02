
//Problem Link:-

import java.io.*;
import java.util.*;

public class cycle_detection_bfs_directed{


	 public static boolean detectCycleInDirectedGraph(int n, ArrayList < ArrayList < Integer >> edges) {
    // Write your code here.
     
      int[] ind = new int[n+1];
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<edges.size();i++){
            int a = edges.get(i).get(0);
            int b = edges.get(i).get(1);
           ind[b]++;
            ArrayList<Integer> arr = map.getOrDefault(a,new ArrayList<>());
            arr.add(b);
            map.put(a,arr);
        }
       
         int cc = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<ind.length;i++){
            if(ind[i]==0){
                q.add(i);
                cc++;
            }
        }
        
        if(q.size()==0){
            return true;
        }
        
        while(!q.isEmpty()){
            int x = q.poll();
            if(map.containsKey(x)){
            for(int i=0;i<map.get(x).size();i++){
                ind[map.get(x).get(i)]--;
                if( ind[map.get(x).get(i)]==0){
                    q.add(map.get(x).get(i));
                    cc++;
                }
            }}
        }
        if(cc==n){
            return false;
        }
        return true;
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
