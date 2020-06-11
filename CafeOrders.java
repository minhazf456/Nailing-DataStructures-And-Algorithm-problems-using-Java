
/*Given all three arrays, write a method to check that my service is first-come, first-served. All food should come out in the same order customers requested it.*/
/*Recursive Solutions*/

import java.util.Arrays;
public class CafeOrders {

    public static int[] removeFirstOrder(int[] orders) {
        return Arrays.copyOfRange(orders,1, orders.length);
    }

    public static boolean isFirstComeFirstServed(int[] takeOutOrers, int[] dineInOrders, int[] serveredOrders) {
        /*let's create base case*/
        if (serveredOrders.length == 0) {
            return true;
        }
        /*now if the first orders from the take out orders are same*/
        /*as the first order in the served orders*/
        /*we will throw out first order from each orders*/

        if (takeOutOrers.length > 0 && takeOutOrers[0] == serveredOrders[0]) {
            return isFirstComeFirstServed(removeFirstOrder(takeOutOrers), dineInOrders, removeFirstOrder(serveredOrders));

        } else if (dineInOrders.length > 0 && dineInOrders[0] == serveredOrders[0]) {
            // take the first order off dineInOrders and servedOrders and recurse
            return isFirstComeFirstServed(takeOutOrers, removeFirstOrder(dineInOrders), removeFirstOrder(serveredOrders));

            // first order in servedOrders doesn't match the first in
            // takeOutOrders or dineInOrders, so we know it's not first-come, first-served
        } else {
            return false;
        }
    }

    public static void main (String [] args){
        int [] A = {1, 4, 5};
        int [] B = {2, 3, 6};
        int [] S = {1, 2, 3, 4, 5, 6};
        isFirstComeFirstServed(A, B, S);
        System.out.println(isFirstComeFirstServed(A, B, S));
    }
}
/* Time complexity o(n2) and Space o(n2)*/

/*Let's start with iterative solutions
* */


