
//Problem Link:-https://leetcode.com/problems/maximum-sum-bst-in-binary-tree/

import java.io.*;
import java.util.*;

public class max_sum_bst {

	class Node{
        int sum;
        int s;
        int l;
        Node(int sum,int s,int l){
            this.sum = sum;
            this.s = s;
            this.l = l;
        }
    }
    int maxs;
    Node fun(TreeNode root){
        if(root==null){
            return new Node(0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }
        Node left = fun(root.left);
        Node right = fun(root.right);
        if(left.l< root.val && root.val<right.s){
            int ss = left.sum+right.sum+root.val;
            maxs = Math.max(maxs,ss);
            int s = left.s;
            int l = right.l;
            if(s==Integer.MAX_VALUE){
                s =root.val;
            }
            if(l==Integer.MIN_VALUE){
                l = root.val;
            }
            return new Node(ss,s,l);
        }
        int ss = Math.max(0,Math.max(left.sum,right.sum));
        maxs = Math.max(maxs,ss);
        return new Node(ss,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    public int maxSumBST(TreeNode root) {
        maxs  = Integer.MIN_VALUE;
        fun(root);
        return maxs;
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
