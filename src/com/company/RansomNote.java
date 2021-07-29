package com.company;
import java.util.HashMap;
import java.util.List;

public class RansomNote {
        /*
         * Complete the 'checkMagazine' function below.
         *
         * The function accepts following parameters:
         *  1. STRING_ARRAY magazine
         *  2. STRING_ARRAY note
         */

        public static void checkMagazine(List<String> magazine, List<String> note) {
            // Write your code here
            HashMap<String, Integer> wordFreq = new HashMap<>();
            for (String word : magazine) {
                if (!wordFreq.containsKey(word)) {
                    wordFreq.put(word, 1);
                } else {
                    wordFreq.put(word, wordFreq.get(word) + 1);
                }
            }

            for (String word : note) {
                if (wordFreq.containsKey(word) && wordFreq.get(word) >= 1) {
                    wordFreq.put(word, wordFreq.get(word) - 1);
                } else {
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
        }
}
