package ArraysAndString;

import java.util.HashMap;

public class HashMaps {

    public static void main(String[] args) {
        HashMap<String, Integer> wordToNum = new HashMap();

        // Insert key-and-value pairs into the Hashmap
        wordToNum.put("ONE", 1);
        wordToNum.put("TWO", 2);
        wordToNum.put("THREE", 3);
        wordToNum.put("FOUR", 4);
        wordToNum.put("FIVE", 5);

        System.out.println(wordToNum.get("THREE"));

        System.out.println(wordToNum.values());
        System.out.println(wordToNum.keySet());

        System.out.println(wordToNum.remove("FOUR"));
        System.out.println(wordToNum.values());
        System.out.println(wordToNum.keySet());









        // Common Use of ArraysAndString.HashMaps: Which character is the most repeated?
        String s = "phonebook";
        HashMap<Character, Integer> hashMap = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            Character currentChar = s.charAt(i);
            if (hashMap.containsKey(currentChar)) {
                // incrememt current value for this key in hashmap by 1
                hashMap.put(currentChar, hashMap.get(currentChar) + 1);
            } else {
                // If we haven't added it to the hashmap, then put it in with the value 1
                hashMap.put(currentChar, 1);
            }
        }

        Character mostRepeated = ' ';
        int max = 0;
        for (Character key : hashMap.keySet()) {
            int currentValue = hashMap.get(key);
            if (currentValue > max) {
                mostRepeated = key;
                max = currentValue;
            }
        }

        System.out.println("Most Repeated: " + mostRepeated + " | Times: " + max);

    }
}