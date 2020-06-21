package mdminhaz.HashMaps.com;

import java.util.HashSet;
import java.util.Set;

public class InflightEntertainMent {

    public static boolean canTwoMovieFillFlight (int [] movieLengths, int flighLength) {
        // lets create hashset first
        Set<Integer> movieLenghtsSeen = new HashSet<>();

        for (int firstMovieLength : movieLengths) {
            int matchingSecondMovieLenght = flighLength - firstMovieLength;
            if (movieLenghtsSeen.contains(matchingSecondMovieLenght)) {
                return true;
            } else {
                movieLenghtsSeen.add(firstMovieLength);
            }

        }
        return false;

    }



    public static void main (String[] args){
      int [] movieLengths = {1,4,5,7};
      canTwoMovieFillFlight(movieLengths, 6);
      final boolean flightLengthswhat = canTwoMovieFillFlight(movieLengths, 6);
        System.out.println(flightLengthswhat);

    }
}
