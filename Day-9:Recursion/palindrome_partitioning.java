
//Problem Link:-https://www.codingninjas.com/codestudio/problems/799931?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class palindrome_partitioning {
	 boolean isPalindrome(String s){
		if(s.length()<=1){
			return true;
		}
		int n = s.length();
		for(int i=0;i<n/2;i++){
			if(s.charAt(i)!=s.charAt(n-i-1)){
				return false;
			}
		}
		return true;
	}

	 void fun(ArrayList<String> arr,List<List<String>> ans,int i,String s){
		if(i>=s.length()){
			ans.add(new ArrayList<>(arr));
			return;
		}
		for(int j=i+1;j<=s.length();j++){
			String sub = s.substring(i,j);
			if(isPalindrome(sub)){
				arr.add(sub);
				fun(arr,ans,j,s);
				arr.remove(arr.size()-1);
			}
		}
	}
    
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();

        fun(new ArrayList<>(),ans,0,s);
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
		String s = sc.nextLine();

		List<List<String>> ans =  partition(s);

	}
}
