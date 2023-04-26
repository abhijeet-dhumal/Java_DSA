package P_09_Backtracking;

import java.util.Arrays;
import java.util.Scanner;

/*
Place N queens on an N*N chessboard such that
no 2 queens can attack each other

N=4
      0   1   2   3
0   |   |   | Q |   |
1   | Q |   |   |   |
2   |   |   |   | Q |
3   |   | Q |   |   |

    TIme complexity = O(n!)
    Recurrence relation = 1Queen Place *T(n-1)+ isSafe()
    T(n) = n*T(n-1) +isSafe()
*/
public class C_04_N_Queens {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter size of chessboard : ");
        int n=inp.nextInt();
        char[][] chessboard = new char[n][n];
        for(int i=0;i<chessboard.length;i++){
            for(int j=0;j<chessboard[i].length;j++){
                chessboard[i][j]='x';
            }
        }
        nQueens(chessboard,0);
    }
    static void nQueens(char[][] chessboard,int row){
        if(row== chessboard.length){
            printBoard(chessboard);
            return;
        }
        for(int i=0;i<chessboard.length;i++){
            if(isSafe(chessboard,row,i)) {
                chessboard[row][i] = 'Q';
                nQueens(chessboard, row + 1); //function call
                chessboard[row][i] = 'x'; //backtracking step
            }
        }
    }
    static void printBoard(char[][] chessboard){
        for(int i=0;i<chessboard.length;i++){
            System.out.println(Arrays.toString(chessboard[i]));
        }
        System.out.println();
    }
    static boolean isSafe(char[][] board,int row, int col){
        //vertically up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diagonally left up
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //diagonally right up
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
}
