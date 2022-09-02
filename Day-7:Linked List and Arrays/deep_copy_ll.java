
//Problem Link:-https://www.codingninjas.com/codestudio/problems/873376?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class deep_copy_ll {


	public static LinkedListNode<Integer> cloneRandomList(LinkedListNode<Integer> head) {
		// Write your code here.
         if(head==null){
            return null;
        }
        LinkedListNode<Integer> tmp = head;
        while(tmp!=null){
            LinkedListNode<Integer> node = new LinkedListNode(tmp.data);
            node.next = tmp.next;
            tmp.next = node;
            tmp = node.next;
        }
        tmp = head;
        while(tmp!=null){
            if(tmp.random!=null){
                tmp.next.random = tmp.random.next;
            }
            else{
                tmp.next.random = null;
            }
            tmp = tmp.next.next;
        }
        
        LinkedListNode<Integer> head2 = head.next;
        LinkedListNode<Integer> tmp2 = head;
        tmp = head.next;
        while(tmp.next!=null){
            tmp2.next = tmp2.next.next;
            tmp.next = tmp.next.next;
            
            tmp = tmp.next;
            tmp2 = tmp2.next;
        }
        tmp2.next = null;
        return head2;
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
