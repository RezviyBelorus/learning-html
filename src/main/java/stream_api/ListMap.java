package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListMap {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        List<Integer> resultList = list.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(resultList);
    }
}
