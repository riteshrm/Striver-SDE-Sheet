
//Problem Link:-https://leetcode.com/problems/same-tree/

import java.io.*;
import java.util.*;

public class is_same_tree {


	public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if(p==null && q==null){
            return true;
        }
        else if(p==null && q!=null){
            
            return false;
        }
        else if(p!=null && q==null){
            
            return false;
        }
        
        if(p.val!=q.val){
           return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
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
