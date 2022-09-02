
//Problem Link:-https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1

import java.io.*;
import java.util.*;

public class rat_in_maze {


	 static char[] d = {'D','L','R','U'};
    static int[] dx = {1,0,0,-1};
    static int[] dy = {0,-1,1,0};
    
    static boolean isValid(int n,int x,int y){
        if(x<0 || x>=n || y<0 || y>=n){
            return false;
        }
        return true;
    }
    static void fun(int[][] m,int[][] vis,String sb,int x,int y,int n,ArrayList<String> ans){
        
        if(x==n-1 && y==n-1){
            
            ans.add(sb);
            return;
        }
        for(int i=0;i<4;i++){
            if(isValid(n,x+dx[i],y+dy[i]) && vis[x+dx[i]][y+dy[i]]==0 && m[x+dx[i]][y+dy[i]]==1 ){
               
                vis[x+dx[i]][y+dy[i]]=1;
                fun(m,vis,sb+d[i],x+dx[i],y+dy[i],n,ans);
               
                vis[x+dx[i]][y+dy[i]]=0;
            }
        }
        
    }
    
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        int[][] vis = new int[n][n];
        ArrayList<String> ans = new ArrayList<>();
        if(m[0][0]==1){
           vis[0][0]=1;
           fun(m,vis,"",0,0,n,ans);}
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
