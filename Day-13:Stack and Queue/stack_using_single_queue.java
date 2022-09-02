
//Problem Link:-https://leetcode.com/problems/implement-stack-using-queues/

import java.io.*;
import java.util.*;

public class stack_using_single_queue {
	
	class MyStack {

    Queue<Integer> q1;
    
    public MyStack() {
        q1 =  new LinkedList<>();
        
    }
    
    public void push(int x) {
        int size = q1.size();
       q1.add(x);
        while(size!=0){
            q1.add(q1.poll());
            size--;
        }
       
    }
    
    public int pop() {
        return q1.poll();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
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
