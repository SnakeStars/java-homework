package task23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static <T, R> HashMap<R, List<T>> reversedHashMap(HashMap<T, R> hashMap) {
        HashMap<R, List<T>> result = new HashMap<>();

        for (Map.Entry<T, R> item: hashMap.entrySet()) {
            result.computeIfAbsent(item.getValue(), k -> new ArrayList<T>()).add(item.getKey());
        }

        return result;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> original = new HashMap<>();
        original.put("A", 1);
        original.put("B", 2);
        original.put("C", 1);
        original.put("D", 3);
        original.put("E", 2);

        System.out.println("Original map:");
        System.out.println(original);
        System.out.println();

        HashMap<Integer, List<String>> reversed = reversedHashMap(original);

        System.out.println("Reversed map:");
        System.out.println(reversed);
    }
}
