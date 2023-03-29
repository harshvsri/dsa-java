package com.harsh.leetcode;

public class LeetCode {
    public static void main(String[] args) {
        String s = new String("anagram");
        String t = new String("nagaram");
        System.out.println(isAnagram(s,t));

    }

    static boolean isAnagram(String s, String t) {
        int[] a = new int[26];
        for (char c : s.toCharArray()) {
            a[c - 'a']++;
        }
        for (char c : t.toCharArray()) {

            a[c - 'a']--;
        }
        for (int n : a) {
            if (n != 0) return false;
        }
        return true;
    }
}
