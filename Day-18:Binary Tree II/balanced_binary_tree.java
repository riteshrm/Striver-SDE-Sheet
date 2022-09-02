
//Problem Link:-https://leetcode.com/problems/balanced-binary-tree/

import java.io.*;
import java.util.*;

public class balanced_binary_tree {


	 int fun(TreeNode root){
        if(root==null){
            return 0;
        }
        int l = fun(root.left);
        
        if(l==-1){
            return -1;
        }
        int r = fun(root.right);
        if(r==-1){
            return -1;
        }
        if(Math.abs(l-r)>1)return -1;
        return Math.max(l,r)+1;
    }
    public boolean isBalanced(TreeNode root) {
        if(fun(root)!=-1){
            return true;
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
