package lesson12.map4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple"));
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
//           wordCount.compute(word, (key, count)-> count == null ? 1 : count+1);
            Integer count = wordCount.get(word);
            System.out.println(count);
            wordCount.put(word, count == null ? 1 : count + 1);
        }
        System.out.println(wordCount);

    }
}
