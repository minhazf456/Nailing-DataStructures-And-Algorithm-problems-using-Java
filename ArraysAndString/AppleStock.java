package ArraysAndString;

import java.util.*;

/*Brute force algorithms*/
public class AppleStock {
//    public static int getMaxProfit(int[] stockPrices) {
//
//        int maxProfit = 0;
//
//        // go through every time
//        for (int outerTime = 0; outerTime < stockPrices.length; outerTime++) {
//
//            // for every time, go through every other time
//            for (int innerTime = 0; innerTime < stockPrices.length; innerTime++) {
//
//                // for each pair, find the earlier and later times
//                int earlierTime = Math.min(outerTime, innerTime);
////                System.out.println(earlierTime);
//                int laterTime = Math.max(outerTime, innerTime);
//
//                // and use those to find the earlier and later prices
//                int earlierPrice = stockPrices[earlierTime];
//                int laterPrice = stockPrices[laterTime];
//
//                // see what our profit would be if we bought at the
//                // min price and sold at the current price
//                int potentialProfit = laterPrice - earlierPrice;
//
//                // update maxProfit if we can do better
//                maxProfit = Math.max(maxProfit, potentialProfit);
////                System.out.println(maxProfit);
//            }
//        }
//        return maxProfit;
//    }
//
//    public static void main(String[] args) {
//        int[] stockPrices = {7, 2, 8, 9};
//        getMaxProfit(stockPrices);
//        System.out.println("Maxprofit is " + getMaxProfit(stockPrices));
//    }
//}


    /* A better approach to beat O(n2)*/

//public static int getMaxProfit(int [] stockPrices){
//    int minPrice = 0;
//    int maxProfit = 0;
//
//    for (int currentPrice : stockPrices){
//
//         minPrice = Math.min(minPrice, currentPrice);
//         int potentialProfit = (currentPrice - minPrice);
//         maxProfit = Math.max(maxProfit, potentialProfit);
//
//    }
//    return maxProfit;
//}
//    public static void main(String[] args) {
//        int[] stockPrices = {7, 2, 8, 9};
//        getMaxProfit(stockPrices);
//        System.out.println("Maxprofit is " + getMaxProfit(stockPrices));
//    }
//}

    /*Time complexity Is O(n) and space is constant time*/

    /* Implemented Edge cases*/

    public static int getMaxProfit(int[] stockPrices) {

        if (stockPrices.length < 2) {
            throw new IllegalArgumentException("Getting a profit requires at least 2 prices");
        }

        // we'll greedily update minPrice and maxProfit, so we initialize
        // them to the first price and the first possible profit
        int minPrice = stockPrices[0];
        int maxProfit = stockPrices[1] - stockPrices[0];

        // start at the second (index 1) time
        // we can't sell at the first time, since we must buy first,
        // and we can't buy and sell at the same time!
        // if we started at index 0, we'd try to buy *and* sell at time 0.
        // this would give a profit of 0, which is a problem if our
        // maxProfit is supposed to be *negative*--we'd return 0.
        for (int i = 1; i < stockPrices.length; i++) {
            int currentPrice = stockPrices[i];

            // see what our profit would be if we bought at the
            // min price and sold at the current price
            int potentialProfit = currentPrice - minPrice;

            // update maxProfit if we can do better
            maxProfit = Math.max(maxProfit, potentialProfit);

            // update minPrice so it's always
            // the lowest price we've seen so far
            minPrice = Math.min(minPrice, currentPrice);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] stockPrices = {7, 2, 8, 9};
        getMaxProfit(stockPrices);
        System.out.println("Maxprofit is " + getMaxProfit(stockPrices));
    }
}

