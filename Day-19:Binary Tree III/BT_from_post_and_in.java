
//Problem Link:-https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/

import java.io.*;
import java.util.*;

public class BT_from_post_and_in{


	TreeNode fun(HashMap<Integer,Integer> map,int[] pos,int pres,int ins,int ine){
        if(pres<0 || ins>ine){
            return null;
        }
        TreeNode node = new TreeNode(pos[pres]);
        int index = map.get(pos[pres]);
        int len = ine-index;
        node.left = fun(map,pos,pres-len-1,ins,index-1);
        node.right = fun(map,pos,pres-1,index+1,ine);
        return node;
        
    }
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
          HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return fun(map,postorder,postorder.length-1,0,inorder.length-1);
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
