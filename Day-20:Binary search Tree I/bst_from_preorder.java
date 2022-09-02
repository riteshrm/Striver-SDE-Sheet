
//Problem Link:-https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/

import java.io.*;
import java.util.*;

public class bst_from_preorder {

	int i;
    public TreeNode fun(int[] nums,int bound){
        if(i==nums.length || nums[i]>bound){
            return null;
        }
        TreeNode node = new TreeNode(nums[i++]);
        node.left = fun(nums,node.val);
        node.right = fun(nums,bound);
        return node;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        i=0;
        return fun(preorder,Integer.MAX_VALUE);
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
