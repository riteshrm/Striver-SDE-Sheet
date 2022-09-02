
//Problem Link:-https://leetcode.com/problems/permutations/

import java.io.*;
import java.util.*;

public class permutations {


	void fun(List<List<Integer>> ans,ArrayList<Integer> A,int[] arr,Set<Integer> set){
        if(A.size()==arr.length){
            ans.add(new ArrayList<>(A));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                A.add(arr[i]);
                fun(ans,A,arr,set);
                set.remove(arr[i]);
                A.remove(A.size()-1);
            }
        }
        
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        fun(ans,new ArrayList<>(),nums,new HashSet<>());
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
		
		
	}
}
