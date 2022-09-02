//Problem Link:-https://leetcode.com/problems/set-matrix-zeroes/
import java.io.*;
import java.util.*;

public class setmatrixzero {

	public void setZeroes(int[][] matrix) {
        boolean t = false;
        int n = matrix.length;
        int m = matrix[0].length;
        for(int j=0;j<m;j++){
            if(matrix[0][j]==0){
                t = true;
                break;
            }
        }
      
        
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }
        
        for(int i=n-1;i>0;i--){
            for(int j=m-1;j>=0;j--){
                if(matrix[i][0]==0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        
          if(t){
            for(int j=0;j<m;j++){
           matrix[0][j] = 0;
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
		
	}
}
