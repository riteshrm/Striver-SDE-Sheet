
//Problem Link:-https://practice.geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1#

import java.io.*;
import java.util.*;

public class job_sequencing{
	

	 int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
         int d = 0;
       
        Arrays.sort(arr,(i1,i2)->Integer.compare(i1.profit,i2.profit));
        
        int no = 0;
        int pr = 0;
        int i=n-1;
        Set<Integer> set = new HashSet<>();
        while(i>=0){
            if(!set.contains(arr[i].deadline)){
                set.add(arr[i].deadline);
                no++;
                pr+=arr[i].profit;
            }
            else{
                d = arr[i].deadline;
                while(d>0){
                    if(!set.contains(d)){
                        set.add(d);
                        no++;
                        pr+=arr[i].profit;
                        break;
                    }
                    d--;
                }
            }
            i--;
        }
        int a[] = {no,pr};
        return a;
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
