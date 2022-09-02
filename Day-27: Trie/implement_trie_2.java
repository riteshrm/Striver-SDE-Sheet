
//Problem Link:-https://www.codingninjas.com/codestudio/problems/implement-trie_1387095?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class implement_trie_2 {

	 static class Node{
    Node links[];
    int cntend;
       int cntwith;
    public Node(){
        links = new Node[26];
       cntend = 0;
        cntwith = 0;
    }
}
    Node root;
   
    public Trie() {
        // Write your code here.
        root = new Node();
    }

    public void insert(String word) {
        // Write your code here.
         Node node = root;
        for(int i=0;i<word.length();i++){
            if(node.links[word.charAt(i)-'a']==null){
                node.links[word.charAt(i)-'a'] = new Node();
                
            }
            node = node.links[word.charAt(i)-'a'];
            node.cntwith++;
        }
        node.cntend++;;
      
    }

    public int countWordsEqualTo(String word) {
        // Write your code here.
        Node node = root;
        for(int i=0;i<word.length();i++){
            if(node.links[word.charAt(i)-'a']==null){
                return 0;
                
            }
            node = node.links[word.charAt(i)-'a'];
            }
       return node.cntend;
    }

    public int countWordsStartingWith(String word) {
        // Write your code here.
        Node node = root;
        for(int i=0;i<word.length();i++){
            if(node.links[word.charAt(i)-'a']==null){
                return 0;
                
            }
            node = node.links[word.charAt(i)-'a'];
            }
       return node.cntwith;
    }

    public void erase(String word) {
        // Write your code here.
        Node node = root;
        for(int i=0;i<word.length();i++){
           
           node = node.links[word.charAt(i)-'a'];
            node.cntwith--;
            }
       node.cntend--;
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
