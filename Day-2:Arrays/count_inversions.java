
//Problem Link:-https://www.codingninjas.com/codestudio/problems/615?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=0

import java.io.*;
import java.util.*;

public class count_inversions{

	public static long merge(long[] left,long[] right,long[] a){
		int nL = left.length;
        int rL = right.length;
        long sum = 0;
        int i=0,j=0,k=0;
        while(i<nL && j<rL){
            if(left[i]<=right[j]){
                a[k++] = left[i++];
            }
            else{
                a[k++] = right[j++];
				
					sum = sum + nL-i;
				
				
                
            }
        }

        while(i<nL){
            a[k++] = left[i++];
        }
        while(j<rL){
            a[k++] = right[j++];
        }
        
return sum;
	}

	public static long sort(long[] arr){
		if(arr.length<2){
			return 0;
		}
		long sum = 0;
		int m = arr.length/2;
		long[] left = new long[m];
		long[] right=  new long[arr.length-m];
		for(int i=0;i<m;i++){
            left[i] = arr[i];
        }
        for(int j=0;j<arr.length-m;j++){
            right[j] = arr[m+j];
        }
		sum+=sort(left);
		sum+=sort(right);
		sum+=merge(left,right,arr);
		return sum;


	}
	
	public static long getInversions(long arr[], int n) {

    return sort(arr);
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
		long[] arr = new long[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextLong();
		}
		System.out.println(getInversions(arr,n));
		

		
		
	}
}
