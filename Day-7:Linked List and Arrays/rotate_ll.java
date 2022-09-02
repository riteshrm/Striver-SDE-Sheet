
//Problem Link:-https://www.codingninjas.com/codestudio/problems/920454?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class rotate_ll{

	 public static Node rotate(Node head, int k) {
        // Write your code here.
        int size = 0;
        Node tmp = head;
        Node tail = tmp;
        while(tmp!=null){
            size++;
            tail = tmp;
            tmp = tmp.next;
        }
        
        if(k%size==0){
            return head;
        }
        
        int in = size-k%size-1;
        Node first = head;
        while(in>0){
            first = first.next;
            in--;
        }
        
        Node newH = first.next;
        first.next = null;
        tail.next = head;
        
        return newH;
        
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
