package task16;

import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.function.Supplier;

public class CollectionWithUniqueElements<T> {

    Collection<T> removeDuplicates(Collection<T> input) {

        Iterator<T> it = input.iterator();
        HashMap<T, Integer> customSet = new HashMap<>();
        int uniqueElementsCapacity = 0;

        for (int i = 0; i < input.size(); i++) {

            if (customSet.putIfAbsent(it.next(), uniqueElementsCapacity) == null) {
                uniqueElementsCapacity++;
            }

        }

        List<T> uniqueElementsArray = new ArrayList<>(Collections.nCopies(uniqueElementsCapacity, null));

        for (Map.Entry<T, Integer> entry: customSet.entrySet()) {
            uniqueElementsArray.set(entry.getValue(), entry.getKey());
        }

        try {
            Collection<T> uniqueElementsCollection = input.getClass().getDeclaredConstructor().newInstance();
            uniqueElementsCollection.addAll(uniqueElementsArray);
            return uniqueElementsCollection;
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            System.out.println("Нет публичного конструктора без параметров");
            return input;
        }
    };
}