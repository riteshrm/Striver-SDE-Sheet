
//Problem Link:-https://leetcode.com/problems/min-stack/

import java.io.*;
import java.util.*;

public class min_stack {

	class MinStack {

    Stack<Integer> st;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
       if(st.isEmpty()){
           st.push(val);
           st.push(val);
           return;
       }
        int min = Math.min(st.peek(),val);
        st.push(val);
        st.push(min);
    }
    
    public void pop() {
         st.pop();
        st.pop();
    }
    
    public int top() {
        int x = st.pop();
        int y = st.peek();
        st.push(x);
        return y;
    }
    
    public int getMin() {
        return st.peek();
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
		int n = sc.nextInt();
		System.out.println(n);
		
	}
}
