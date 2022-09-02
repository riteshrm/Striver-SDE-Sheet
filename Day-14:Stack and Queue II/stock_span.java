
//Problem Link:-https://leetcode.com/problems/online-stock-span/

import java.io.*;
import java.util.*;

public class stock_span {
	
	class StockSpanner {
    
    class  Pair{
        int num;
        int count;
        Pair(int num,int count){
            this.num = num;
             this.count = count;
        }
    }
    Stack<Pair> st;

    public StockSpanner() {
        st = new Stack<>();
    }
    
    public int next(int price) {
        int count=1;
        while(!st.isEmpty() && st.peek().num<=price){
            count+=st.pop().count;
        }
        st.push(new Pair(price,count));
        return count;
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
