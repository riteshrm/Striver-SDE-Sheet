
//Problem Link:-https://www.codingninjas.com/codestudio/problems/628974?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class detect_cycle {


	 public static boolean detectCycle(Node<Integer> head) {
        //Your code goes here
        Node<Integer> fast = head;
        Node<Integer> slow = head;
        if(fast==null || fast.next==null){
            return false;
        }
        do{
            fast = fast.next.next;
            slow = slow.next;
        }while(fast!=slow && fast!=null && fast.next!=null && slow!=null);
       
        if(fast!=slow){
            return false;
        }
        if(fast==null){
            return false;
        }
        
        return true;
        
        
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
