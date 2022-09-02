
//Problem Link:-https://www.codingninjas.com/codestudio/problems/1112652?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class reverse_pairs{

	public static int merge(int[] left,int[] right,int[] a){
		int nL = left.length;
        int rL = right.length;
        int sum = 0;
        int i=0,j=0,k=0;
        while(i<nL){
        	
            while(j<rL && left[i]>(2*right[j])){
              
                j++;
            }
            sum+=j;
            i++;
        }
        i=0;j=0;
        while(i<nL && j<rL){
            if(left[i]<=right[j]){
                a[k++] = left[i++];
            }
            else{
                a[k++] = right[j++];
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

	public static int sort(int[] arr){
		if(arr.length<2){
			return 0;
		}
		int sum = 0;
		int m = arr.length/2;
		int[] left = new int[m];
		int[] right=  new int[arr.length-m];
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
	 public static int reversePairs(ArrayList<Integer> arr) {
	 	int[] ar = new int[arr.size()];
	 	for(int i = 0;i<arr.size();i++){
	 		ar[i] = arr.get(i);
	 	}


        return sort(ar);
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
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i=0;i<n;i++){
				arr.add(sc.nextInt());
			}
			System.out.println(reversePairs(arr));
			t--;
		}

	}
}

