
//Problem Link:-https://leetcode.com/problems/search-in-a-binary-search-tree/

import java.io.*;
import java.util.*;

public class search_in_bst {


	public TreeNode searchBST(TreeNode root, int val) {
        
        TreeNode curr = root;
        while(curr!=null && curr.val!=val){
            if(curr.val>val){
                curr = curr.left;
            }
            else{
                curr = curr.right;
            }
        }
        
        return curr;
        
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
