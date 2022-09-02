
//Problem Link:-https://practice.geeksforgeeks.org/problems/mirror-tree/1

import java.io.*;
import java.util.*;

public class mirror_tree {
	

	void mirror(Node node) {
        // Your code here
        if(node==null){
            return;
        }
        Node tmp = node.left;
        node.left = node.right;
        node.right = tmp;
        mirror(node.left);
        mirror(node.right);
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
