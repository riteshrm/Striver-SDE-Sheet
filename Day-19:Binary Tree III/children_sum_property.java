
//Problem Link:-https://www.codingninjas.com/codestudio/problems/childrensumproperty_790723?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class children_sum_property {


	static int fun(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int l = fun(root.left);
        int r = fun(root.right);
        if(root.data<=(l+r)){
            root.data = l+r;
        }
        else{int diff = root.data-(l+r);
            if(root.left!=null){
                root.left.data +=diff; 
                fun(root.left);
            }
             else if(root.right!=null){
                 root.right.data+=diff;
                 fun(root.right);
             }
        }
        return root.data;
    }
    public static void changeTree(BinaryTreeNode < Integer > root) {
        // Write your code here.
        fun(root);
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
