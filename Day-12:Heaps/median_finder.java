
//Problem Link:-https://leetcode.com/problems/find-median-from-data-stream/

import java.io.*;
import java.util.*;

public class median_finder {

	class MedianFinder {
    PriorityQueue<Integer> maxi;
    PriorityQueue<Integer> mini;
    

    public MedianFinder() {
         maxi = new PriorityQueue<>(Collections.reverseOrder());
        mini = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if(maxi.isEmpty() || num<=maxi.peek()){
            maxi.add(num);
        }
        else{
            mini.add(num);
        }
        if(maxi.size()>mini.size()+1){
            mini.add(maxi.poll());
        }
        if(mini.size()>maxi.size()){
            maxi.add(mini.poll());
        }
    }
    
    public double findMedian() {
        if(maxi.size()==mini.size()){
            return ((double)maxi.peek()+(double)mini.peek())/2.0;
        }
        return maxi.peek();
    }
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
        
	}
}
