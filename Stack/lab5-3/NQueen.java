/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.pkg3;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class NQueen {
    boolean[][] board;
    int N;
    int count = 0;
    
    public NQueen(int a){
        Stack<Integer> stack = new Stack<>();
        int column = 0;
        N = a;
        int row = 0; 
        board = new boolean[N][N];
        reset();
        
        while(true){
            column = isValid(row, column);
            if(column != -1){//there is a valid position
                stack.push(column);
                board[row][column] = true;
                column = 0;
                row++;
            }
            else if(column == -1){//there is no valid position
                if(stack.isEmpty()){
                    break;
                }else{
                    row--;
                    column = stack.pop();
                    board[row][column] = false;
                    column++;
                }
            }
            if(stack.getSize() == N){
                count++;
                for(int i=0; i<N; i++){
                    int num = stack.pop();
                    printQLine(N, num);
                    if(i == N-1){
                        column = num;
                    }
                }
                System.out.println();
                reset();
                row = 0;
                column++;
            }
        }
    }
    private void printQLine(int N, int index){
        
        for(int i=0; i<N; i++){
            if(i != index){
                System.out.print("* ");
            }
            else{
                System.out.print("Q ");
            }
        }
        System.out.println();
    }
    private void reset(){
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                board[i][j] = false;
            }
        }
    }
    private int isValid(int row, int column){
        for(int i= column; i<N; i++){
            if(canBePlaced(row, i)){
                return i; //return column index that can be placed
            }
        }
        return -1;
    }
    private boolean canBePlaced(int row, int column){
        int i,j;
        
        //check left to right
        for(i=0; i<board.length; i++){
            if(board[row][i] == true){
                return false;
            }
        }
        //check top to bottom
        for(i=0; i<board.length; i++){
            if(board[i][column] == true){
                return false;
            }
        }
        //check diagonally
        for(i = row, j = column; i >= 0 && j < board.length; i--, j++){//top left
            if(board[i][j] == true){
                return false;
            }
        }
        for(i = row, j = column; i < board.length && j >= 0; i++, j--){//bottom right
            if(board[i][j] == true){
                return false;
            }
        }
        for(i = row, j = column; i >= 0 && j >= 0; i--, j--){//bottom left
            if(board[i][j] == true){
                return false;
            }
        }
        for(i = row, j = column; i < board.length && j < board.length; i++, j++){//top right
            if(board[i][j] == true){
                return false;
            }
        }
        return true;
    }
    private int count(){
        return count;
    }
}
