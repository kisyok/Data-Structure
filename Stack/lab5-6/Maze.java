/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.pkg6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Maze {
    static char[][] maze;
    static char[][] duplicateMaze;
    
    public static void readFile(){
        try{
            Scanner s = new Scanner(new FileInputStream("Maze.txt"));
            int row=0, column=0;
            while(s.hasNextLine()){
                s.nextLine();
                row++;
            }
            s = new Scanner(new FileInputStream("Maze.txt"));
            String[] line = new String[row];
            for(int i=0; i<row; i++){
                line[i] = s.nextLine();
                column = line[i].length();
            }
            maze = new char[row][column];
            duplicateMaze = new char[row][column];
             for(int i=0; i<row; i++){
                 for(int j=0; j<column; j++){
                     maze[i][j] = line[i].charAt(j);
                     duplicateMaze[i][j] = line[i].charAt(j);
                 }
            }
             
            s.close();
        }catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }
    }
    
    public static void findSolution(){
        System.out.println("The original maze is");
        int[] point = print();
        int startX = point[0],startY = point[1];//point S
        int endX = point[2],endY = point[3];//point F
        Stack<Integer> route = new Stack<>();//to store the movements
        int row = startX;
        int col = startY;
        while(true){
            //1 = up,2 = right, 3 = down, 4 = left
            if(isSafe(row-1, col)){//to check upward position is safe or not
                //move up
                row--;
                route.push(1);
                duplicateMaze[row][col] = '.';
            }else if(isSafe(row, col+1)){//to check right position is safe or not
                //move right
                col++;
                route.push(2);
                duplicateMaze[row][col] = '.';
            }else if(isSafe(row+1, col)){//to check downward position is safe or not
                //move down
                row++;
                route.push(3);
                duplicateMaze[row][col] = '.';
            }else if(isSafe(row, col-1)){//to check left position is safe or not
                //move left
                col--;
                route.push(4);
                duplicateMaze[row][col] = '.';
            }else{
            //in case no valid movements, backtrack
                int mov = backtrack(route);
                duplicateMaze[row][col] = '#';
                boolean noSol = false;
                switch(mov){
                    case 1:
                        //move up
                        row--;
                        break;
                    case 2:
                        //move right
                        col++;
                        break;
                    case 3:
                        //move down
                        row++;
                        break;
                    case 4:
                        //move left
                        col--;
                        break;
                    case -1:
                        //no solution
                        noSol = true;
                        break;
                }
                if(noSol){break;}
            }
            //point F is found
            if(row == endX && col == endY){
                System.out.println("\nThe solution is");
                markWay(route, startX, startY);
                print();
                break;
            }
        }
    }
    public static boolean isSafe(int x,int y){
        switch (duplicateMaze[x][y]) {
            case ' ':
                return true;
            case '#':
                return false;
            case 'S':
                return false;
            case '.':
                //explored
                return false;
            default:
                return true;
        }
    }
     public static int backtrack(Stack s){
        int x = (s.isEmpty())?0:(Integer)s.pop();
        switch(x){
            case 1: //if previous move is 1(up), move 3(down)
                return 3;
            case 2: //if previous move is 2(right), move 4(down)
                return 4;
            case 3: //if previous move is 3(down), move 1(up)
                return 1;
            case 4: //if previous move is 4(left), move 2(right)
                return 2;
            default:
                //if the stack is empty, means failed to find solution
                return -1;
        }
    }
    public static void markWay(Stack temp,int startRow,int startCol){
        Stack<Integer> way = reverse(temp);
        while(!way.isEmpty()){
            int mov = (Integer)way.pop();
            if(way.isEmpty()){
                break;
            }
            switch(mov){
                case 1:
                    startRow--;
                    break;
                case 2:
                    startCol++;
                    break;
                case 3:
                    startRow++;
                    break;
                case 4:
                    startCol--;
                    break;
            }
            maze[startRow][startCol] = '.';
        }
    }
     public static Stack reverse(Stack s){
        Stack<Integer> ret = new Stack<>();
        while(!s.isEmpty()){
            ret.push((Integer)s.pop());
        }
        return ret;
    }
    
    
    public static int[] print(){
        int[] arr = new int[4];
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                System.out.print(maze[i][j]);//to print the 2D arr of maze
                if(maze[i][j] == 'S'){//to get the coordinate of S
                    arr[0] = i;
                    arr[1] = j;
                }
                if(maze[i][j] == 'F'){//to get coordinate of F
                    arr[2] = i;
                    arr[3] = j;
                }
            }
            System.out.println("");
        }
        return arr;
    }
    
}
