
//Problem Link:-

import java.io.*;
import java.util.*;

public class postorder {

	static void rec(TreeNode root,List<Integer> arr){
        if(root==null){
            return;
        }
        
        rec(root.left,arr);
        rec(root.right,arr);
        arr.add(root.val);
    }

      static void stack(TreeNode root,List<Integer> arr){
        if(root==null){
            return;
        }
        
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        while(curr!=null || !st.isEmpty()){
            if(curr!=null){
                st.push(curr);
                curr = curr.left;
            }
            else{
                TreeNode tmp = st.peek().right;
                if(tmp==null){
                    tmp = st.pop();
                    arr.add(tmp.val);
                    while(!st.isEmpty() && tmp==st.peek().right){
                        tmp = st.pop();
                        arr.add(tmp.val);
                    }
                }
                else{
                    curr = tmp;
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
