//Problem Link:-https://www.codingninjas.com/codestudio/problems/merge-intervals_699917?topList=striver-sde-sheet-problems
import java.io.*;
import java.util.*;

public class mergeintervals {
	

	public static class Interval  {
        int start;
         int finish;

        public Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
        
    }
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        // write your code here.
        List<Interval> arr = new ArrayList<>();
       Arrays.sort(intervals, (a,b) -> Integer.compare(a.start,b.start));
        arr.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
           Interval o = intervals[i];
            if(arr.get(arr.size()-1).finish>=o.start){
                Interval kk = new Interval(arr.get(arr.size()-1).start,Math.max(arr.get(arr.size()-1).finish,o.finish));
                arr.remove(arr.size()-1);
                arr.add(kk);
            }
            else {
                arr.add(o);
            }
            
        }
        return arr;
    }

	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}

		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Interval[] arr = new Interval[n];
        int[] first = new int[n];
        int[] second = new int[n];
        for(int i = 0;i<n;i++){
            first[i] = sc.nextInt();
            
        }
         for(int i = 0;i<n;i++){
            second[i] = sc.nextInt();
            
        }
         for(int i = 0;i<n;i++){
            arr[i] = new Interval(first[i],second[i]);
            
        }
        List<Interval> ans = mergeIntervals(arr);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i).start+" "+ans.get(i).finish);
        }
		
		
	}
}
