
//Problem Link:-https://www.codingninjas.com/codestudio/problems/boundary-traversal_790725?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class boundary_traversal {

	 static ArrayList<Integer> ans;
    static void left(TreeNode root){
        if(root==null){
            return;
        }
        TreeNode curr = root.left;
        while(curr!=null){
            if(curr.left==null && curr.right==null){
                break;
            }
            ans.add(curr.data);
            if(curr.left!=null){
                curr = curr.left;
            }
            else if(curr.left==null && curr.right!=null){
                curr = curr.right;
            }
        }
    }
    
    static void leaves(TreeNode root){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            ans.add(root.data);
            return;
        }
        leaves(root.left);
        leaves(root.right);
        
    }
    static void right(TreeNode root){
        if(root==null){
            return;
        }
        TreeNode curr = root.right;
        ArrayList<Integer> ak = new ArrayList<>();
        while(curr!=null){
            if(curr.left==null && curr.right==null){
                break;
            }
            ak.add(curr.data);
            if(curr.right!=null){
                curr = curr.right;
            }
            else if(curr.right==null && curr.left!=null){
                curr = curr.left;
            }
        }
        
        for(int i=ak.size()-1;i>=0;i--){
            ans.add(ak.get(i));
        }
    }
	public static ArrayList<Integer> traverseBoundary(TreeNode root){
		// Write your code here.
        ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        if(!(root.left==null && root.right==null)){
                ans.add(root.data);
            }
        left(root);
        leaves(root);
        right(root);
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
