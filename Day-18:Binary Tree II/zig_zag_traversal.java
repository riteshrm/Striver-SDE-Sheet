
//Problem Link:-https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/

import java.io.*;
import java.util.*;

public class zig_zag_traversal {


	 void fun(List<List<Integer>> arr,int level,TreeNode root){
        if(root==null){
            return;
        }
        if(level>arr.size()){
            arr.add(new ArrayList<>());
        }
        if(level%2==0){
            arr.get(level-1).add(0,root.val);
        }
        else{
            arr.get(level-1).add(root.val);
        }
        fun(arr,level+1,root.left);
        fun(arr,level+1,root.right);
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        fun(ans,1,root);
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
