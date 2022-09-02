
//Problem Link:-https://www.codingninjas.com/codestudio/problems/981269?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=0

import java.io.*;
import java.util.*;

public class all_in_one_traversal {

	static class Pair{
        int num;
        BinaryTreeNode node;
        Pair(BinaryTreeNode node,int num){
            this.num = num;
            this.node = node;
        }
    }
    public static List<List<Integer>> getTreeTraversal(BinaryTreeNode<Integer> root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        Stack<Pair> st = new Stack<>();

        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();
        st.push(new Pair(root,1));
        while(!st.isEmpty()){
            if(st.peek().num==1){
                BinaryTreeNode<Integer> n = st.pop().node;
                pre.add(n.data);
                st.push(new Pair(n,2));
                if(n.left!=null){
                    st.push(new Pair(n.left,1));
                }

            }
            if(st.peek().num==2){
                BinaryTreeNode<Integer> n  =st.pop().node;
                in.add(n.data);
                st.push(new Pair(n,3));
                if(n.right!=null){
                    st.push(new Pair(n.right,1));
                }
            }
            if(st.peek().num==3){
                 BinaryTreeNode<Integer> n = st.pop().node;
                post.add(n.data);
            }
        }
        
        ans.add(in);
        ans.add(pre);
        ans.add(post);
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
