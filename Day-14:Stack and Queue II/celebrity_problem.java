
//Problem Link:-https://practice.geeksforgeeks.org/problems/the-celebrity-problem/1

import java.io.*;
import java.util.*;

public class celebrity_problem {

 int celebrity(int M[][], int n)
    {
    	// code here 
    	Stack<Integer> st = new Stack<>();
        
        for(int i=0;i<n;i++){
            st.push(i);
        }
        int a = -1;
        int b = -1;
       
        while(st.size()>1){
           
                a = st.pop();
                b = st.pop();
            
            if(M[a][b]==1 && M[b][a]==0){
                st.push(b);
            }
            else if(M[a][b]==0 && M[b][a]==1){
               st.push(a);
            }
           
        }
        if(st.size()==0){
            return -1;
        }
        int c = st.pop();
        for(int i=0;i<n;i++){
            if(i!=c && (M[c][i]==1 || M[i][c]==0)){
                return -1;
            }
        }
        return c;
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
