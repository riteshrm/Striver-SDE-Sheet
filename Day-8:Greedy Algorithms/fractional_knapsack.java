
//Problem Link:-https://www.codingninjas.com/codestudio/problems/975286?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class fractional_knapsack{


	 public static double maximumValue(Pair[] items, int n, int w) {
            // Write your code here.
    	    // ITEMS contains {weight, value} pairs.
        Arrays.sort(items,(i1,i2)-> Double.compare((double)i1.value/(double)i1.weight,(double)i2.value/(double)i2.weight));
        
        double ans = 0;
        n--;
        while(w!=0 && n>=0){
            if(w>=items[n].weight){
                w-=items[n].weight;
                ans+=items[n].value;;
            }
            else{
                ans+=((double)items[n].value/(double)items[n].weight)*(double)w;
                w = 0;
            }
            n--;
        }
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
		
		
	}
}
