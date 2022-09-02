
//Problem Link:-https://leetcode.com/problems/symmetric-tree/

import java.io.*;
import java.util.*;

public class symmetric_tree {

	 boolean fun(TreeNode left,TreeNode right){
         if(left==null && right==null){
            return true;
        }
        
        if((left==null || right==null)){
            return false;
        }
        
        return ((left.val==right.val) && fun(left.right,right.left) && fun(left.left,right.right));
    }
    public boolean isSymmetric(TreeNode root) {
       if((root==null) || (root.left==null && root.right==null)){
           return true;
       }
    
        return fun(root.left,root.right);
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
