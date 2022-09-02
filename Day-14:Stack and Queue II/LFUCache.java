
//Problem Link:-https://leetcode.com/problems/lfu-cache/

import java.io.*;
import java.util.*;

public class LFUCache {

	class LFUCache {
    
    class DLL{
        Node head;
        Node tail;
        int size;
        DLL(){
            head = null;
            tail = null;
            size=0;
        }
        
        void add(Node node){
            size++;
            if(head==null){
                head = node;
                tail = node;
                return ;
            }
            tail.next = node;
            node.pre = tail;
            tail = node;
            
        }
        
        void del(Node node){
            size--;
            if(head==node && tail==node){
                head = null;
                tail = null;
                return;
            }
            if(head==node){
                head = head.next;
                if(head!=null){
                    head.pre = null;
                }
               
                return;
            }
            if(node==tail){
                tail.pre.next = null;
                tail = tail.pre;
                return;
            }
            node.pre.next = node.next;
            node.next.pre = node.pre;
            
        }
        Node removeFirst() {
                if (size > 0) {
                    Node node = head;
                    del(node);
                    return node;
                }
                return null;
            }
    }
    
    class Node{
        Node pre;
        Node next;
        int value;
        int key;
        int freq;
        Node(int key,int value,int freq){
            this.key = key;
            this.value = value;
            this.freq = freq;
        }
    }
    
    HashMap<Integer,DLL> freqmap;
    HashMap<Integer,Node> valuemap;
    int capacity;
    int minfreq;
   

    public LFUCache(int capacity) {
        this.capacity = capacity;
       
        minfreq = -1;
        freqmap = new HashMap<>();
        valuemap = new HashMap<>();
    }
    
    public int get(int key) {
        if(!valuemap.containsKey(key)){
            return -1;
        }
        Node node = valuemap.get(key);
        update(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if(capacity==0){
            return;
        }
        if(valuemap.containsKey(key)){
            Node node = valuemap.get(key);
            node.value = value;
            update(node);
        }
        else{
           
           
            if(capacity==valuemap.size()){
                DLL dll = freqmap.get(minfreq);
                valuemap.remove(dll.removeFirst().key);
            }
             minfreq = 1;
            Node node = new Node(key,value,1);
         
                DLL newL = freqmap.getOrDefault(minfreq,new DLL());
                newL.add(node);
               freqmap.put(minfreq,newL);
            
             valuemap.put(key,node);
        }
    }
    void update(Node node){
        DLL ll = freqmap.get(node.freq);
        ll.del(node);
        if(minfreq==node.freq && freqmap.get(node.freq).size==0){
            minfreq++;
        }
        node.freq++;
         DLL newL = freqmap.getOrDefault(node.freq,new DLL());
         newL.add(node);
        freqmap.put(node.freq,newL);
        
        
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
