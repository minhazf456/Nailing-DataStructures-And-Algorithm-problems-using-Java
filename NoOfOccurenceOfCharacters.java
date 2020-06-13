import java.util.*;
import java.util.HashMap;
/*
class NoOfOccurenceOfCharacters {
    static final int MAX_CHAR = 256;

    static void getOccuringChar(String str)
    {
        // Create an array of size 256 i.e. ASCII_SIZE 
        int [] count = new int[MAX_CHAR];
        int len = str.length();
        // Initialize count array index 
        for (int i = 0; i < len; i++) {
            count[str.charAt(i)]++;
        }
        */
/*accessing the char elements in the count array*//*

        System.out.println(count[0]);
        System.out.println(count[1]);
        System.out.println(count[97]);

        // Create an array of given String size 
        char [] ch = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {

                // If any matches found 
                if (str.charAt(i) == ch[j])
                    find++;
            }

            if (find == 1)
                System.out.println("Number of Occurrence of " +
                        str.charAt(i) + " is:" + count[str.charAt(i)]);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = "Australia";
        getOccuringChar(str);
    }
} */



/*optimized version using hashmap*/

class NoOfOccurenceOfCharacters {
    public static void getOccuringChar(String inPutString) {
        /*//Creating a HashMap containing char as a key and occurrences as a value*/
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        /* converting given string to char Array*/
        char[] strArray = inPutString.toCharArray();
        /*Checking each char in strArray*/
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                //If char 'c' is present in charCountMap, incrementing it's count by 1
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                /*If char 'c' is not present in charCountMap,putting 'c' into charCountMap with 1 as it's value
                 */
                charCountMap.put(c, 1);
            }
        }
        /*Printing input String*/
        System.out.println("The frequency of Character is " + charCountMap);
    }

    public static void main(String[] args) {
        getOccuringChar("Java J2EE Java JSP J2EE");
        getOccuringChar("All Is Well");
        getOccuringChar("Done And Gone");
    }
}