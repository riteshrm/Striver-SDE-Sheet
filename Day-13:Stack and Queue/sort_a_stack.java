
//Problem Link:-https://www.codingninjas.com/codestudio/problems/sort-a-stack_985275?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class sort_a_stack {

	public static void insert(Stack<Integer> stack,int x){
		if(stack.isEmpty()){
			stack.push(x);
			return;
		}
		if(stack.peek()<x){
			stack.push(x);
			return;
		}
		int a = stack.pop();
		insert(stack,x);
		stack.push(a);

	}

	public static void sort(Stack<Integer> stack){
		if(!stack.isEmpty()){
			int x = stack.pop();
			sort(stack);
			insert(stack,x);
		}
	}


	public static void sortStack(Stack<Integer> stack) {
		// Write your code here.
        sort(stack);
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
