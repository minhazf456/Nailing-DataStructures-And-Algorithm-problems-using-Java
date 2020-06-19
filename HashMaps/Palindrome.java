/*Write an efficient function that checks whether any permutation (all permunation of tom is tom, tmo, omt, mto) of an input string is a palindrome.(is a string that is same when read forward and backward)*/

package HashMaps;

import java.util.HashSet;
import java.util.Set;

public class Palindrome {

    public static boolean hasPalindromePermutation ( String str) {

        // track the character we have seen an odd number of times

        Set<Character> unPairedCharacters = new HashSet<>();

        for (char c : str.toCharArray()){
            if (unPairedCharacters.contains(c)){
                unPairedCharacters.remove(c);
            }
            else {
                unPairedCharacters.add(c);
            }
        }
        return unPairedCharacters.size()<=1;

    }

    public static void main (String [] args){
        String str = "CIVIl";
        boolean check = hasPalindromePermutation(str);
        System.out.println(check);

    }
}
