
//Problem Link:-https://leetcode.com/problems/subsets-ii/

import java.io.*;
import java.util.*;

public class subset_II {

	  static void fun(int[] arr,int i,ArrayList<Integer> num,Set<ArrayList<Integer>> set){
        if(i==arr.length){
            if(num.size()!=0){
                set.add(new ArrayList<>(num));
            }
            
            return;
        }
        fun(arr,i+1,num,set);
        num.add(arr[i]);
        fun(arr,i+1,num,set);
        num.remove(num.size()-1);
    }
    public static List<List<Integer>> subsetsWithDup(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> k = new ArrayList<>();
        Set<ArrayList<Integer>> set = new HashSet<>();
        
        fun(arr,0,k,set);
        set.add(new ArrayList<>());
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
			int[] arr = new int[n];
			for(int i=0;i<n;i++){
				arr[i] = sc.nextInt();
			}
			List<List<Integer>> ans = subsetsWithDup(  arr);
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
