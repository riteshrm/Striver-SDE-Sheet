
//Problem Link:-https://leetcode.com/problems/flood-fill/

import java.io.*;
import java.util.*;

public class flood_fill {


	 class Pair{
        int r;
        int c;
        Pair(int r,int c){
            this.r = r;
            this.c = c;
        }
    }
    boolean valid(int x,int y,int[][] image,int cc){
        if(x<0 || y<0 || x>=image.length || y>=image[0].length || image[x][y]!=cc){
            return false;
        }
        return true;
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int cc = image[sr][sc];
        if(cc==color){
            return image;
        }
        image[sr][sc] = color;
        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(sr,sc));
        while(!q.isEmpty()){
            int size = q.size();
            for(int k=0;k<size;k++){
                Pair pp = q.poll();
                for(int i=0;i<4;i++){
                    int x = dx[i]+pp.r;
                    int y = dy[i]+pp.c;
                    if(valid(x,y,image,cc)){
                        image[x][y] = color;
                        q.add(new Pair(x,y));
                    }
                }
            }
        }
        return image;
        
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
