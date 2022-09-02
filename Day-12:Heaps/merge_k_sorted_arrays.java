
//Problem Link:-https://www.codingninjas.com/codestudio/problems/merge-k-sorted-arrays_975379?leftPanelTab=0

import java.io.*;
import java.util.*;

public class merge_k_sorted_arrays {

	static class Pair implements Comparable<Pair>{
        int num;
        int index;
        Pair(int num,int index){
            this.num  =num;
            this.index = index;
        }

        public int compareTo(Pair o){
            return Integer.compare(this.num,o.num);
        }
    }
    public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k)
    {
        PriorityQueue<Pair> pq  =new PriorityQueue<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<kArrays.size();i++){
            if(kArrays.get(i).size()!=0){
            pq.add(new Pair(kArrays.get(i).get(0),i));
            kArrays.get(i).remove(0);}
        }
        while(!pq.isEmpty()){
            Pair max = pq.poll();
            int index  =max.index;
            ans.add(max.num);
            if(kArrays.get(index).size()!=0){
                pq.add(new Pair(kArrays.get(index).get(0),index));
                kArrays.get(index).remove(0);
            }
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
		int n = sc.nextInt();
        
	}
}
