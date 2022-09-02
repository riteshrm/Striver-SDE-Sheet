
//Problem Link:-https://leetcode.com/problems/validate-binary-search-tree/

import java.io.*;
import java.util.*;

public class bt_is_bst {


	public boolean fun(TreeNode root,long min,long max){
      if(root==null){
          return true;
      }
      if(root!=null && !(root.val<max && root.val>min)){
          return false;
      }
      return fun(root.left,min,root.val) && fun(root.right,root.val,max);
  }

        public boolean isValidBST(TreeNode root) {
        return fun(root,Long.MIN_VALUE,Long.MAX_VALUE);
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
