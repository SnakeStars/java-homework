package task16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> example = new ArrayList<Integer>();
        example.add(1);
        example.add(2);
        example.add(2);
        example.add(3);
        example.add(3);
        example.add(4);

        CollectionWithUniqueElements<Integer> converter = new CollectionWithUniqueElements<Integer>();

        System.out.println(converter.removeDuplicates(example));
    }
}
