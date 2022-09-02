
//Problem Link:-https://leetcode.com/problems/flatten-binary-tree-to-linked-list/

import java.io.*;
import java.util.*;

public class flatten_bt {

	 TreeNode prev;
    void fun(TreeNode root){
        if(root==null){
            return;
        }
        fun(root.right);
        fun(root.left);
        root.left = null;
        root.right = prev;
        prev = root;
    }
    public void flatten(TreeNode root) {
        prev = null;
        fun(root);
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
