
//Problem Link:-https://www.codingninjas.com/codestudio/problems/800332?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class merge_two_sorted_ll{

	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		// Write your code here.
        LinkedListNode node = new LinkedListNode(0);
        LinkedListNode head = new LinkedListNode(0);
       
        head = node;
        while(first!=null && second!=null){
            if(first.data<=second.data){
                node.next = first;
                node = first;
                first = first.next;
            }
            else{
                node.next = second;
                node = second;
                second = second.next;
            }
        }
        
        while(first!=null){
            node.next = first;
            node = first;
            first = first.next;
        }
        
        while(second!=null){
            node.next = second;
            node = second;
            second = second.next;
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
