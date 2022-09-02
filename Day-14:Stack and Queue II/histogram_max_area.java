
//Problem Link:-https://leetcode.com/problems/largest-rectangle-in-histogram/

import java.io.*;
import java.util.*;

public class histogram_max_area {

	
	public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        
        int area = 0;
        for(int i=0;i<=n;i++){
            while(!st.isEmpty() &&(i==n || heights[st.peek()]>heights[i])){
                
                int height = heights[st.pop()];
                int width = 0;
                if(st.isEmpty()){
                   width = i;
                }
                else{
                    width = i-st.peek()-1;
                }
                area = Math.max(area,height*width);
            }
            st.push(i);
        }
       
        return area;
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
