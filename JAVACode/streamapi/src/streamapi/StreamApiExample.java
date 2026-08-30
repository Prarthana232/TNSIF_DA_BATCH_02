package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 20, 30);

        // forEach()
        System.out.println("1. forEach()");
        numbers.stream().forEach(System.out::println);

        // filter()
        System.out.println("\n2. filter()");
        numbers.stream()
                .filter(n -> n > 20)
                .forEach(System.out::println);

        // map()
        System.out.println("\n3. map()");
        numbers.stream()
                .map(n -> n * 2)
                .forEach(System.out::println);

        // sorted()
        System.out.println("\n4. sorted()");
        numbers.stream()
                .sorted()
                .forEach(System.out::println);

        // distinct()
        System.out.println("\n5. distinct()");
        numbers.stream()
                .distinct()
                .forEach(System.out::println);

        // limit()
        System.out.println("\n6. limit()");
        numbers.stream()
                .limit(3)
                .forEach(System.out::println);

        // count()
        System.out.println("\n7. count()");
        long count = numbers.stream().count();
        System.out.println("Count = " + count);

        // collect()
        System.out.println("\n8. collect()");
        List<Integer> result = numbers.stream()
                .filter(n -> n > 20)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}