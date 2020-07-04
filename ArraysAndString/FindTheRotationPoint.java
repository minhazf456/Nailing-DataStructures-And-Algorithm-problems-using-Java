package ArraysAndString;

import java.util.Arrays;

public class FindTheRotationPoint {

    public static int findRotationPoint (String [] words){

        final String firstWord = words[0];
        int floorIndex = 0;
        int ceilingIndex = words.length - 1;

        while (floorIndex < ceilingIndex) {
            // guess a point halfway between floor and ceiling
            int guessIndex = floorIndex + ((ceilingIndex - floorIndex) / 2);
            System.out.println("guesIndex " + guessIndex);
            // if guess comes after first word or is the first word
            if (words[guessIndex].compareTo(firstWord) >= 0) {  //   words = ['k', 'v', 'a', 'b', 'c', 'd', 'e', 'g', 'i'];//
                // go right
                floorIndex = guessIndex;
            } else {
                // go left
                ceilingIndex = guessIndex;
            }
            // if floor and ceiling have converged
            if (floorIndex + 1 == ceilingIndex) {
                // between floor and ceiling is where we flipped to the beginning
                // so ceiling is alphabetically first
                break;
            }
        }
        return ceilingIndex;
    }

    public static void main (String [] args){
      String [] words = {"ptolemaic", "retrograde", "xenoepist",
              "asymptote", "babka", "banoffee", "engender"};
        System.out.println(findRotationPoint(words));
    }

}
