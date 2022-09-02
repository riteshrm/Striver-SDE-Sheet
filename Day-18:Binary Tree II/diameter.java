
//Problem Link:-https://leetcode.com/problems/diameter-of-binary-tree/

import java.io.*;
import java.util.*;

public class diameter {

	int ans;
    int fun(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh = fun(root.left);
        int rh = fun(root.right);
        ans = Math.max(ans,lh+rh);
        return Math.max(lh,rh)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        ans = Integer.MIN_VALUE;
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
