package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN

import java.util.*;

public class App {

    public static Map getWordCount(String sentens) {
        String[] strArr = sentens.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String word : strArr) {
            map.put(word, Collections.frequency(Arrays.asList(strArr), word));
        }
        return map;

    }

    public static String toString(Map<String, Integer> map) {
        StringBuilder str = new StringBuilder();
        str.append("{\n");
        Set<String> setKey = map.keySet();
        for (String key : setKey) {
            str.append("  ").append(key).append(": ").append(map.get(key)).append("\n");
        }
        str.append("}");
        return str.toString();
    }

}
//END
