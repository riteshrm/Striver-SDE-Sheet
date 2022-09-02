
//Problem Link:-https://www.codingninjas.com/codestudio/problems/799912?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class delete_kth_node_from_end{


	public static LinkedListNode<Integer> removeKthNode(LinkedListNode<Integer> head, int K) {
		// Write your code here.
        if(K==0){
            return head;
        }
        
        ArrayList<LinkedListNode> arr = new ArrayList<>();
        LinkedListNode node = head;
        while(node!=null){
            arr.add(node);
            node = node.next;
        }
        if(K==arr.size()){
            return head.next;
        }
       
        int in = arr.size()-K;
        arr.get(in-1).next = arr.get(in-1).next.next;
        return head;
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
