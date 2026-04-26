package task24;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> example = new ArrayList<>();
        example.add(new User(1, "Ivan", "Makarov", 25, "Russia"));
        example.add(new User(2, "Maxim", "Maximov", 19, "Russia"));
        example.add(new User(3, "Jonh", "Freeman", 47, "USA"));
        example.add(new User(4, "Tokomura", "Oyadzaki", 30, "Japan"));

        System.out.println("Сортировка по lastName");
        System.out.println(example.stream().sorted(new UserLastNameComparator()).toList());
        System.out.println();

        System.out.println("Сортировка по age");
        System.out.println(example.stream().sorted().toList());
        System.out.println();

        System.out.println("Проверка, что у всех пользователей age >= 7 - true");
        System.out.println(example.stream().allMatch(x -> x.getAge() >= 7));
        System.out.println();
        example.add(new User(5, "Arthur", "Young", 6, "Britain"));
        System.out.println("Проверка, что у всех пользователей age >= 7 - false");
        System.out.println(example.stream().allMatch(x -> x.getAge() >= 7));
        System.out.println();

        System.out.print("Средний возраст: ");
        System.out.println(example.stream().map(User::getAge).reduce(0, Integer::sum)/((double) example.size()));
        System.out.println();

        System.out.print("Количество разных стран проживания: ");
        System.out.println(example.stream().map(User::getCountry).distinct().count());
        System.out.println();

    }
}
