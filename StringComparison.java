import java.util.*;
public class StringComparison {
    /*********** ALgorithm 1******************
     *//* function to check whether two strings are
        anagram of each other *//*
    static boolean areAnagram(char[] str1, char[] str2)
    {
        // Get lenghts of both strings
        int n1 = str1.length;
        int n2 = str2.length;

        // If length of both strings is not same,
        // then they cannot be anagram
        if (n1 != n2)
            return false;

        // Sort both strings
        Arrays.sort(str1);
        Arrays.sort(str2);
        System.out.println(str1);

        // Compare sorted strings
        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;

        return true;
    }

    *//* Driver program to test to print printDups*//*
    public static void main(String args[])
    {
        char str1[] = { 't', 'e', 's', 't' };
        char str2[] = { 't', 't', 'e', 'w' };
        if (areAnagram(str1, str2))
            System.out.println("The two strings are"
                    + " anagram of each other");
        else
            System.out.println("The two strings are not"
                    + " anagram of each other");
    }
}*/

    /*Time Complexity of this problems is O(nlog(n))*/
/****************Algorithm 2**************/
    /*To save a little memory, let's build only one histogram. We'll increment the counts for each character in the first string,
    and decrement the count for each character in the second. If the two strings are anagrams,
    then the result will be that everything balances to 0.*/

/*The histogram needs a fixed-size table of counts with a size defined by the character set size.
   For example, if we only use one byte to store each character,
   then we can use a counting array size of 256 to count the occurrence of each character:*/

/* Now Check by counting*/
    private static int CHARACTER_RANGE = 256;

    public static boolean areAnagram(String string1, String string2) {

        if (string1.length() != string2.length()){
            return false;
        }
        /*creating an count array*/

        int[] count = new int[CHARACTER_RANGE];
        for (int i = 0; i < string1.length(); i++) {
            count[string1.charAt(i)]++;
            count[string2.charAt(i)]--;
        }
        for (int i = 0; i < CHARACTER_RANGE; i++) {
            if (count[i] != -0) {
                return false;
            }
        }
        return true;
    }
    public static void main (String [] args){
//        char [] str1 = "geeksforgeeks".toCharArray();
//        char [] str2 = "forgeeksgeeks".toCharArray();
        System.out.println(areAnagram("geeksforgeeks", "forgeeksgeeks"));
    }
}

/*Time complexity 0(n) space 0(n)*/

