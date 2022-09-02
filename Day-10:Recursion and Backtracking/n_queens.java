
//Problem Link:-https://leetcode.com/problems/n-queens/

import java.io.*;
import java.util.*;

public class n_queens {

	  boolean isValid(char[][] c,int i,int j){
      for(int x=0;x<i;x++){
          for(int y=0;y<c[0].length;y++){
              if(c[x][y]=='Q' && (y==j || x+j==y+i || x+y==i+j)){
                  return false;
              }
          }
      }
     return true;
        
        
    }
    
    void construct(char[][] c,List<List<String>> ans){
        List<String> lis = new ArrayList<>();
            for(int i=0;i<c.length;i++){
                StringBuilder sb = new StringBuilder();
                for(int j=0;j<c[0].length;j++){
                    sb.append(c[i][j]);
                }
                lis.add(sb.toString());
            }
            ans.add(lis);
    }
    void fun(char[][] c,int x,List<List<String>> ans){
        if(x==c.length){
            construct(c,ans);
            return;
        }
        
        for(int y=0;y<c[0].length;y++){
            if(isValid(c,x,y)){
                c[x][y] = 'Q';
                fun(c,x+1,ans);
                c[x][y] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] c = new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(c[i],'.');
        }
        fun(c,0,ans);
        return ans;
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
