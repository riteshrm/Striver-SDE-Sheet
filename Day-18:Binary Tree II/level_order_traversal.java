
//Problem Link:-https://leetcode.com/problems/binary-tree-level-order-traversal/

import java.io.*;
import java.util.*;

public class level_order_traversal {

	public List<List<Integer>> levelOrder(TreeNode root) {
         Queue<TreeNode> pq = new LinkedList<>();
       List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        pq.add(root);
        while(!pq.isEmpty()){
            int size = pq.size();
            ans.add(new ArrayList<>());
            for(int i=0;i<size;i++){
                TreeNode pp = pq.poll();
                ans.get(ans.size()-1).add(pp.val);
                
                if(pp.left!=null){
                    pq.add(pp.left);
                }
                if(pp.right!=null){
                    pq.add(pp.right);
                }
            }
        }
        return ans;
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
