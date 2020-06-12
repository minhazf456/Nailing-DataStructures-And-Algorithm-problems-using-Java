//
//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//// Java program to find minimum number of
//// characters to be removed to make two
//// strings anagram.
//import java.util.*;
//
//class RemoveCharactersFromAnagram {
//
//    // function to calculate minimum numbers
//    // of characters to be removed to make
//    // two strings anagram
//    static int remAnagram(String str1, String str2)
//    {
//        // make hash array for both string
//        // and calculate frequency of each
//        // character
//        int count1[] = new int[26];
//        int count2[] = new int[26];
//
//
//        // count frequency of each character
//        // in first string
//        for (int i = 0; i < str1.length() ; i++)
//            count1[str1.charAt(i) -'a']++;
//        System.out.println(str1.charAt(0) - 'a');
//        System.out.println(str1.charAt(1) - 'a');
//        System.out.println(str1.charAt(3) - 'a');
//        System.out.println(str1.charAt(4) - 'a');
////        System.out.println(Arrays.toString(count1));
//
//
//        // count frequency of each character
//        // in second string
//        for (int i = 0; i < str2.length() ; i++)
//            count2[str2.charAt(i) -'a']++;
//        System.out.println(str2.charAt(0) - 'a');
//        System.out.println(str2.charAt(1) - 'a');
//        System.out.println(str2.charAt(2) - 'a');
//
//
//        // traverse count arrays to find
//        // number of characters to be removed
//        int result = 0;
//        for (int i = 0; i < 26; i++)
//            result += Math.abs(count1[i] -
//                    count2[i]);
//        System.out.println(Arrays.toString(count1));
//        System.out.println(Arrays.toString(count2));
//
//        System.out.println(Math.abs(count1[0] -
//                count2[0]));
//        System.out.println("#####" + result);
//        return result;
//    }
//
//    // Driver program to run the case
//    public static void main(String[] args)
//    {
//        String str1 = "hello", str2 = "billion";
//        System.out.println("final removing number " + remAnagram(str1, str2));
//    }
//}


/* Given two string , how many characters do we need to remove from strings to make them anagram*/

import java.util.Arrays;

class RemoveCharactersFromAnagram {
    public static int NUMBER_LETTERS = 26;

    //getDelta method to return total removing numbers

    public static int getDelta (int [] array1, int [] array2){
    if (array1.length != array2.length){
        return -1; /*todo:better error handeling*/
    }
    int delta = 0;
    for (int i =0; i <array1.length; i++){
        int difference = Math.abs(array1[i] - array2[i]);
        delta += difference;
    }
    return delta;
    }

    // total charCounts for each string

    public static int [] getCharCounts(String s){
        int [] charCounts = new int [NUMBER_LETTERS];
        for (int i =0; i< s.length(); i++){
            char c = s.charAt(i);
            int offset = (int) 'a'; /*take character a and convert them to ASCII code*/
            int code = c -offset;
            charCounts[code]++;
            System.out.println(Arrays.toString(charCounts));/* printing all charCounts*/
        }
        return charCounts;
    }
    // final method to return the needed number

    public static int removingNumberNeededToMakeAnagram(String first, String second){
        // lets find the frequency of the characters
        int [] charCount1 = getCharCounts(first);
        int [] charCount2 = getCharCounts(second);
        System.out.println(Arrays.toString(charCount1));
        System.out.println(Arrays.toString(charCount2));
        return getDelta(charCount1, charCount2);

    }
        // Driver program to run the case
    public static void main(String[] args)
    {
        String first = "hello", second = "billion";
        System.out.println("final removing number " + removingNumberNeededToMakeAnagram(first, second));
    }
}
