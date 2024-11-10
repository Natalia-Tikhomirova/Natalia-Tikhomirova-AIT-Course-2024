package classwork_42.map_examples;

import java.util.HashMap;
import java.util.Map;

public class WordsFrequencyAppl {
    public static void main(String[] args) {

        String[] words = {"a", "abc", "ab", "limit", "ab", "a","1a", "ab", "limit", "a", "a", "a", "1a"};

        printWordsFrequency(words);
    }

    private static void printWordsFrequency(String[] words) {

        // Key - это слово, value - сколько раз попалось в массиве
        Map<String,Integer> resultMap = new HashMap<>();
        for (String word : words) {
            if(!resultMap.containsKey(word)){ // когда слово попалось первый раз
                resultMap.put(word,1);
            }else { // когда слово уже есть
                resultMap.put(word,resultMap.get(word) + 1); // увеличиваем на 1
            }
        }
         // print resultMap

        for (String word : resultMap.keySet()) {
            System.out.println("Word: " + word + ", frequency: " + resultMap.get(word));
        }

    } //end of main
}
