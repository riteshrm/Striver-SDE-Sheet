
//Problem Link:-https://www.codingninjas.com/codestudio/problems/add-two-numbers-as-linked-lists_1170520?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class add_two_numbers{


	static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2) {
        // Write your code here.
        LinkedListNode head = new LinkedListNode(0);
         LinkedListNode node = head;
        int data = 0;
        while(head1!=null && head2!=null){
            data = data+ head1.data+head2.data;
            node.next = new LinkedListNode(data%10);
            node = node.next;
            data=data/10;
            head1 = head1.next;
            head2 =head2.next;
        }
        
        while(head1!=null){
            data = data+ head1.data;
            node.next = new LinkedListNode(data%10);
            node = node.next;
            data=data/10;
            head1 = head1.next;
            
        }
        
        while(head2!=null){
            data = data+head2.data;
            node.next = new LinkedListNode(data%10);
            node = node.next;
            data/=10;
            head2 =head2.next;
        }
        if(data!=0){
            node.next = new LinkedListNode(data%10);
            node = node.next;
        }
        return head.next;
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
