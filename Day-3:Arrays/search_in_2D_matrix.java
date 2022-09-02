
//Problem Link:-https://www.codingninjas.com/codestudio/problems/980531?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class search_in_2D_matrix{


	static boolean findTargetInMatrix(ArrayList<ArrayList<Integer>> mat, int m, int n, int target) {
		// Write your code here.
		 int[] arr = new int[m];
        for(int i=0;i<m;i++){
            arr[i] = mat.get(i).get(0);
        }
        int in = Arrays.binarySearch(arr,target);
        
        if(in>=0){
            return true;
        }
        in = Math.abs(in)-2;
        if(in<0){
            return false;
        }
        arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = mat.get(in).get(i);
            
        }
    
        in = Arrays.binarySearch(arr,target);
        
        if(in>=0){
            return true;
        }
        return false;
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
			int m = sc.nextInt();
			int n = sc.nextInt();
			int target = sc.nextInt();
			ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
			for(int i=0;i<n;i++){
				mat.add(new ArrayList<>());
				for(int j=0;j<m;j++){
					int tmp = sc.nextInt();
					mat.get(i).add(tmp);
				}
			}
			System.out.println(findTargetInMatrix(mat,m,n,target));
			t--;
		}
		
	}
}
