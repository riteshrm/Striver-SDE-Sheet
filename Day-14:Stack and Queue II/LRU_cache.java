
//Problem Link:-https://leetcode.com/problems/lru-cache/

import java.io.*;
import java.util.*;

public class LRU_cache {

	class LRUCache {
    
    class Node{
        int key;
        int value;
        Node next;
        Node pre;
        Node(int key,int value){
            this.key = key;
            this.value = value;
        }
    }
    
    void del(Node node){
        if(head==node){
            head = head.next;
            if(head!=null){
                head.pre = null;
            }
            
            return;
        }
        if(node==tail){
            tail = node.pre;
            node.pre.next = null;
            node.pre = null;
            return;
        }
        node.pre.next = node.next;
        node.next.pre = node.pre;
        node.next = null;
        node.pre = null;
        
    }
    
    void add(Node node){
        if(head==null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.pre = tail;
        tail = node;
        
    }
    
    int cap;
   HashMap<Integer,Node> map;
    Node head;
    Node tail;

    public LRUCache(int capacity) {
       cap = capacity;
        map = new HashMap<>();
        head=null;
            tail=null;
    }
  
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node node = map.get(key);
        del(node);
        add(node);
        return node.value;
    }
    
    public void put(int key, int value) {
       if(map.containsKey(key)){
           Node node = map.get(key);
           node.value = value;
           del(node);
           add(node);
          
       }
        
        else{
            if(cap==map.size()){
                map.remove(head.key);
                del(head);
                Node node = new Node(key,value);
                add(node);
                 map.put(key,node);
            }
            else{
                Node node = new Node(key,value);
                map.put(key,node);
                add(node);
               
            }
        }
    }
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
		System.out.println(n);
		
	}
}
