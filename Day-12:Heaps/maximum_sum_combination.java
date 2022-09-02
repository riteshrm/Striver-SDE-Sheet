
//Problem Link:-https://www.interviewbit.com/problems/maximum-sum-combinations/

import java.io.*;
import java.util.*;

public class maximum_sum_combination {

	public static void fun(ArrayList<Integer> A,ArrayList<Integer> B,PriorityQueue<Integer> pq,int i,int j){
		if(i<0 || j<0){
			return;
		}
		
		pq.add(A.get(i)+B.get(j));
		fun(A,B,pq,i-1,j);
		fun(A,B,pq,i,j-1);

	}

	public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B, int C) {
        Collections.sort(A);
        Collections.sort(B);
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        fun(A,B,pq,A.size()-1,B.size()-1);
        while(C>0){
            ans.add(pq.poll());
            C--;
        }
        
        return ans;
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
		int m = sc.nextInt();
		ArrayList<Integer>  A =  new ArrayList<>();
		ArrayList<Integer>  B =  new ArrayList<>();
		for(int i=0;i<n;i++){
			int tmp =sc.nextInt();
			A.add(tmp);
		}

		for(int i=0;i<m;i++){
			int tmp =sc.nextInt();
			B.add(tmp);
		}

		ArrayList<Integer> ans = solve(A,B,2);
		for(int i=0;i<ans.size();i++){
			System.out.println(ans.get(i));
		}


        
	}
}
