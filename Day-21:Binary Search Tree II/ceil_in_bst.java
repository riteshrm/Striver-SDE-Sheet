
//Problem Link:-https://www.codingninjas.com/codestudio/problems/ceil-from-bst_920464?source=youtube&campaign=Striver_Tree_Videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=Striver_Tree_Videos

import java.io.*;
import java.util.*;

public class ceil_in_bst {


	public  static int findCeil(TreeNode<Integer> root, int x) {

        // Write your code here
        TreeNode<Integer> curr = root;
        TreeNode<Integer> node = null;
        while(curr!=null){
           
           if(curr.data<x){
              curr = curr.right;
           } 
            else{
                 node = curr;
               curr = curr.left;
            }
        }
        if(node!=null){
            return node.data;
        }
        return -1;

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
