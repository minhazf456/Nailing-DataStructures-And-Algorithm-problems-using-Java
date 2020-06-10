
import java.awt.*;
        import java.lang.reflect.Array;
        import java.util.concurrent.Future;
        import java.util.Scanner;
        import java.util.Arrays;

public class CountVowels {

    public static void findNumberOfVowelsAndConsonants(String input) {
        int vowelsCount = 0;
        int consonantCount = 0;
        String vowels = "aeiouy";
        String normalized = (input.toLowerCase()).trim();
        char[] inputCharArray = normalized.toCharArray();

        for (char c : inputCharArray) {
            if (vowels.indexOf(c) != -1) {
                vowelsCount++;
            } else if (c != ' ') {
                consonantCount++;
            }
        }

        System.out.println("There are " + vowelsCount + " vowels in " + input);
        System.out.println("There are " + consonantCount + " consonants in " + input);
        System.out.println();
    }

//    public static void findNumberOfVowelsAndConsonantsWithAscii(String input) {
//        int vowelsCount = 0;
//        int consonantCount = 0;
//        String vowels = "aeiouyAEIOUY";
//        for (int i = 0; i < input.length(); i++) {
//            int asciiValue = (int) input.charAt(i);
//            // check if character is a letter
//            if ((asciiValue <= 90 && asciiValue >= 65) || asciiValue <= 122 && asciiValue >= 97) {
//                if (vowels.contains(Character.toString(input.charAt(i)))) {
//                    vowelsCount++;
//                } else {
//                    consonantCount++;
//                }
//            }
//        }
//
//        System.out.println("There are " + vowelsCount + " vowels in " + input);
//        System.out.println("There are " + consonantCount + " consonants in " + input);
//        System.out.println();
//    }

    public static void main(String[] args) {
        String s1 = "HellO";
        String s2 = " there is a quiet Mouse";
        String s3 = "I am happy  ";

        System.out.println("ALGO 1 -----------------");
        findNumberOfVowelsAndConsonants(s1);
        findNumberOfVowelsAndConsonants(s2);
        findNumberOfVowelsAndConsonants(s3);

//        System.out.println("ALGO 2 -----------------");
//        findNumberOfVowelsAndConsonantsWithAscii(s1);
//        findNumberOfVowelsAndConsonantsWithAscii(s2);
//        findNumberOfVowelsAndConsonantsWithAscii(s3);

    }

}
