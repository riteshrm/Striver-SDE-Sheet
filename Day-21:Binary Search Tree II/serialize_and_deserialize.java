
//Problem Link:-https://leetcode.com/problems/serialize-and-deserialize-binary-tree/

import java.io.*;
import java.util.*;

public class serialize_and_deserialize {



    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode node = q.poll();
                if(node==null){
                    sb.append('$').append(',');
                }
                else{
                    sb.append(node.val).append(',');
                    q.add(node.left);
                    q.add(node.right);
                }
            }
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] ss = data.split(",");
        Queue<TreeNode> q =  new LinkedList<>();
        if(ss[0].equals("$")){
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(ss[0]));
        q.add(root);
        int i=1;
        while(i<data.length() && !q.isEmpty()){ 
            int size = q.size();
            for(int j=0;j<size;j++){
                TreeNode pp = q.poll();
                if(ss[i].equals("$")){
                    pp.left = null;
                    i++;
                }
                else{
                    pp.left = new TreeNode(Integer.parseInt(ss[i]));
                    q.add(pp.left);
                    i++;
                }
                
                if(ss[i].equals("$")){
                    pp.right = null;
                    i++;
                }
                else{
                     pp.right = new TreeNode(Integer.parseInt(ss[i]));
                    q.add(pp.right);
                    i++;
                }
                
            }
        }
        return root;
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
