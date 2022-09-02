
//Problem Link:-https://www.codingninjas.com/codestudio/problems/floor-from-bst_920457?source=youtube&campaign=Striver_Tree_Videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=Striver_Tree_Videos&leftPanelTab=0

import java.io.*;
import java.util.*;

public class floor_in_bst {


	public static int floorInBST(TreeNode<Integer> root, int X) {
        //    Write your code here.
        TreeNode<Integer> curr = root;
        TreeNode<Integer> node =  null;
        while(curr!=null){
            if(curr.data>X){
                curr = curr.left;
            }
            else{
                node = curr;
                curr = curr.right;
            }
        }
        return node.data;
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
