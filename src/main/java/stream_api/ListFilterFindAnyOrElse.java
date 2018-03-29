package stream_api;

import java.util.ArrayList;
import java.util.List;

public class ListFilterFindAnyOrElse {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        String result = list.stream()
                .filter(elem -> elem.equals("A"))
                .findFirst()
                .orElse("Not found");

        System.out.println(result);
    }
}
