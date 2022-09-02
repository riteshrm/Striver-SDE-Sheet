
//Problem Link:-https://practice.geeksforgeeks.org/problems/top-view-of-binary-tree/1

import java.io.*;
import java.util.*;

public class top_view {


	static class Pair{
          int data;
          int h;
          public Pair(int data,int h){
              this.data = data;
              this.h = h;
          }
      }
      static TreeMap<Integer,Pair> map;
     static void bottomview(Node root,int hd,int hv){
        if(root==null){
            return;
        }
        if(!map.containsKey(hd)){
            map.put(hd,new Pair(root.data,hv));
        }
        
            if(map.get(hd).h>=hv){
                map.put(hd,new Pair(root.data,hv));
            }
        
        bottomview(root.left,hd-1,hv+1);
        bottomview(root.right,hd+1,hv+1);

    }
    
    static ArrayList<Integer> topView(Node root)
    {
        // add your code
         ArrayList<Integer> arr = new ArrayList<>();
         map = new TreeMap<>();
      bottomview(root,0,0);
      for(Map.Entry<Integer,Pair> entry:map.entrySet()){
          arr.add(entry.getValue().data);
      }
      return arr;
        
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
