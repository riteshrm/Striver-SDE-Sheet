
//Problem Link:-https://www.codingninjas.com/codestudio/problems/count-distinct-substrings_985292?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_tries_videos

import java.io.*;
import java.util.*;

public class distinct_substring{

	 static class Node{
        Node links[];
        Node(){
            links = new Node[26];
        }
    }

	public static int countDistinctSubstrings(String s) 
	{
		//	  Write your code here.
       Node root = new Node();
        int count = 0;
        for(int i=0;i<s.length();i++){
            Node node = root;
            for(int j=i;j<s.length();j++){
                if(node.links[s.charAt(j)-'a']==null){
                    count++;
                    node.links[s.charAt(j)-'a']= new Node();
                }
                node = node.links[s.charAt(j)-'a'];
            }
        }
        return count+1;
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
