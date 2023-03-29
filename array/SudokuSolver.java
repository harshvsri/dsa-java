package com.harsh.array;


public class SudokuSolver {
    public static void main(String[] args) {
        int[][] grid = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        if(solve(grid)) {
            display(grid);
        } else {
            System.out.println("Cant be solved.");
        }

    }

    static boolean solve(int[][] grid) {
        int n = grid.length;
        int row = -1;
        int col = -1;
        boolean isEmpty = true;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(grid[i][j] == 0) {
                    row = i;
                    col = j;
                    isEmpty = false;
                    break;
                }
            }
            if(isEmpty == false) {
                break;
            }
        }
        if(isEmpty == true) {
            return true;
            //Sudoku is solved.
        }
        //Backtracking.
        for(int number=1; number<=9; number++) {
            if(sudokuCheaks(grid, row, col, number)) {
                grid[row][col] = number;
                if(solve(grid)) {
                    return true;
                } else {
                    //Backtrack.
                    grid[row][col] = 0;
                }
            }
        }
        return false;
    }

    private static void display(int[][] grid) {
        for(int[] row : grid) {
            for(int num : row) {
                System.out.print(num+"  ");
            }
            System.out.println();
        }
    }


    static boolean sudokuCheaks(int[][] grid, int row, int col, int num) {
        //For row and column cheak.
        for(int i=0; i<9; i++) {
            if(grid[i][col] == num) {
                return false;
            }
            if(grid[row][i] == num) {
                return false;
            }
        }
        //For dubgrid cheak.
        int sqrt = (int)Math.sqrt(grid.length);
        int x = row-(row%sqrt);
        int y = col-(col%sqrt);
        for(int i=x; i<x+sqrt; i++) {
            for(int j=y; j<y+sqrt; j++) {
                if(grid[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }


}

