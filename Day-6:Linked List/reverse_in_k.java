
//Problem Link:-https://www.codingninjas.com/codestudio/problems/763406?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class reverse_in_k {

	public static Node getListAfterReverseOperation(Node head, int n, int b[]) {
		// Write your code here.
        Node head1 = new Node(0);
        Node tmp2  =head1;
        Node curr = head;
        
        for(int i=0;i<n;i++){
            if(b[i]==0){
                continue;
            }
            if(curr==null){
                break;
            }
           Node tmp1 = curr;
            Node prev = null;
             Node next = curr;
            int j = 0;
            while(curr!=null && j<b[i]){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                j++;
            }
            tmp2.next = prev;
            tmp2 = tmp1;
        }
        
        tmp2.next = curr;
        
        return head1.next;
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
