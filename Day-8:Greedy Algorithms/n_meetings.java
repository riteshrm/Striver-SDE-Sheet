
//Problem Link:-https://practice.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1

import java.io.*;
import java.util.*;

public class n_meetings {


	static class Pair implements Comparable<Pair>{
        int start;
        int end;
        int no;
        Pair(int start,int end,int no){
            this.start = start;
            this.end = end;
            this.no = no;
        }
        public int compareTo(Pair o){
            return this.end-o.end;
        }
    }
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
         PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i=0;i<start.length;i++){
            pq.add(new Pair(start[i],end[i],i+1));
        }
       int ans=1;
        Pair oo = pq.poll();
        while(pq.size()!=0){
            if(pq.peek().start>oo.end){
                oo = pq.peek();
               ans++;
            }
            pq.poll();
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
