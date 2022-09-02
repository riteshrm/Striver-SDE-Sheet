
//Problem Link:-https://leetcode.com/problems/populating-next-right-pointers-in-each-node/

import java.io.*;
import java.util.*;

public class populate_next_pointer {
	

	void fun(Node curr,Node next){
        if(curr==null){
            return;
        }
        curr.next = next;
        fun(curr.left,curr.right);
        fun(curr.right,curr.next==null?null:curr.next.left);
        
    }
    public Node connect(Node root) {
        fun(root,null);
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
