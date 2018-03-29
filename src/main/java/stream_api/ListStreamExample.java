package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ListStreamExample {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("22");
        strings.add("333");
        strings.add("4444");
        strings.add("4444");

        List<Integer> collect = strings.stream()
                .filter(string -> string.length() > 2)
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        System.out.println(collect);


        List<Integer> distinct = strings.stream()
                .map(Integer::valueOf)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distinct);


        Optional<Integer> reduce = strings.stream()
                .distinct()
                .map(Integer::valueOf)
                .reduce(Integer::sum);

        System.out.println(reduce.get());
    }


}
