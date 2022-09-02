
//Problem Link:-https://www.codingninjas.com/codestudio/problems/1112602?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class duplicateinarray {
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        int slow = 0;
        int fast = 0;
       do{
            slow = arr.get(slow);
            fast = arr.get(arr.get(fast));
        } while(arr.get(slow)!=arr.get(fast));
        slow = arr.get(slow);
        fast = 0;
        while(arr.get(slow)!=arr.get(fast)){
            slow = arr.get(slow);
            fast = arr.get(fast);
        }
        return arr.get(slow);
    }
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}

		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){

        int m = sc.nextInt();
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0;i<m;i++){
            arr.add(sc.nextInt());
        }
        
		
        System.out.println(findDuplicate(arr,m));
        t--;
        }
	}
}
