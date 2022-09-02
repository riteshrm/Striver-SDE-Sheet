
//Problem Link:-https://practice.geeksforgeeks.org/problems/predecessor-and-successor/1

import java.io.*;
import java.util.*;

public class pred_and_succ {


	 public static void findPreSuc(Node root, Res p, Res s, int key)
    {
       // add your code here
       Node curr = root;
       Node pred = null;
       while(curr!=null){
          
           if(curr.data<key){
                pred = curr;
               curr = curr.right;
           }
           else{
               curr = curr.left;
           }
       }
       p.pre =pred;
       
       curr = root;
      Node succ = null;
       while(curr!=null){
           if(curr.data>key){
               succ = curr;
               curr = curr.left;
           }
           else{
               curr = curr.right;
           }
           
       }
       s.succ = succ;
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
