
//Problem Link:-https://leetcode.com/problems/combination-sum-ii/

import java.io.*;
import java.util.*;

public class combination_sum2 {

	  static void fun(int sum,int[] arr,int i,ArrayList<Integer> num,List<List<Integer>> ans){
         if(sum==0){
       	
        	ans.add(new ArrayList<>(num));
        	return;
        }
        if(sum<0){
        	return;
        }
        for(int j=i;j<arr.length;j++){
            if(j!=i && arr[j]==arr[j-1]) continue;
            if(arr[j]>sum) break;
            
        if(sum>=arr[j]){
        	 num.add(arr[j]);
        fun(sum-arr[j],arr,j+1,num,ans);
        num.remove(num.size()-1);

        }
       
        }
       
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
       Arrays.sort(candidates);
       
        
         List<List<Integer>> ans = new ArrayList<>();
        fun(target,candidates,0,new ArrayList<>(),ans);
        
      
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
			List<List<Integer>> ans = combinationSum2(arr,target);
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
