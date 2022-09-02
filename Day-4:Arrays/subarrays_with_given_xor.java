
//Problem Link:-https://www.codingninjas.com/codestudio/problems/1115652?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class subarrays_with_given_xor {

	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		// Write your code here.
        HashMap<Integer,Integer> map= new HashMap<>();
      map.put(0,1);

   int count = 0;
   int xor = 0;
     for(int i=0;i<arr.size();i++){
   xor^=arr.get(i);
    if(map.containsKey(xor^x)){
           count+=map.get(xor^x);
     }
         map.put(xor,map.getOrDefault(xor,0)+1);
          } 

return count;
    }
	

	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
			int n = sc.nextInt();
			int x = sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i=0;i<n;i++){
				arr.add(sc.nextInt());
			}
			System.out.println(subarraysXor(arr,  x));
			t--;
		}
		
	}
}
