package task18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void addFiveThousandElements(List<Integer> list) {

        long start = System.nanoTime();
        Random gen = new Random();

        for (int i = 0; i < 500_000; i++) {
            list.add(gen.nextInt());
        }

        long end = System.nanoTime();
        System.out.println("Время выполнения добавления в " +
                            list.getClass() + " (мс): " + (end - start) / 1_000_000.0);
    }

    public static void getThousandRandomElements(List<Integer> list) {

        long start = System.nanoTime();
        Random gen = new Random();

        for (int i = 0; i < 100_000; i++) {
            list.get(gen.nextInt(500_000));
        }

        long end = System.nanoTime();
        System.out.println("Время выполнения взятия элементов из " +
                            list.getClass() + " (мс): " + (end - start) / 1_000_000.0);
    }

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        addFiveThousandElements(arrayList);
        getThousandRandomElements(arrayList);

        addFiveThousandElements(linkedList);
        getThousandRandomElements(linkedList);

    }


}
