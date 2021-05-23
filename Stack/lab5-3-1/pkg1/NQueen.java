/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.pkg3.pkg1;

import java.util.ArrayList;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class NQueen {
    
    static Stack<Integer> stack = new Stack<>();
    static Stack<Integer> tempStack = new Stack<>();
    static int numOfSolution = 0;

    public NQueen(int numOfQueen) {
        System.out.println("Solving the " + numOfQueen + " Queens problem");
        boolean[][] board = new boolean[numOfQueen][numOfQueen];
        solve(board, 0);
        System.out.println("The number of solutions are : " + numOfSolution);
    }
    
    //backtracking
    public static void solve(boolean[][] board,int row){
        if(row > board.length-1){
            return;
        }
        int currentColumn = 0;
        while(true){
            boolean valid = false;
            for (; currentColumn < board.length; currentColumn++) {
                if(isSafe(board, row, currentColumn)){
                    stack.push(currentColumn);
                    board[row][currentColumn] = true;
                    currentColumn=0;
                    valid = true;
                    row++;
                    break;
                }
            }
            if(!valid){
                if(stack.isEmpty()){
                        break;
                }else{
                    int deleteRow = stack.getSize()-1;
                    int column = stack.pop();
                    board[deleteRow][column] = false;
                    currentColumn = column+1;
                    row--;
                }
            }

            if(stack.getSize() == board.length){
                    numOfSolution++;
                    printSolution(stack.getSize()-1);
                    while(!tempStack.isEmpty()){stack.push(tempStack.pop());}
                    currentColumn = stack.pop();
                    row--;
                    currentColumn++;
                for (int j = 0; j < board.length; j++) {
                    if(board[board.length-1][j]){
                        board[board.length-1][j] = false;
                    }
                }
                System.out.println("");
            }
        }
    }
    
    public static boolean isSafe(boolean[][] board,int row,int col){
        int i,j;
        //to check on the same column
        for (i = 0; i < row; i++) {
            if(board[i][col]){
                return false;
            }
        }
        //to check the upper left diagonal 
        for (i = row,j = col; i >=0&&j>=0; i--,j--) {
            if(board[i][j]){
                return false;
            }
        }
        //to check the upper right diagonal
        for (i = row,j=col; i>=0&&j <board.length; i--,j++) {
            if(board[i][j]){
                return false;
            }
        }
        return true;
    }

    public static int printSolution(int N){
        if(stack.isEmpty()){
            return -1;
        }
        int lastElement = -1;
        int column = -1;
        column = tempStack.push(stack.pop());
        int returnValue = printSolution(N);
        if(returnValue == -1){
            lastElement = column;
        }else{
            lastElement = returnValue;
        }
        for (int i = 0; i < column; i++) {
            System.out.print("* ");
        }
        System.out.print("Q ");
        for (int i = column; i < N; i++) {
            System.out.print("* ");
        }
        System.out.println("");
        return lastElement;
    }

    public static void queens(int n){
        System.out.println("Solving the " + n + " Queens problem");
        boolean[][] board = new boolean[n][n];
        solve(board, 0);
        System.out.println("The number of solutions are : " + numOfSolution);
    }
}