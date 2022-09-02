
//Problem Link:-https://www.codingninjas.com/codestudio/problems/1112655?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class flatten_ll {

	 public static Node merge(Node tmp1,Node tmp2){
         Node res = new Node(0);
            Node tmp = res;
            while(tmp1!=null && tmp2!=null){
                if(tmp1.data<=tmp2.data){
                    tmp.child = tmp1;
                    tmp = tmp.child;
                    tmp1 = tmp1.child;
                }
                else{
                    tmp.child = tmp2;
                     tmp = tmp.child;
                    tmp2 = tmp2.child;
                  
                }
            }
            
        if(tmp1!=null){
            tmp.child =tmp1;
        }
        else{
            tmp.child = tmp2;
        }
            
        return res.child;
    }
	public static Node flattenLinkedList(Node start) {
		 //Write your code here
        if(start==null || start.next==null){
            return start;
        }
        
       return merge(start,flattenLinkedList(start.next));
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
