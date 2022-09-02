
//Problem Link:-https://www.codingninjas.com/codestudio/problems/chess-tournament_981299?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.io.*;
import java.util.*;

public class chess_tournament {
	

	 static boolean poss(int[] pos,int c,int mid){
        int cc = 1;
        int dis = pos[0];
        for(int i=1;i<pos.length;i++){
            if(pos[i]-dis>mid){
                cc++;
                dis = pos[i];
            }
            if(cc==c){
                return true;
            }
            
        }
        return false;
    }

    public static int chessTournament(int[] pos, int n,  int c) 
	{
        // Write your code here.  
        if(c>pos.length){
            return -1;
        }
        Arrays.sort(pos);
        int low = 0;
        int res=-1;
        int high = pos[n-1]-pos[0];
        while(low<=high){
            int mid = (low+high)/2;
            if(poss(pos,c,mid)){
                res = mid;
                low=mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return res+1;
    }

	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}

		Scanner sc = new Scanner(System.in);
		int n = c.nextInt();
		System.out.println(n);
		
	}
}
