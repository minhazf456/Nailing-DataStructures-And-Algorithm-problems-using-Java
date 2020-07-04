package ArraysAndString;

import java.util.Arrays;
import java.util.*;
public class MergeOrders {
    public static int[] mergeArrays(int[] myArray, int[] minhazArray) {
        // allocating mergeArray size
        int[] mergedArray = new int[myArray.length + minhazArray.length];

        int currentIndexMine = 0;
        int currrentIndexMinhaz = 0;
        int currentIndexMerged = 0;

        while (currentIndexMerged < mergedArray.length) {
            /*Edge case*/
            boolean isMyArrayExhausted = currentIndexMine >= myArray.length;
            boolean isMinhazArrayExhausted = currrentIndexMinhaz >= minhazArray.length;


            if(!isMyArrayExhausted && (isMinhazArrayExhausted || (myArray[currentIndexMine] < minhazArray[currrentIndexMinhaz]))) {
                mergedArray[currentIndexMerged] = myArray[currentIndexMine];
                currentIndexMine++;
            } else {
                mergedArray[currentIndexMerged] = minhazArray[currrentIndexMinhaz];
                currrentIndexMinhaz++;
            }
            currentIndexMerged++;

        }
        System.out.println(" final merged Arrays "+ Arrays.toString(mergedArray));
        return mergedArray;


    }

    public static void main (String [] args) {
        int[] myArray = {1, 3, 7, 10};
        int[] minhazArray = {10, 14, 18, 19};
        System.out.println(mergeArrays(myArray, minhazArray));



    }

}


