package mdminhaz.HashMaps.com;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*Naive Approach*/
public class FindPairWIthGIvenSum {
//    public static void findPair (int [] A, int sum) {
//        /*consider each element except last one*/
//
//        for (int i = 0; i < A.length - 1; i++) {
//            //Start from the ith element
//            for (int j = i + 1; j < A.length; j++) {
//                /*if desired sum is found print it and return it*/
//                if (A[i] + A[j] == sum) {
//                    System.out.println("pair found at index " + i + " and " + j);
//                    return;
//                }
//            }
//        }
//        // No pair with given sum exists in the array
//        System.out.println("Pair not found");
//    }
//        public static void main (String[] args)
//        {
//            int[] A = { 8, 7, 2, 5, 3, 1 };
//            int sum = 10;
//
//            findPair(A, sum);
//        }
//    }
//
//    /...Time TC == O(n^2) and space complexity O(n)..*/


    /* Second Approach Using sorting*/

//    // Naive method to find a pair in an array with given sum
//    public static void findPair(int[] A, int sum)
//    {
//        // sort the array in ascending order
//        Arrays.sort(A);
//
//        // maintain two indices pointing to end-points of the array
//        int low = 0;
//        int high = A.length - 1;
//
//        // reduce search space arr[low..high] at each iteration of the loop
//
//        // loop till low is less than high
//        while (low < high)
//        {
//            // sum found
//            if (A[low] + A[high] == sum)
//            {
//                System.out.println("Pair found");
//                return;
//            }
//
//            // increment low index if total is less than the desired sum
//            // decrement high index is total is more than the sum
//            if (A[low] + A[high] < sum) {
//                low++;
//            } else{
//                high--;
//            }
//        }
//
//        // No pair with given sum exists in the array
//        System.out.println("Pair not found");
//    }
//
//    // Find pair with given sum in the array
//    public static void main (String[] args)
//    {
//        int[] A = { 8, 7, 2, 5, 3, 1 };
//        int sum = 10;
//
//        findPair(A, sum);
//    }
//}
/* Time complexity O(nlog(n) and space complexity is O(1)*/


    // Naive method to find a pair in an array with given sum
    public static void findPair(int[] A, int sum)
    {
        // create an empty Hash Map
        Map<Integer, Integer> map = new HashMap<>();

        // do for each element
        for (int i = 0; i < A.length; i++)
        {
            // check if pair (A[i], sum-A[i]) exists

            // if difference is seen before, print the pair
            if (map.containsKey(sum - A[i]))
            {
                System.out.println("Pair found at index " +
                        map.get(sum - A[i]) + " and " + i);
                return;
            }

            // store index of current element in the map
            map.put(A[i], i);
        }

        // No pair with given sum exists in the array
        System.out.println("Pair not found");
    }

    // Find pair with given sum in the array
    public static void main (String[] args)
    {
        int[] A = { 8, 7, 2, 5, 3, 1 };
        int sum = 10;

        findPair(A, sum);
    }
}

