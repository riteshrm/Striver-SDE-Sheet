
//Problem Link:-https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/

import java.io.*;
import java.util.*;

public class vertical_order_traversal {

	class Pair implements Comparable<Pair>{
        int num;
        int hv;
       
        Pair(int num,int hv){
            this.num = num;
           
            this.hv = hv;
        }
        public int compareTo(Pair o){
            if(o.hv!=this.hv){
                return this.hv-o.hv;
            }
            return this.num-o.num;
        }
    }
    
     void fun(TreeMap<Integer,PriorityQueue<Pair>> map,TreeNode node,int hz,int hv){
        if(node==null){
            return;
        }
       if(!map.containsKey(hz)){
           map.put(hz,new PriorityQueue<>());
       }
       map.get(hz).add(new Pair(node.val,hv));
       fun(map,node.left,hz-1,hv+1);
        fun(map,node.right,hz+1,hv+1);
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,PriorityQueue<Pair>> map = new TreeMap<>();
        fun(map,root,0,0);
        List<List<Integer>> ans = new ArrayList<>();
        for(Map.Entry<Integer,PriorityQueue<Pair>> entry:map.entrySet()){
            PriorityQueue<Pair> pq = entry.getValue();
            List<Integer> arr = new ArrayList<>();
            while(!pq.isEmpty()){
                arr.add(pq.poll().num);
            }
            ans.add(arr);
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
