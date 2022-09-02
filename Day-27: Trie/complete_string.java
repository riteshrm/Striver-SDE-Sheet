
//Problem Link:-https://www.codingninjas.com/codestudio/problems/complete-string_2687860?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class complete_string {

	static String ss;

static class Trie {

 static class Node{
    Node links[];
    boolean flag;
    public Node(){
        links = new Node[26];
        flag = false;
    }
}
    //Initialize your data structure here
   static Node root;

    Trie() {
        //Write your code here
        root = new Node();
    }


    //Inserts a word into the trie

    public static void insert(String word) {
        //Write your code here
        Node node = root;
        int k = 0;
        for(int i=0;i<word.length();i++){
            if(node.flag==true){
                k++;
            }
            if(node.links[word.charAt(i)-'a']!=null){
                node = node.links[word.charAt(i)-'a'];
            }
            else{
                node.links[word.charAt(i)-'a'] = new Node();
                node = node.links[word.charAt(i)-'a'];
            }
        }
        if(k==word.length()-1){
            if(word.length()>ss.length()){
                ss = word;
            }
            else if(word.length()==ss.length() && (word.compareTo(ss)<0)){
                ss = word;
            }
            
        }
        node.flag = true;
    } 
}
    
  public static String completeString(int n, String[] a) {
    // Write your code here.
      ss = "";
      Arrays.sort(a);
      Trie root = new Trie();
      for(int i=0;i<a.length;i++){
          root.insert(a[i]);
      }
      if(ss.length()==0){
          return "None";
      }
return ss;
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
