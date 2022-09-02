
//Problem Link:-https://www.codingninjas.com/codestudio/problems/1112628?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class cycle_ll_II {

	public static Node firstNode(Node head) 
    {
        //    Write your code here.
        if(head==null || head.next==null){
            return null;
        }
        Node fast = head;
        Node slow = head;
        do{
            slow = slow.next;
            fast = fast.next.next;
        }while(fast!=null && fast.next!=null && fast!=slow);
        
        if(fast!=slow){
            return null;
        }
        fast = head;
        while(fast!=slow){
            slow = slow.next;
            fast = fast.next;
        }
        
        return fast;
        
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
