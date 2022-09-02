
//Problem Link:-https://leetcode.com/problems/binary-search-tree-iterator/

import java.io.*;
import java.util.*;

public class bst_iterator{


	class BSTIterator {
    
    Stack<TreeNode> st;
    
    public void fun(TreeNode root){
        while(root!=null){
            st.push(root);
            root = root.left;
        }
        
    }

    public BSTIterator(TreeNode root) {
        st = new Stack<>();
        fun(root);
        
    }
    
    public int next() {
        TreeNode nn = st.pop();
        
       
            fun(nn.right);
        
        return nn.val;
    }
    
    public boolean hasNext() {
        return !st.isEmpty();
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
