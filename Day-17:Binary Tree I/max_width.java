
//Problem Link:-https://leetcode.com/problems/maximum-width-of-binary-tree/

import java.io.*;
import java.util.*;

public class max_width{



	 class Pair{
        TreeNode node;
        long index;
        Pair(TreeNode node,long index){
            this.node = node;
            this.index = index;
        }
    }
   
    public int widthOfBinaryTree(TreeNode root) {
       long prev=1L;
        Deque<Pair> pq = new LinkedList<>();
        long ans = 1L;
        pq.add(new Pair(root,prev));
        while(!pq.isEmpty()){
            int size = pq.size();
            prev = pq.getFirst().index;
            ans = Math.max(ans,pq.getLast().index-pq.getFirst().index+1);
            for(int i=0;i<size;i++){
                TreeNode pp = pq.getFirst().node;
                long in = pq.poll().index;
                if(pp.left!=null){
                    pq.add(new Pair(pp.left,2*(in-prev)));
                }
                if(pp.right!=null){
                    pq.add(new Pair(pp.right,2*(in-prev)+1));
                }
                
                
            }
        }
        return (int)ans;
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
