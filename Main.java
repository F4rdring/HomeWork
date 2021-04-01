package NewLesson4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = {"dog", "cat", "bird", "car", "plane", "dog", "fox", "plane", "wolf", "car"};

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("");

        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
        System.out.println("");

        Phonebook pb = new Phonebook();

        pb.add("Ivanov", "495316");
        pb.add("Petrov", "495317");
        pb.add("Smirnov", "495718");

        System.out.println(pb.get("Petrov"));
    }
}
