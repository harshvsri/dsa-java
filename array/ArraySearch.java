package com.harsh.array;

public class ArraySearch {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(pivotRBS(arr));
    }

    static void Linear(int[] arr, int target) {
        int found = 0;
        int index = 0;
        for (int i=0; i<arr.length; i++) {
            if(arr[i] == target) {
                found = 1;
                index = i;
                break;
            }
        }
        if (found == 1) {
            System.out.println(target+" found at index "+index);
        } else {
            System.out.println("Number not found :(");
        }
    }

    static boolean Search(String str, char target) {
        for (int i=0; i< str.length(); i++) {
            if(str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }

    static void NumofDigit(int number) {
        if (number<0) {
            number *= -1;
        }
        System.out.println((int)(Math.log10(number))+1);
    }

    static void BinarySearch(int[] arr, int target) {
        // To check for ascending or descending.
        // For order agnostic first and last should be considered.

        int start = 0;
        int end = arr.length-1;
        int index = 0;
        int counter = 1;
        int found = 0;

        while(start <= end) {
            int mid = (start + end) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                found = 1;
                index = mid;
                break;
            }
            counter++;


        }
        if (found == 1) {
            System.out.println("Index : "+index);
            System.out.println("Counter : "+counter);
        } else {
            System.out.println("Number Not Found");
        }

    }

    static int[] rowcolMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length-1;

        while (r < matrix.length && c >= 0) {
            if(matrix[r][c] == target) {
                return new int[]{r,c};
            } else if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1,-1};
    }

    static int mountainPeek(int[] array) {
        int s = 0;
        int e = array.length-1;

        while(s < e) {
            int m = s + (e - s)/2;
            if(array[m] > array[m+1]) {
                e = m;
            } else {
                s = m + 1;
            }

        }
        return s;
    }

    static int pivotRBS(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int mid = start + (end-start)/2;
            //Cases for pivot
            if(mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]) {
                return mid-1;
            }

            if(arr[mid] <= arr[start]) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }

        }
        return -1;
    }






}
