package task21;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Function;

public class Main {
    public static <T> T[] deleteWrongElements(T[] array, Function<T, T> rule) {
        return Arrays.stream(array).map(rule).filter(Objects::nonNull).toArray(size -> Arrays.copyOf(array, size));
                //(T[]) java.lang.reflect.Array.newInstance(array.getClass().getComponentType(), size));
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, -2, 3, -4, 5};
        Integer[] result = deleteWrongElements(numbers, x -> x < 0 ? null : x);
        System.out.println(Arrays.toString(result));

        String[] words = {"Java", "is", "very", "fun"};
        String[] filtered = deleteWrongElements(words, s -> s.length() < 3 ? null : s);
        System.out.println(Arrays.toString(filtered));
    }
}
