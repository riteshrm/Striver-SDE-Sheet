
//Problem Link:-https://leetcode.com/problems/sudoku-solver/

import java.io.*;
import java.util.*;

public class sudoku_solver {
	

	 boolean fun(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.'){
             for(char c='1';c<='9';c++){
                if(isValid(board,i,j,c)){
                    board[i][j] = c;
                    if(fun(board)){
                        return true;
                    }
                    else{
                        board[i][j]  ='.';
                    }
                }
                }
                    return false;
                }
               
            }
        }
        return true;
    }
    
    boolean isValid(char[][] board,int x,int y,char c){
        for(int i=0;i<board.length;i++){
            if(board[x][i]!='.' && board[x][i]==c) return false;
            if(board[i][y]!='.' && board[i][y]==c) return false;
            if(board[3*(x/3)+i/3][3*(y/3)+i%3]!='.' && board[3*(x/3)+i/3][3*(y/3)+i%3]==c) return false;
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        fun(board);
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
