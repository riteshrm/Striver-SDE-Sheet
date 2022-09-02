
//Problem Link:-https://www.codingninjas.com/codestudio/problems/975277?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class min_no_of_coins {

	public static int findMinimumCoins(int amount)
    {
        // Write your code here.
    int[] arr = {1,2,5,10,20,50,100,500,1000};
    int count=0;
    for(int i=arr.length-1;i>=0;i--){
        while(amount>=arr[i]){
            count++;
            amount-=arr[i];
        }
    }
    return count;
    }
	

	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}

		Scanner sc = new Scanner(System.in);
		
		
	}
}
