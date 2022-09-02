
//Problem Link:-https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

import java.io.*;
import java.util.*;

public class bst_from_sorted_array{


	TreeNode fun(int[] nums,int i,int n){
        if(i>n){
            return null;
        }
        int index = (i+n)/2;
        TreeNode node = new TreeNode(nums[index]);
        node.left = fun(nums,i,index-1);
        node.right = fun(nums,index+1,n);
        return node;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return fun(nums,0,nums.length-1);
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
