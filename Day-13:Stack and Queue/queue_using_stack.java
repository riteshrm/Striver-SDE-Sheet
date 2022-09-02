
//Problem Link:-https://leetcode.com/problems/implement-queue-using-stacks/

import java.io.*;
import java.util.*;

public class queue_using_stack {
	
	class MyQueue {
    Stack<Integer> st;

    public MyQueue() {
        st = new Stack<>();
    }
    
    public void push(int x) {
        if(st.isEmpty()){
            st.push(x);
            return;
        }
        int y = st.pop();
        push(x);
        st.push(y);
    }
    
    public int pop() {
        return st.pop();
    }
    
    public int peek() {
        return st.peek();
    }
    
    public boolean empty() {
        return st.isEmpty();
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
