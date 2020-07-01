

import java.util.*;
import java.lang.*;
import java.io.*;

    public class RotationCountInCirculatedArray {

//        public static int countRotations ( int [] arr, int n){
//            // lets find the index of the minimum element which is equal to the
////            number of rotations. first find the minimum element returns its index
//
//            int min = arr[0];
//            int min_index =0;
//
//            for (int i =0; i< n ; i++){
//                if (min > arr[i]){
//                    min = arr[i];
//                    min_index = i;
//                }
//            }
//            return  min_index;
//
//
//
//        }
//        // Driver program to test above functions
//        public static void main (String[] args)
//        {
//            int arr[] = {2,5,6,8,9,10};
//            int n = arr.length;
//
//            System.out.println(countRotations(arr, n));
//        }
//    }

    /* Approach 2 - binary search*/



    // Returns count of rotations for an array
    // which is first sorted in ascending order,
    // then rotated
    static int countRotations(int arr[], int low,
                              int high)
    {
        // This condition is needed to handle
        // the case when array is not rotated
        // at all
        if (high < low)
            return 0;

        // If there is only one element left
        if (high == low)
            return low;

        // Find mid
        // /*(low + high)/2;*/
        int mid = low + (high - low)/2;

        // Check if element (mid+1) is minimum
        // element. Consider the cases like
        // {3, 4, 5, 1, 2}
        if (mid < high && arr[mid+1] < arr[mid])
            return (mid + 1);

        // Check if mid itself is minimum element
        if (mid > low && arr[mid] < arr[mid - 1])
            return mid;

        // Decide whether we need to go to left
        // half or right half
        if (arr[high] > arr[mid])
            return countRotations(arr, low, mid - 1);

        return countRotations(arr, mid + 1, high);
    }

    // Driver program to test above functions
    public static void main (String[] args)
    {
        int arr[] = {15, 18, 2, 3, 6, 12};
        int n = arr.length;

        System.out.println(countRotations(arr, 0, n-1));
    }
}