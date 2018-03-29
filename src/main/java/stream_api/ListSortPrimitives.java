package stream_api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSortPrimitives {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("BB");
        strings.add("C");
        strings.add("A");
        strings.add("D");


        strings.sort(String.CASE_INSENSITIVE_ORDER);

        strings.sort(Comparator.naturalOrder());
        strings.sort(Comparator.reverseOrder());

        System.out.println(strings);
    }
}
