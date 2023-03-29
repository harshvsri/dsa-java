package com.harsh.array;

import java.util.Arrays;

public class Function {
    public static void main(String[] args) {
        fabonacci(8);
    }

    static void armstrong(int lower, int upper) {
        for (int num = lower + 1; num < upper; num++) {
            //System.out.print(num + " ");

            int x = num;
            int counter = 0;
            while (x != 0) {
                x /= 10;
                counter++;
            }
            //System.out.print(counter + " ");

            int sum = 0;
            int y = num;
            while (y != 0) {
                int digit = y % 10;
                sum += Math.pow(digit, counter);
                y /= 10;
            }
            //System.out.println(sum);

            if (sum == num) {
                System.out.print(sum + " ");
            }
        }
    }

    static void greet(String name) {
        System.out.println("नमस्ते :) "+name);
    }

    static int max(int a, int b, int c) {
        int max = a;
        if(b>max) {
            max = b;
        } if(c>max) {
            max = c;
        }return max;
    }
    static int min(int a, int b, int c) {
        int min = a;
        if(b<min) {
            min = b;
        } if(c<min) {
            min = c;
        }return min;
    }

    static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1+" "+num2);
    }

    static void nums(int ...x) {
        System.out.println(Arrays.toString(x));
    }

    static int Nsum(int num) {
        int sum = 0;
        for(int i=1; i<=num; i++) {
            sum += i;
        }
        return sum;
    }

    static int factorial(int num) {
        int fact = 1;
        for (int i=1; i<=num; i++) {
            fact *= i;
        }
        return fact;
    }

    static void isPy(int a, int b, int c) {
        if (a * a + b * b == c * c) {
            System.out.println("Is Pytriplet");
        } else {
            System.out.println("Not Pytriplet");
        }
    }

    static void allPrime(int a, int b) {
        for (int i=a+1; i<b; i++) {
            int isprime = 1;
            for (int j=2; j*j<=i; j++) {
                if (i%j==0) {
                    isprime = 0;
                    break;
                }
            }
            if (isprime==1) {
                System.out.print(i+" ");
            }
        }
    }

    static void table(int num) {
        for (int i=1; i<=10; i++) {
            System.out.println(num+"X"+i+"="+num*i);
        }

    }

    static void digitCounter(int num, int key) {

        int temp = num;
        int counter = 0;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit == key) {
                counter++;
            }
            temp /= 10;
        }
        System.out.println(counter);
    }

    static void digitSum(int num) {

        int sum = 0;
        while (num>0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;

        }
        System.out.println(sum);
    }

    static void fabonacci(int n) {
        int num1 = 0;
        int num2 = 1;
        int sum = num1+num2;
        System.out.print(num1+" "+num2+" "+sum+" ");
        int counter = 3;
        int nsum = 2;

        while (counter < n) {
            num1 = num2;
            num2 = sum;
            sum = num1+num2;
            nsum += sum;
            System.out.print(sum+" ");
            counter++;
        }
        System.out.println();
        System.out.println("Sum of "+n+" terms is "+nsum);
    }

    static void gardes(int marks) {
        if (marks>=91 &&marks<=100) {
            System.out.println("AA");
        } else if (marks>=81 &&marks<=90) {
            System.out.println("AB");
        } else if (marks>=71 &&marks<=80) {
            System.out.println("BB");
        } else if (marks>=61 &&marks<=70) {
            System.out.println("BC");
        } else if (marks>=51 &&marks<=60) {
            System.out.println("CD");
        } else if (marks>=41 &&marks<=50) {
            System.out.println("DD");
        } else {
            System.out.println("Fail");
        }
    }

}

