
//Problem Link:-https://leetcode.com/problems/clone-graph/

import java.io.*;
import java.util.*;

public class clone_graph {

	HashMap<Node,Node> map;
    void copyof(Node root){
        if(root==null){
            return;
        }
        Node node = new Node(root.val);
        map.put(root,node);
        List<Node> arr = root.neighbors;
        for(int i=0;i<arr.size();i++){
            if(!map.containsKey(arr.get(i))){
                copyof(arr.get(i));
            }
           node.neighbors.add(map.get(arr.get(i)));
        }
       
    }
    public Node cloneGraph(Node node) {
        map = new HashMap<>();
       copyof(node);
        return map.get(node);
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
