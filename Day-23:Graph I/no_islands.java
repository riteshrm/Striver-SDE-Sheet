
//Problem Link:-https://leetcode.com/problems/number-of-islands/

import java.io.*;
import java.util.*;

public class no_islands {

	int count,m,n;
    void dfs(char[][] grid,int x,int y){
        if(x<0 || x>=m || y<0 || y>=n || grid[x][y]!='1'){
            return;
        }
       grid[x][y]  ='0';
        dfs(grid,x-1,y);
        dfs(grid,x,y+1);
        dfs(grid,x,y-1);
        dfs(grid,x+1,y);
       
        
            
        
    }
    
    public int numIslands(char[][] grid) {
         m = grid.length;
         n = grid[0].length;
        
        count =0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    count++;
                }
            }
        }
        return count;
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
