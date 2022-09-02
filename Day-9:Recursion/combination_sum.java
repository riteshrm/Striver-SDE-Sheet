
//Problem Link:-https://leetcode.com/problems/combination-sum/

import java.io.*;
import java.util.*;

public class combination_sum {

	  static void fun(int sum,int[] arr,int i,ArrayList<Integer> num,Set<ArrayList<Integer>> set){
       if(sum==0){
       	
        	set.add(new ArrayList<>(num));
        	return;
        }
         if(i==arr.length ){
            return;
        }
        
        fun(sum,arr,i+1,num,set);
        if(sum>=arr[i]){
        	 num.add(arr[i]);
        fun(sum-arr[i],arr,i,num,set);
        num.remove(num.size()-1);

        }
       
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
       
        ArrayList<Integer> num = new ArrayList<>();
        Set<ArrayList<Integer>> set = new HashSet<>();
        
        fun(target,candidates,0,num,set);
        System.out.println(set.size());
       List<List<Integer>> ans = new ArrayList<>(set);
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
		int t = sc.nextInt();
		while(t>0){
			int n = sc.nextInt();
			int target = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++){
				arr[i] = sc.nextInt();
			}
			List<List<Integer>> ans = combinationSum(arr,target);
			for(int i=0;i<ans.size();i++){
				
				for(int j=0;j<ans.get(i).size();j++){
					System.out.print(ans.get(i).get(j)+" ");
				}
				System.out.println();
			}
			t--;
		}
		
	}
}
