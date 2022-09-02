
//Problem Link:-https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/

import java.io.*;
import java.util.*;

public class BT_from_inandpre {

	TreeNode fun(HashMap<Integer,Integer> map,int[] pre,int pres,int ins,int ine){
        if(pres>pre.length || ins>ine){
            return null;
        }
        TreeNode node = new TreeNode(pre[pres]);
        int index = map.get(pre[pres]);
        int len = index-ins;
        node.left = fun(map,pre,pres+1,ins,index-1);
        node.right = fun(map,pre,pres+len+1,index+1,ine);
        return node;
        
    }
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return fun(map,preorder,0,0,inorder.length-1);
        
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
