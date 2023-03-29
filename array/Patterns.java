package com.harsh.array;

public class Patterns {
    public static void main(String[] args) {
        pattern31(3);

    }

    static void pattern1(int n) {
        for(int row=1; row<=n; row++) {
            for(int col=1; col<=n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for(int row=1; row<=n; row++) {
            for(int col=1; col<=row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for(int row=1; row<=n; row++) {
            for(int col=1; col<=n+1-row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for(int row=1; row<=n; row++) {
            for(int col=1; col<=row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {

        for(int row=1; row<2*n; row++) {
            int tolalCol = 0;
            if (row > n) {
                tolalCol = n - (row % n);
            } else {
                tolalCol = row;
            }
            for (int col = 1; col <= tolalCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n) {
        for(int row=1; row<2*n; row++) {
            int totalSpace = 0;
            if (row > n) {
                totalSpace = row%n;
            } else {
                totalSpace = n-row;
            }
            for(int space=0; space<=totalSpace; space++) {
                System.out.print(" ");
            }

            int tolalCol = 0;
            if (row > n) {
                tolalCol = n - (row % n);
            } else {
                tolalCol = row;
            }
            for(int col=1; col<=tolalCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern29(int n) {
        for(int row =1; row<=n; row++) {
            int totalSpace = n-row;
            for(int space=0; space<totalSpace; space++) {
                System.out.print("  ");
            }

            for(int col1=row; col1>0; col1--) {
                System.out.print(col1+" ");
            }
            for(int col2=2; col2<=row; col2++) {
                System.out.print(col2+" ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n) {
        for(int row =1; row<2*n; row++) {
            int totalSpace = 0;
            if(row>n) {
                totalSpace = row%n;
            } else {
                totalSpace = n-row;
            }
            for(int space=0; space<totalSpace; space++) {
                System.out.print(" ");
            }

            int totalCol = 0;
            if(row > n) {
                totalCol = n - (row%n);
            } else {
                totalCol = row;
            }
            for(int col1=totalCol; col1>0; col1--) {
                System.out.print(col1);
            }
            for(int col2=2; col2<=totalCol; col2++) {
                System.out.print(col2);
            }

            System.out.println();
        }

    }

    static void pattern31(int n) {
        int ogNum = n;
        n = 2*n;
        for(int row=0; row<=n; row++) {
            for(int col=0; col<=n; col++) {
                int atEveryIndex = ogNum - Math.min(Math.min(row, col) , Math.min(n-row, n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }

    }
}
