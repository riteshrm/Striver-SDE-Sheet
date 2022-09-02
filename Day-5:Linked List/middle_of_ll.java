
//Problem Link:-https://www.codingninjas.com/codestudio/problems/973250?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class middle_of_ll {
	
	 public static Node findMiddle(Node head) 
    {
        // Write your code here
         ArrayList<Node> arr = new ArrayList<>();
        Node node = head;
        while(node!=null){
            arr.add(node);
            node = node.next;
        }
        int size = arr.size();
       
        return arr.get(size/2);

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
