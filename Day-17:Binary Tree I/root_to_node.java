
//Problem Link:-https://www.interviewbit.com/problems/path-to-given-node/

import java.io.*;
import java.util.*;

public class root_to_node {


	boolean fun(TreeNode root,int B,ArrayList<Integer> arr){
        if(root==null){
            return false;
        }
        
        arr.add(root.val);
        if(B==root.val){
            return true;
        }
       if(fun(root.left,B,arr) || fun(root.right,B,arr)){
           return true;
       }
        
        arr.remove(arr.size()-1);
        return false;
    }
    public ArrayList<Integer> solve(TreeNode A, int B) {
        ArrayList<Integer> ans = new ArrayList<>();
        fun(A,B,ans);
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
