
//Problem Link:-https://www.codingninjas.com/codestudio/problems/1062658?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class max_meet{
	

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
            if(this.end!=o.end){
                return this.end-o.end;
            }
            return this.no-o.no;
        }
    }
    public static List<Integer> maximumMeetings(int[] start, int[] end) {        
        //Write your code here
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i=0;i<start.length;i++){
            pq.add(new Pair(start[i],end[i],i+1));
        }
        List<Integer> ans = new ArrayList<>();
        Pair oo = pq.poll();
        ans.add(oo.no);
        while(pq.size()!=0){
            if(pq.peek().start>oo.end){
                oo = pq.peek();
                ans.add(pq.peek().no);
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
		
		int n  =sc.nextInt();
		System.out.println(n);
	}
}
