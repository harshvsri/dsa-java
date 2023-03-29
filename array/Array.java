package com.harsh.array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

//        #INPUT
//        for (int i=0; i<arr.length; i++) {
//            //System.out.print("arr"+(i+1)+" : ");
//            arr[i] = in.nextInt();
//        }

//        for (int i=0; i<arr.length; i++) {
//            //System.out.print("arr"+(i+1)+" : ");
//            name[i] = in.next();
//        }


//        #OUTPUT
//        for (int i=0; i<5; i++) {
//            System.out.print(arr[i]+" ");
//        }
//
//        for (int num : arr) {
//            System.out.print(num+" ");
//        }
//
//        System.out.println(Arrays.toString(name));
//

    }

    static void input1d(int[] arr) {
        Scanner in = new Scanner(System.in);
        for (int i=0; i< arr.length; i++) {
            arr[i] = in.nextInt();
        }
    }

    static void input2d(int[][] arr) {
        Scanner in = new Scanner(System.in);
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
    }

    static void output1d(int[] arr) {
        for (int i=0; i< arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    static void output2d(int[][] arr) {
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
