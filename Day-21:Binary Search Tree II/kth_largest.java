
//Problem Link:-https://practice.geeksforgeeks.org/problems/kth-largest-element-in-bst/1

import java.io.*;
import java.util.*;

public class kth_largest{
	
	 int ans;
    int K;
    void fun(Node root){
        if(root==null){
            return;
        }
        fun(root.right);
         K--;
        if(K==0){
            ans = root.data;
            return;
        }
        fun(root.left);
       
    }
    public int kthLargest(Node root,int k)
    {
        //Your code here
         ans =  0;
        K=k;
        fun(root);
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
