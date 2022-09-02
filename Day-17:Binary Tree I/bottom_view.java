
//Problem Link:-https://practice.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1

import java.io.*;
import java.util.*;

public class bottom_view {


	 class Pair{
        int num;
        int hv;
        Pair(int num,int hv){
            this.num = num;
            this.hv = hv;
        }
    }
    void fun(TreeMap<Integer,Pair> map,Node root,int hv,int hz){
        if(root==null){
            return;
        }
        if(!map.containsKey(hz)){
            map.put(hz,new Pair(root.data,hv));
        }
        if(map.get(hz).hv<=hv){
            map.put(hz,new Pair(root.data,hv));
        }
        fun(map,root.left,hv+1,hz-1);
        fun(map,root.right,hv+1,hz+1);
    }
    public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
        ArrayList<Integer> ans = new ArrayList<>();
        TreeMap<Integer,Pair> map = new TreeMap<>();
        fun(map,root,0,0);
        for(Map.Entry<Integer,Pair> entry:map.entrySet()){
            ans.add(entry.getValue().num);
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
