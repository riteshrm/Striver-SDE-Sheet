
//Problem Link:-https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1

import java.io.*;
import java.util.*;

public class left_view {
	

	int maxl;
    void fun(Node root,ArrayList<Integer> arr,int d){
        if(root==null){
            return;
        }
        if(maxl<d){
            maxl = d;
            arr.add(root.data);
        }
        fun(root.left,arr,d+1);
        fun(root.right,arr,d+1);
    }
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> ans = new ArrayList<>();
      maxl = Integer.MIN_VALUE;
      fun(root,ans,0);
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
