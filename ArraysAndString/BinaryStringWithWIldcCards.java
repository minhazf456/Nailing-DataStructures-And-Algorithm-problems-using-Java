package ArraysAndString;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.*;
import java.lang.*;
import java.io.*;

public class BinaryStringWithWIldcCards {

    // Recursive function to generate all binary
    // strings formed by replacing each wildcard
    // character by 0 or 1
    public static void print(char str[], int index)
    {
        if (index == str.length)
        {
            System.out.println(str);
          return;
        }

        if (str[index] == '?')
        {
            // replace '?' by '0' and recurse
            str[index] = '0';
            print(str, index + 1);

            // replace '?' by '1' and recurse
            str[index] = '1';
            print(str, index + 1);
//
//            // NOTE: Need to backtrack as string
//            // is passed by reference to the
//            // function
//            str[index] = '?';
        }
        else

            print(str, index + 1);
//        System.out.println("after 2nd lop " + Arrays.toString(str));
    }

    // driver code
    public static void main (String[] args)
    {
        String input = "?0?";
        char[] str = input.toCharArray();
        print(str, 0);
    }
}