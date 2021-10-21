package com.bridgelabz.AlgorithmProblms;

import java.util.*;

public class AnagramDetection {
    static void isAnagram(String str1, String str2) {

        boolean flag = true;

        if (str1.length() == str2.length()) {
            char[] ArrayS1 = str1.toLowerCase().toCharArray();
            char[] ArrayS2 = str2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            flag = Arrays.equals(ArrayS1, ArrayS2);
        } else
            flag = false;
        if (flag) {
            System.out.println(str1 + " and " + str2 + " are anagrams");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams");
        }
    }

    public static void main(String[] args) {
        isAnagram("heart", "earth");
    }
}
