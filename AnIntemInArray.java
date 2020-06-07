import java.util.Arrays;

public class AnIntemInArray {

    public static boolean isItemInArray(String item, String[] items) {
        for (String i : items) {
            if (i.toLowerCase().equals(item)) {
                return true;
            }
        }
        return false;
    }

    public static void main (String [] args) {
        // declare an array
         int [] nums;
         // declare and allocate an array
         double [] otherNums = new double[5];

         // declare, allocating and initiating
        String [] availablePets = {"cat", "dog", "fish"};
        String [] unavilablePets = {"bird", "rabbit", "hamster", "gerbil"};

        System.out.println(Arrays.toString(availablePets));
        System.out.println(Arrays.toString(unavilablePets));

        int indexOfAvailablePet = 2; // index of fish
        int indexOfUnavailablePet = 0; // index of bird

        String availablePet = availablePets[indexOfAvailablePet]; // Fish
        String unavailablePet = unavilablePets[indexOfUnavailablePet]; // Bird

        availablePets[indexOfAvailablePet] = unavailablePet;
        unavilablePets[indexOfUnavailablePet] = availablePet;
        System.out.println();
        System.out.println(Arrays.toString(availablePets));
        System.out.println(Arrays.toString(unavilablePets));

    }
}
