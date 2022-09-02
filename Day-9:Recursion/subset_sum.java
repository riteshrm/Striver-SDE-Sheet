
//Problem Link:-https://www.codingninjas.com/codestudio/problems/subset-sum_3843086?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class subset_sum {


	static void fun(ArrayList<Integer> ans,int[] num,int sum,int i){
        if(i<0){
            ans.add(sum);
            return;
        }
        fun(ans,num,sum,i-1);
        fun(ans,num,sum+num[i],i-1);
    }
    public static ArrayList<Integer> subsetSum(int num[]) {
        // Write your code here..
       ArrayList<Integer> ans = new ArrayList<>();
        fun(ans,num,0,num.length-1);
        Collections.sort(ans);
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
			 ArrayList<Integer> ans = subsetSum(arr);
             
             for(int i=0;i<ans.size();i++){
             	System.out.print(ans.get(i)+" ");
             }
             System.out.println();
			t--;
		}
		
	}
}
