import java.util.Arrays;
import java.util.jar.JarOutputStream;
/* Write a method that takes an array of characters and reverses the letters in place. ↴*/

public class ReverseCharacters {
    public static void reverse(char[] arrayOfChars) {

        int leftIndex = 0;
        int rightIndex = arrayOfChars.length - 1;

        while (leftIndex < rightIndex) {
            // swap characters
            char temp = arrayOfChars[leftIndex];
            arrayOfChars[leftIndex] = arrayOfChars[rightIndex];
            arrayOfChars[rightIndex] = temp;
            // move towards middle
            leftIndex++;
            rightIndex--;
        }
        System.out.println(arrayOfChars);
    }
    public static void main(String[] args) {
        char[] arrayOfChars = "DEFGH".toCharArray();
        System.out.println(arrayOfChars);
        reverse(arrayOfChars);
    }
}

/*Reverse a string*/

//public class ReverseCharacters {
//
//    public static void main (String [] args){
//        String str = "minhaz";
//        String b = " ";
//        int l = str.length();
//        for ( int i = l -1 ; i >= 0 ; i --) {
//           b = b + str.charAt(i);
//       }
//        System.out.println(b);
//
//    }
//
//}



