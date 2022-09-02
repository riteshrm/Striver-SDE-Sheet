
//Problem Link:-https://www.codingninjas.com/codestudio/problems/implement-trie_631356?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=0

import java.io.*;
import java.util.*;

public class implement_trie {

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
        for(int i=0;i<word.length();i++){
            if(node.links[word.charAt(i)-'a']!=null){
                node = node.links[word.charAt(i)-'a'];
            }
            else{
                node.links[word.charAt(i)-'a'] = new Node();
                node = node.links[word.charAt(i)-'a'];
            }
        }
        node.flag = true;
    }


    //Returns if the word is in the trie

    public static boolean search(String word) {
        //Write your code here
        Node node = root;
        for(int i=0;i<word.length();i++){
            if(node.links[word.charAt(i)-'a']==null){
                return false;
            }
            node = node.links[word.charAt(i)-'a'];
        }
        if(node.flag==true){
            return true;
        }
        return false;
    }

    
    //Returns if there is any word in the trie that starts with the given prefix

    public static boolean startsWith(String prefix) {
        //Write your code here
        Node node = root;
        for(int i=0;i<prefix.length();i++){
            if(node.links[prefix.charAt(i)-'a']==null){
                return false;
            }
            node = node.links[prefix.charAt(i)-'a'];
        }
       
        return true;
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
