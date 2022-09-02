
//Problem Link:-https://www.codingninjas.com/codestudio/problems/873378?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class matrix_median {
	

	public static int getMedian(ArrayList<ArrayList<Integer>> matrix)
	{
		// Write your code here.
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<matrix.size();i++){
            mini = Math.min(mini,matrix.get(i).get(0));
            maxi = Math.max(maxi,matrix.get(i).get(matrix.get(i).size()-1));
        }
        int desire = (matrix.size()*matrix.get(0).size()+1)/2;
        while(mini<=maxi){
            int mid = (maxi+mini)/2;
            int count=0;
            for(int i=0;i<matrix.size();i++){
                int k = Collections.binarySearch(matrix.get(i),mid);
                if(k<0){
                    k = Math.abs(k)-1;                }
                else{
                    while(k>=0 && mid==matrix.get(i).get(k)){
                        k--;
                    }
                    k++;
                }
               
                count+=k;
            }
            if(count<desire){
                mini = mid+1;
            }
            else{
                maxi = mid-1;
            }
        }
        return maxi;
	}
	

	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}

		Scanner sc = new Scanner(System.in);
		int n = c.nextInt();
		System.out.println(n);
		
	}
}
