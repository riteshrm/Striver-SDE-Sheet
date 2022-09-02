
//Problem Link:-https://leetcode.com/problems/rotting-oranges/

import java.io.*;
import java.util.*;

public class rotten_oranges {

	public int orangesRotting(int[][] grid) {
         if(grid == null || grid.length == 0) return 0;
        Queue<int[]> q = new LinkedList<>();
        int row = grid.length;
        int col = grid[0].length;
        int count_fresh= 0;
        int count = 0;
        for(int i=0;i<row;i++){
            for(int j = 0;j<col;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
                else if(grid[i][j]==1){
                    count_fresh++;
                }
            }
        }

        if(count_fresh==0){
            return 0;
        }

        

        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            count++;
            int size = q.size();
            for(int i=0;i<size;i++){
                int[] point = q.poll();
                for(int dir[] : dirs) {
                    int x = point[0] + dir[0];
                    int y = point[1] + dir[1];

                    if(x < 0 || y < 0 || x >= row || y >= col|| grid[x][y] == 0 || grid[x][y] == 2) continue;

                    grid[x][y] = 2;

                    q.add(new int[]{x , y});

                    count_fresh--;
                }
            }
        }
        return count_fresh==0?count-1:-1;
    }


	

	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n);
		
	}
}
