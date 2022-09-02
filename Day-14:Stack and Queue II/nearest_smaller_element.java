
//Problem Link:-https://www.interviewbit.com/problems/nearest-smaller-element/

import java.io.*;
import java.util.*;

public class nearest_smaller_element {
	
	public static ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        HashMap<Integer,Integer> map = new HashMap<>();
	 	Stack<Integer> st = new Stack<>();
	 	int n = A.size();
	 	st.push(n-1);
	 	for(int i=n-2;i>=0;i--){
	 		if(A.get(st.peek())>A.get(i)){
	 			while(!st.isEmpty() && A.get(st.peek())>A.get(i)){
	 				map.put(st.pop(),A.get(i));
	 			}
	 		}
	 		st.push(i);
	 	}
         System.out.println(map);
	 	ArrayList<Integer> ans = new ArrayList<>();
	 	for(int i=0;i<n;i++){
	 		if(map.containsKey(i)){
	 			ans.add(map.get(i));
	 		}
	 		else{
	 			ans.add(-1);
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
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0;i<n;i++){
			int tmp = sc.nextInt();
			arr.add(tmp);
		}
		ArrayList<Integer> ans = prevSmaller(arr);
		for(int i=0;i<ans.size();i++){
			System.out.print(ans.get(i)+" ");
		}
		
	}
}
