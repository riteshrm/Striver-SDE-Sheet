
//Problem Link:-https://www.codingninjas.com/codestudio/problems/893027?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class majority_element_II {

	public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) {
		// Write your code here.
		int n = arr.size();
		int num1 = 0;
		int count1 = 0;
		int num2 = 0;
		int count2 = 0;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<n;i++){
			int x = arr.get(i);
			map.put(x,map.getOrDefault(x,0)+1);
			if(num1==x){
				count1++;
			}
			else if(num2==x){
				count2++;
			}
			else if(count1==0){
				count1++;
				num1= x;
			}
			else if(count2==0){
				count2++;
				num2= x;
			}
			
			else{
				count1--;
				count2--;
			}
		}
		ArrayList<Integer> ans = new ArrayList<>();
		if(map.containsKey(num1) && map.get(num1)>n/3){
			ans.add(num1);
		}
		if(map.containsKey(num2) && num1!=num2 && map.get(num2)>n/3){
			ans.add(num2);
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
		int t = sc.nextInt();
		while(t>0){
			int n = sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i=0;i<n;i++){
				int tmp = sc.nextInt();
				arr.add(tmp);
			}
			ArrayList<Integer> ans = majorityElementII(arr);
			for(int i=0;i<ans.size();i++){
				System.out.print(ans.get(i)+" ");
			}
			System.out.println();
			t--;
		}
		
		
	}
}
