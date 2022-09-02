
//Problem Link:-https://leetcode.com/problems/binary-tree-maximum-path-sum/

import java.io.*;
import java.util.*;

public class max_path_sum {


	 int ans;
    int fun(TreeNode root){
        
         if(root==null){
            return 0;
        }
        
        int l = Math.max(0,fun(root.left));
        int r = Math.max(0,fun(root.right));
        ans = Math.max(ans,(l+r+root.val));
        return Math.max(0,Math.max(l,r)+root.val);
    }
    public int maxPathSum(TreeNode root) {
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
