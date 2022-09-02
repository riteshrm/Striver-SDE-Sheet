
//Problem Link:-https://www.codingninjas.com/codestudio/problems/873366?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website


import java.io.*;
import java.util.*;

public class repeatandmiss {
     public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int num2 = 0;
        int[] a = new int[n+1];
        int num1 = 0;

        for(int i=0;i<n;i++){
            a[arr.get(i)]++;
        }
        for(int i=1;i<=n;i++){
            if(a[i]==0){
                num1 = i;
            }
            if(a[i]==2){
                num2 = i;
            }
        }
        
        int[] ans = {num1,num2};
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

        int m = sc.nextInt();
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0;i<m;i++){
            arr.add(sc.nextInt());
        }
        
		int[] ans = missingAndRepeating(arr,m);
        System.out.println(ans[0]+" "+ans[1]);
        t--;
        }
	}
}
