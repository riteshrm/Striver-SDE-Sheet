
//Problem Link:-

import java.io.*;
import java.util.*;

public class inorder{


	 void rec(TreeNode root,List<Integer> arr){
        if(root==null){
            return;
        }
        rec(root.left,arr);
        arr.add(root.val);
        rec(root.right,arr);
    }

    void stack(TreeNode root,List<Integer> arr){
        if(root==null){
            return;
        }
       Stack<TreeNode> st = new Stack<>();
       TreeNode curr = root;
        while(true){
            if(curr!=null){
                st.push(curr);
                curr = curr.left;
            }
            else{
                if(st.isEmpty()){
                    break;
                }
               curr = st.pop();
                arr.add(curr.val);
                curr = curr.right;
            }
        }
    }


    void morris(TreeNode root,List<Integer> arr){
        if(root==null){
            return;
        }
      TreeNode curr = root;
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
                    curr = curr.left;
                }
                else{
                    tmp.right = null;
                    arr.add(curr.val);
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
