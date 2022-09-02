
//Problem Link:-https://www.codingninjas.com/codestudio/problems/630418?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class substring_without_repeating_characters {

	public static int uniqueSubstrings(String input) 
    {
		
		int size = 0;
		int i = 0,j = 0;
		Set<Character> set = new HashSet<>();
		while(j<input.length()){
			if(!set.contains(input.charAt(j))){
				set.add(input.charAt(j));
				size = Math.max(size,set.size());
				j++;
			}
			else{
				while(i<input.length() && input.charAt(i)!=input.charAt(j)){
					set.remove(input.charAt(i));
					i++;
				}
				i++;
				j++;
			}
		}

		return size;
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
		System.out.println(uniqueSubstrings(s));
		
	}
}
