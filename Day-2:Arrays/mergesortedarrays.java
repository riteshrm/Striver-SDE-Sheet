//Problem Link:-https://www.codingninjas.com/codestudio/problems/1214628?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website


import java.io.*;
import java.util.*;

public class mergesortedarrays {
	
    

	public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        int k = (m+n+1)/2;
        while(k>=1){
            int start = 0;
            int end = k;
            while(end<n+m){
                if(start<m && end<m){
                    if(arr1[start]>arr1[end]){
                        int tmp = arr1[start];
                        arr1[start] = arr1[end];
                        arr1[end] = tmp;
                    }
                    start++;
                    end++;
                }
               else if(start<m && end>=m){
                    if(arr1[start]>arr2[end-m]){
                        int tmp = arr1[start];
                        arr1[start] = arr2[end-m];
                        arr2[end-m] = tmp;
                    }
                    start++;
                    end++;
                }
                else if(start>=m && end>=m){
                    if(arr2[start-m]>arr2[end-m]){
                        int tmp = arr2[start-m];
                        arr2[start-m] = arr2[end-m];
                        arr2[end-m] = tmp;
                    }
                    start++;
                    end++;
                }
                
            }
            if(k==1){
                    break;
                }
            k = (k+1)/2;
        }
        for(int i=m;i<n+m;i++){
            arr1[i] = arr2[i-m];
        }
        return arr1;
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
        int[] arr1 = new int[m+n];
        int[] arr2 = new int[n];
        for(int i=0;i<m+n;i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr2[i] = sc.nextInt();
        }

		arr1 = ninjaAndSortedArrays(arr1, arr2,  m,  n);

		for(int i=0;i<n+m;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        t--;
        }
	}
}
