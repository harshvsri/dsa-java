package com.harsh.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Backtracking {
    public static void main(String[] args) {
//        boolean[][] board = {
//                {true, true, true},
//                {true, true, true},
//                {true, true, true}
//        };
//        int[][] path = new int[board.length][board[0].length];
//        allPath("", board, 0, 0, path, 1);
        int n = 4;
        boolean[][] board = new boolean[n][n];
//        System.out.println(nQueens(board, 0));
        nKnights(board, 0, 0, 4);
    }

    static int pathCount(int row, int col) {
        if(row == 3 || col == 3) {
            return 1;
        }

        return pathCount(row+1, col) + pathCount(row, col+1);
    }

    static int pathCountRiver(int row, int col) {
        if(row == 3 || col == 3) {
            return 1;
        }
        if(row == 2 && col == 2) {
            return 0;
        }

        return pathCountRiver(row+1, col) + pathCountRiver(row, col+1);
    }

    static List<String> pathTrace(String res, String right, String down) {
        if(right.isEmpty() && down.isEmpty()) {
            List<String> templist = new ArrayList<>();
            templist.add(res);
            return templist;
        }
        List<String> list = new ArrayList<>();

        if(!right.isEmpty()) {
            char chRow = right.charAt(0);
            list.addAll(pathTrace(res+chRow, right.substring(1), down));
        }
        if(!down.isEmpty()) {
            char chCol = down.charAt(0);
            list.addAll(pathTrace(res+chCol, right, down.substring(1)));
        }

        return list;

    }

    static void pathBackTracing(String res, boolean[][] maze, int row, int col) {
        if(row == maze.length-1 && col == maze[0].length-1) {
            System.out.println(res);
            return;
        }


        if(!maze[row][col]) {
            return;
        }

        maze[row][col] = false;

        if(row<maze.length-1) {
            pathBackTracing(res+"D", maze, row+1, col);
        }
        if(col<maze[0].length-1) {
            pathBackTracing(res+"R", maze, row, col+1);
        }
        if(row>0) {
            pathBackTracing(res+"U", maze, row-1, col);
        }
        if(col>0) {
            pathBackTracing(res+"L", maze, row, col-1);
        }

        maze[row][col] = true;

    }

    static List<String> pathTraceDiagonal(String res, int right, int down) {
        if(right == 3 && down == 3) {
            List<String> templist = new ArrayList<>();
            templist.add(res);
            return templist;
        }
        List<String> list = new ArrayList<>();

        if(right<3) {
            list.addAll(pathTraceDiagonal(res+"R",right+1, down));
        }
        if(down<3) {
            list.addAll(pathTraceDiagonal(res+"C", right, down+1));
        }
        if(right<3 && down<3) {
            list.addAll(pathTraceDiagonal(res+"D", right+1, down+1));
        }
        return list;
    }

    static void allPath(String res, boolean[][] maze, int row, int col, int[][] path, int step) {
        if(row == maze.length-1 && col == maze[0].length-1) {
            path[row][col] = step;
            for(int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(res);
            System.out.println();
            return;
        }


        if(!maze[row][col]) {
            return;
        }

        maze[row][col] = false;
        path[row][col] = step;

        if(row<maze.length-1) {
            allPath(res+"D", maze, row+1, col, path, step+1);
        }
        if(col<maze[0].length-1) {
            allPath(res+"R", maze, row, col+1, path, step+1);
        }
        if(row>0) {
            allPath(res+"U", maze, row-1, col, path, step+1);
        }
        if(col>0) {
            allPath(res+"L", maze, row, col-1, path, step+1);
        }

        maze[row][col] = true;
        path[row][col] = 0;

    }

    static int nQueens(boolean[][] board, int row) {
        if(row == board.length) {
            displayQueen(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        //Placing queen.
        for(int col=0; col< board.length; col++) {
            //Place queen if safe.
            if(isQueenSafe(board, row, col)) {
                board[row][col] = true;
                count += nQueens(board, row+1);
                board[row][col] = false;
            }
        }
        return count;
    }


    private static boolean isQueenSafe(boolean[][] board, int row, int col) {
        //Vertical row.
        for(int i=0; i<board.length; i++) {
            if(board[i][col]) {
                return false;
            }
        }
        //Diagonal Left
        int diaLeft = Math.min(row, col);
        for(int i=1; i<=diaLeft; i++) {
            if(board[row-i][col-i]) {
                return false;
            }
        }
        //Diagonal Rigth
        int diaRight = Math.min(row, board.length-col-1);
        for(int i=1; i<=diaRight; i++) {
            if(board[row-i][col+i]) {
                return false;
            }
        }

        return true;
    }

    private static void displayQueen(boolean[][] board) {
        for(boolean[] row : board) {
            for(boolean element : row) {
                if(element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }




    static void nKnights(boolean[][] board, int row, int col, int knights) {
        if(knights == 0) {
            displayKnight(board);
            System.out.println();
            return;
        }

        if(row == board.length-1 && col == board.length) {
            return;
        }

        if(col == board.length) {
            nKnights(board, row+1, 0, knights);
            return;
        }

        if(isKnightSafe(board, row, col)) {
            board[row][col] = true;
            nKnights(board, row, col+1, knights-1);
            board[row][col] = false;
        }

        nKnights(board, row, col + 1, knights);

    }

    private static boolean isKnightSafe(boolean[][] board, int row, int col) {
        if(isValid(board, row-2, col-1)) {
            if(board[row-2][col-1]) {
                return false;
            }
        }

        if(isValid(board, row-2, col+1)) {
            if(board[row-2][col+1]) {
                return false;
            }
        }

        if(isValid(board, row-1, col-2)) {
            if(board[row-1][col-2]) {
                return false;
            }
        }

        if(isValid(board, row-1, col+2)) {
            if(board[row-1][col+2]) {
                return false;
            }
        }

        return true;
    }

    private static void displayKnight(boolean[][] board) {
        for(boolean[] row : board) {
            for(boolean element : row) {
                if(element) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    static boolean isValid(boolean[][] board, int row, int col) {
        if(row>=0 && row< board.length && col>=0 && col< board.length) {
            return true;
        }
        return false;
    }


}
