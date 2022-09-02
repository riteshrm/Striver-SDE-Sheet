
//Problem Link:-https://leetcode.com/problems/binary-tree-preorder-traversal/

import java.io.*;
import java.util.*;

public class preorder {

	static void rec(TreeNode root,List<Integer> arr){
        if(root==null){
            return;
        }
        arr.add(root.val);
        rec(root.left,arr);
        rec(root.right,arr);
    }

    static void stack(TreeNode root,List<Integer> arr){
        if(root==null){
            return;
        }
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode node = st.pop();
            arr.add(node.val);
            if(node.right!=null){
                st.push(node.right);
            }
            
            if(node.left!=null){
                st.push(node.left);
            } 
        }
    }


    static void morris(TreeNode root,List<Integer> arr){
        TreeNode curr =  root;
        while(curr!=null){
            if(curr.left==null){
                arr.add(curr.val);
                curr = curr.right;
            }
            else{
                TreeNode tmp = curr.left;
                while(tmp.right!=null && tmp.right!=curr){
                    tmp = tmp.right;
                }
                if(tmp.right!=curr){
                    tmp.right = curr;
                    arr.add(curr.val);
                    curr = curr.left;
                }
                else{
                    tmp.right = null;
                    curr = curr.right;
                }
            }
        }
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
