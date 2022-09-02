
//Problem Link:-https://www.codingninjas.com/codestudio/problems/842495?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class majority_element_I {

	public static int findMajority(int[] arr, int n) {
		// Write your code here.
		int num = 0;
		int count = 0;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<n;i++){
			map.put(arr[i],map.getOrDefault(arr[i],0)+1);
			if(count==0){
				count++;
				num = arr[i];
			}
			else if(num==arr[i]){
				count++;
			}
			else{
				count--;
			}
		}
		if(map.get(num)>n/2){
			return num;
		}
		return -1;
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
			System.out.println(findMajority(arr,n));
			t--;
		}
		
		
	}
}
