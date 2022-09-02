
//Problem Link:-https://www.interviewbit.com/problems/distinct-numbers-in-window/

import java.io.*;
import java.util.*;

public class distinct_numbers_in_window {

	 public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
         HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<B;i++){
            map.put(A.get(i),map.getOrDefault(A.get(i),0)+1);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(map.size());
        for(int i=B;i<A.size();i++){
            map.put(A.get(i-B),map.get(A.get(i-B))-1);
            if(map.get(A.get(i-B))==0){
                map.remove(A.get(i-B));
            }
            map.put(A.get(i),map.getOrDefault(A.get(i),0)+1);
            ans.add(map.size());
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
