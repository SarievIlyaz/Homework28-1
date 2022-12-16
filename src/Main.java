import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Integer[] array = {1, 2, 3, 10, 8, 9, 7, 6, 5, 4};
        Stream<Integer> massive = Stream.of(array);
        Stream<Integer> integerStream = massive.filter(x -> x % 2 == 0).map(x -> x * x);
        integerStream.max(Comparator.comparing(x -> x)).stream().toList().forEach(System.out::println);


    }
}