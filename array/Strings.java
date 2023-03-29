package com.harsh.array;

import java.util.ArrayList;

public class Strings {
    public static void main(String[] args) {
//        #STRINGBUILDER SYNTAX
//        StringBuilder address = new StringBuilder();
        System.out.println(subSeqRet("" , "abc"));


    }

    static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        str = str.toLowerCase();
        int start = 0;
        int end = str.length()-1;
        while(start <= end) {
            if(str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }

    static void removeChar(String str1, String str2) {
        if(str2.isEmpty()) {
            System.out.println(str1);
            return;
        }

        char ch = str2.charAt(0);
        if(ch == 'a') {
            removeChar(str1,str2.substring(1));
        } else {
            removeChar(str1 + ch, str2.substring(1));
        }

    }

    static String removeChar(String str) {
        if(str.isEmpty()) {
            return "";
        }

        char ch = str.charAt(0);

        if(ch == 'a') {
            return removeChar(str.substring(1));
        } else {
            return removeChar(str.substring(1));
        }

    }

    static String removeHarsh(String str) {
        if(str.isEmpty()) {
            return "";
        }

        if(str.startsWith("harsh")) {
            return removeHarsh(str.substring(5));
        } else {
            return str.charAt(0) + removeHarsh(str.substring(1));
        }

    }

    static void subSeq(String pro, String unpro) {
        if(unpro.isEmpty()) {
            System.out.print(pro+" ");
            return;
        }
        char ch = unpro.charAt(0);
        subSeq(pro+ch, unpro.substring(1));
        subSeq(pro, unpro.substring(1));

    }

    static ArrayList<String> subSeqRet(String pro, String unpro) {
        if(unpro.isEmpty()) {
            ArrayList<String> list = new ArrayList<String>();
            list.add(pro);
            return list;
        }
        char ch = unpro.charAt(0);
        ArrayList<String> left = subSeqRet(pro+ch, unpro.substring(1));
        ArrayList<String> right = subSeqRet(pro, unpro.substring(1));

        left.addAll(right);
        return left;


    }

}
