package P_09_Backtracking;

import java.util.Arrays;

public class C_06_SudokuSolver {
    public static void main(String[] args) {
        int[][] sudoku = {
                {0,0,8,  0,0,0,  0,0,0},
                {4,9,0,  1,5,7,  0,0,2},
                {0,0,3,  0,0,4,  1,9,0},

                {1,8,5,  0,6,0,  0,2,0},
                {0,0,0,  0,2,0,  0,6,0},
                {9,6,0,  4,0,5,  3,0,0},

                {0,3,0,  0,7,2,  0,0,4},
                {0,4,9,  0,3,0,  0,5,7},
                {8,2,7,  0,0,9,  0,1,3}
        };
        if(Solver(sudoku,0,0)){
            System.out.println("Solution exists !");
            printSudoku(sudoku);
        }else {
            System.out.println("Solution does not exist !");
        }

    }
    static boolean Solver(int[][] sudoku,int row, int col){
        //base case
        if(row==9 && col==0){
            return true;
        }

        int nextRow = row, nextCol=col+1;

        if(nextCol==9){
            nextRow=row+1;
            nextCol=0;
        }
        if(sudoku[row][col] !=0){
            return Solver(sudoku,nextRow,nextCol);
        }
        for(int digit=1;digit<= 9;digit++){
            if(isSafe(sudoku,row,col,digit)){
                sudoku[row][col]=digit;
                if (Solver(sudoku,nextRow,nextCol)){
                    return true;
                }
                sudoku[row][col]=0;
            }
        }
        return false;
    }
    static boolean isSafe(int[][] sudoku, int row, int col,int digit){
        //check for col
        for(int i=0;i<9;i++){
            if(sudoku[i][col]==digit){
                return false;
            }
        }

        //check for row
        for(int i=0;i<9;i++){
            if(sudoku[row][i]==digit){
                return false;
            }
        }

        //check for 3*3 grid : to identify in which 3*3 grid it comes
        int gridStartRow = ((int)(row/3))*3;
        int gridStartCol = ((int)(col/3))*3;
        for(int i=gridStartRow;i<gridStartRow+3;i++){
            for(int j=gridStartCol;j<gridStartCol+3;j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    static void printSudoku(int[][] sudoku){
        for(int i=0;i<sudoku.length;i++){
            System.out.println(Arrays.toString(sudoku[i]));
        }
    }
}
