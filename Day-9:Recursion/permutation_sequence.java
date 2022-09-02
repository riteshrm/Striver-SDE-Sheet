
//Problem Link:-https://leetcode.com/problems/permutation-sequence/

import java.io.*;
import java.util.*;

public class permutation_sequence {


	void fun(StringBuilder sb,ArrayList<Integer> arr,int k,int f){
        sb.append(arr.get(k/f));
        arr.remove(k/f);
        if(arr.size()==0) return;
        fun(sb,arr,k%f,f/arr.size());
    }
    public String getPermutation(int n, int k) {
        int f = 1;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1;i<=n;i++){
            arr.add(i);
            if(i!=n){
                f*=i;
            }
        }
        StringBuilder sb = new StringBuilder();
        fun(sb,arr,k-1,f);
        return sb.toString();
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
