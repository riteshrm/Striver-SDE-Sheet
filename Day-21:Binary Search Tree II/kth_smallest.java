
//Problem Link:-https://leetcode.com/problems/kth-smallest-element-in-a-bst/

import java.io.*;
import java.util.*;

public class kth_smallest {


	int ans;
    int K;
    void fun(TreeNode root){
        if(root==null){
            return;
        }
        fun(root.left);
         K--;
        if(K==0){
            ans = root.val;
            return;
        }
        fun(root.right);
       
    }
    public int kthSmallest(TreeNode root, int k) {
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
