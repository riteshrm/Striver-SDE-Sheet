//Problem Link:-https://leetcode.com/problems/pascals-triangle/
import java.io.*;
import java.util.*;

public class pascalstriangle {
	public List<List<Integer>> generate(int numRows) {
        
       List<List<Integer>> arr = new ArrayList<>();
        
        for(int i=0;i<numRows;i++){
            int j = 0;
            arr.add(new ArrayList<>());
            while(j<=i){
                if(j==0 || j==i){
                    arr.get(i).add(1);
                    j++;
                }
                else{
                   
                        arr.get(i).add(arr.get(i-1).get(j-1)+arr.get(i-1).get(j));
                        j++;
                    
                }
            }
        }
        return arr;
    }
	
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		
	}
}
