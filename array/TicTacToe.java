package com.harsh.array;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for(int row=0; row<board.length; row++) {
            for(int col=0; col<board[row].length; col++) {
                board[row][col] = ' ';
            }
        }
        char player = 'X';
        boolean gameOver = false;
        int moveCount = 0;
        Scanner sc = new Scanner(System.in);

        //Game Intro and Rules
        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("Player 1 (X) goes first.");
        System.out.println("Please enter a row (1-3) and column (1-3) to place your mark, separated by a space.");

        while(!gameOver) {
            printBoard(board);
            System.out.print("Player "+player+" enter: ");
            int row = sc.nextInt();
            int col = sc.nextInt();
            //Handling index out of bound.
            if(row>2 || row<0 || col>2 || col<0) {
                System.out.println("Invalid move. Try again!");
            }
            //Placing X or O at empty space and changing player turn.
            else if(board[row][col] == ' ') {
                //Placing the element ( X or O ).
                board[row][col] = player;
                moveCount++;
                gameOver = haveWon(board, player);
                if(gameOver) {
                    System.out.println("Player " + player + " has won");
                } else if(moveCount == 9) {
                    System.out.println("Game Draw");
                    gameOver = true;
                } else {
                    //Changing player turn.
                    player = (player == 'X') ? 'O' : 'X';
                }
            }
            //Handling already used section.
            else {
                System.out.println("Invalid move. Try again!");
            }
        }
        printBoard(board);
    }

    public static boolean haveWon(char[][] board, char player) {
        //Checking for Row win condition.
        for(int row=0; row<board.length; row++) {
            if(board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }

        //Checking for Col win condition.
        for(int col=0; col<board[0].length; col++) {
            if(board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }

        //Checking for Diagonal win condition.
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }

    public static void printBoard(char[][] board) {
        for(int row=0; row<board.length; row++) {
            for(int col=0; col<board[row].length; col++) {
                System.out.print(board[row][col]+ " | ");
            }
            System.out.println();
        }
    }
}
