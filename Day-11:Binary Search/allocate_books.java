
//Problem Link:-https://www.interviewbit.com/problems/allocate-books/

import java.io.*;
import java.util.*;

public class allocate_books {
	

	 public int books(ArrayList<Integer> A, int B) {
        if(B>A.size()){
            return -1;
        }
      int low = Integer.MAX_VALUE;
      int high = 0;
      for(int i=0;i<A.size();i++){
        low = Math.min(low,A.get(i));
        high+=A.get(i);}
int res = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(isPossible(A,B,mid)){
                res = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return res;
    }
    
    private boolean isPossible(ArrayList<Integer> A, int B, int mid) {
        
       int student = 1;
       int sum = 0;
       for(int i=0;i<A.size();i++){
           if(A.get(i)>mid){
               return false;
           }

           if(sum+A.get(i)>mid){
               student++;
               sum = A.get(i);
           }
           else{
               sum+=A.get(i);
           }
       }
return student<=B;
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
