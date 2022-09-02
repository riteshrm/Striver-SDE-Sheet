
//Problem Link:-https://leetcode.com/problems/maximum-profit-in-job-scheduling/

import java.io.*;
import java.util.*;

public class job_scheduling {

	public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        
        int[][] A = new int[profit.length][3];
        
        for(int i=0;i<profit.length;i++){
            A[i] = new int[] {startTime[i],endTime[i],profit[i]};
        }
        Arrays.sort(A,(a,b)->a[1]-b[1]);
        TreeMap<Integer,Integer> dp = new TreeMap<>();
        dp.put(0,0);
        for(int i=0;i<A.length;i++){
            int cur = dp.floorEntry(A[i][0]).getValue() + A[i][2];
            if(cur>dp.lastEntry().getValue()){
                dp.put(A[i][1],cur);
            }
        }
        return dp.lastEntry().getValue();
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
