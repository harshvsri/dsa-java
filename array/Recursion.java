package com.harsh.array;

import java.util.ArrayList;
import java.util.List;

public class Recursion {


    public static void main(String[] args) {
        permutations("", "cat");
    }

    static void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNumbers(n - 1);
        System.out.print(n + " ");
    }

    static int nSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + nSum(n - 1);
    }

    static int fact(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    static int fab(int n) {
        if (n < 2) {
            return n;
        }
        return fab(n - 1) + fab(n - 2);
    }

    static int binSearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] < target) {
            return binSearch(arr, target, mid + 1, end);
        } else {
            return binSearch(arr, target, start, mid - 1);
        }
    }

    static int digitSum(int n) {
        if (n == 0) {
            return 0;
        }
        return digitSum(n / 10) + (n % 10);
    }

    static int digitProd(int n) {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) * digitProd(n / 10);
    }

    static int numRev(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) * (int) (Math.pow(10, (int) (Math.log10(n)))) + numRev(n / 10);
    }

    static boolean palindrome(int n) {
        return n == numRev(n);
    }

    static int counter = 0;

    static int counter(int n) {
        if (n == 0) {
            return counter;
        }
        if (n % 10 == 0) {
            counter++;
        }
        return counter(n / 10);
    }

    static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
//        if(arr[index] < arr[index+1]) {
//            return isSorted(arr, index+1);
//        }
//        return false;

        return arr[index] < arr[index + 1] && isSorted(arr, index + 1);
    }

    static int search(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return search(arr, target, index + 1, list);
    }

    static ArrayList<Integer> searchNum(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return searchNum(arr, target, index + 1, list);

    }

    static void pattern1(int n) {
        if(n==0) {
            return;
        }
        for (int i=1; i<= n; i++) {
            System.out.print("*"+" ");
        }
        System.out.println();
        pattern1(n-1);
    }

    static void pattern2(int row, int col) {
        if(row == 0) {
            return;
        }
        if(row >= col) {
            System.out.print("*"+" ");
            pattern2(row, col+1);
        } else {
            System.out.println();
            pattern2(row-1, 1);
        }
    }

    static int[] sort(int[] arr, int length) {
        if(length == 1) {
            return arr;
        }

        int max = 0;
        for(int i=0; i<length; i++) {
            if(arr[i] > arr[max]) {
                max = i;
            }
            //swap i and last.
            int temp = arr[length-1];
            arr[length-1] = arr[max];
            arr[max] = temp;
        }
        return sort(arr, length-1);
    }

    static List<List<Integer>> subSet(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num : arr) {
            int n = outer.size();
            for(int i=0; i<n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }

    static List<List<Integer>> subSetDuplicate(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;

        for(int i=0; i<arr.length; i++) {
            start = 0;
            if(i>0 && arr[i] == arr[i-1]) {
                start = end + 1;
            }
            end = outer.size()-1;
            int n = outer.size();
            for(int j=start; j<n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }

        return outer;
    }

    static void permutations(String pro, String unpro) {
        if(unpro.isEmpty()) {
            System.out.println(pro);
            return;
        }
        char ch = unpro.charAt(0);

        for(int i=0; i<=pro.length(); i++) {
            String first = pro.substring(0,i);
            String second = pro.substring(i,pro.length());
            permutations(first+ch+second,unpro.substring(1));
        }
    }

    static int permutationsCount(String pro, String unpro) {
        if(unpro.isEmpty()) {
            return 1;
        }
        char ch = unpro.charAt(0);
        int counter = 0;
        for(int i=0; i<=pro.length(); i++) {
            String first = pro.substring(0,i);
            String second = pro.substring(i,pro.length());
            counter += permutationsCount(first+ch+second,unpro.substring(1));
        }
        return counter;
    }

    static void password(String pro, String unpro) {
        if(unpro.isEmpty()) {
            System.out.println(pro);
            return;
        }

        int digit = unpro.charAt(0) - '0';

        for(int i=3*(digit-1); i<3*digit; i++) {
            char ch = (char)('a'+i);
            password(pro+ch, unpro.substring(1));
        }

    }

    static List<String> passwordList(String pro, String unpro) {
        if(unpro.isEmpty()) {
            //Temporary list.
            List<String> templist = new ArrayList<>();
            templist.add(pro);
            return templist;
        }

        int digit = unpro.charAt(0) - '0';
        //Main list that is to be returned.
        List<String> list = new ArrayList<>();

        for(int i=3*(digit-1); i<3*digit; i++) {
            char ch = (char)('a'+i);
             list.addAll(passwordList(pro+ch, unpro.substring(1)));
        }
        return list;

    }

    static void dice(String pro, int target) {
        if(target == 0) {
            System.out.println(pro);
            return;
        }

        for(int i=1; i<=6 && i<=target; i++) {
            dice(pro+i, target-i);
        }
    }

    static List<String> diceList(String pro, int target) {
        if(target == 0) {
            List<String> templist = new ArrayList<>();
            templist.add(pro);
            return templist;
        }
        List<String> list = new ArrayList<>();
        for(int i=1; i<=6 && i<=target; i++) {
            list.addAll(diceList(pro+i, target-i));
        }
        return list;
    }





}

