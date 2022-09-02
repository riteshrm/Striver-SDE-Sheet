
//Problem Link:-https://www.codingninjas.com/codestudio/problems/630457?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class intersection {

	public static int findIntersection(LinkedListNode<Integer> firstHead, LinkedListNode<Integer> secondHead) {
		
        LinkedListNode<Integer> tmp1 = firstHead;
        LinkedListNode<Integer> tmp2 = secondHead;
        
        while(tmp1!=tmp2){
            tmp1 = tmp1==null?secondHead:tmp1.next;
            tmp2 = tmp2==null?firstHead:tmp2.next;
        }
        
        if(tmp1==null){
            return -1;
        }
        
        return tmp1.data;
        
        
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
