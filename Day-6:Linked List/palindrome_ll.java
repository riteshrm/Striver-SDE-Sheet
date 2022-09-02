
//Problem Link:-https://leetcode.com/problems/palindrome-linked-list/

import java.io.*;
import java.util.*;

public class palindrome_ll {


	public boolean isPalindrome(ListNode head) {
        
        if(head==null || head.next==null){
            return true;
        }
        
       
        ListNode fast =head;
        ListNode slow =head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode head2 = slow;
        ListNode prev = null;
        ListNode curr = head2;
        ListNode nxt = null;
        while(curr!=null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
       
        
        while(prev!=null){
         
            if(head.val!=prev.val){
                return false;
            }
            head = head.next;
            prev = prev.next;
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
