import java.util.Arrays;

public class ProductOfALlNumbers {

    public static int[] getProductsOfAllIntsExceptAtIndex(int[] intArray) {

        if (intArray.length < 2) {
            throw new IllegalArgumentException("Getting the product of numbers at other indices requires at least 2 numbers");
        }

        // we make an array with the length of the input array to
        // hold our products
        int[] productsOfAllIntsExceptAtIndex = new int[intArray.length];

        // for each integer, we find the product of all the integers
        // before it, storing the total product so far each time
        int productSoFar = 1;
        for (int i = 0; i < intArray.length; i++) {
            productsOfAllIntsExceptAtIndex[i] = productSoFar;
            productSoFar *= intArray[i];

        }


        // for each integer, we find the product of all the integers
        // after it. since each index in products already has the
        // product of all the integers before it, now we're storing
        // the total product of all other integers
        productSoFar = 1;
        for (int i = intArray.length - 1; i >= 0; i--) {
            productsOfAllIntsExceptAtIndex[i] *= productSoFar;
            productSoFar *= intArray[i];
        }

//        System.out.println(Arrays.toString(productsOfAllIntsExceptAtIndex));
        return productsOfAllIntsExceptAtIndex;
    }
    public static void main (String [] args){
        int [] intArray = {1,3,5,2};
        System.out.println("Our input is " + Arrays.toString(intArray));
        getProductsOfAllIntsExceptAtIndex(intArray);
        System.out.println("SO the outPut before each index is " + Arrays.toString(getProductsOfAllIntsExceptAtIndex(intArray)));

    }
}
