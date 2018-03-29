package testexpertsoft;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AntonMergeMain {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(3);
        a.add(5);

        List<Integer> b = new ArrayList<>();
        b.add(2);
        b.add(6);
        b.add(8);
        System.out.println(a);
        System.out.println(b);
        merge(a, b);
        System.out.println(a);
    }
    private static List<Integer> merge(List<Integer> first, List<Integer> second) {
        if (second.isEmpty()) {
            return first;
        }

        Integer firstListMaxElement = first.get(first.size() - 1);
        Integer firstListMinElement = first.get(0);
        Integer secondListMaxElement = second.get(second.size() - 1);

        if (second.get(0) > firstListMaxElement) {
            first.addAll(second);
            return first;
        }

        if (secondListMaxElement < firstListMinElement) {
            first.addAll(0, second);
            return first;
        }
        Iterator<Integer> firstIterator = first.iterator();
        Iterator<Integer> secondIterator = second.iterator();

        List<Integer> merged = new ArrayList<>(first.size() + second.size());
        int firstCurrentElement = firstIterator.next();
        int secondCurrentElement = secondIterator.next();

        while (merged.size() < first.size() + second.size() && secondIterator.hasNext() ) {
            if (firstCurrentElement < secondCurrentElement && firstIterator.hasNext()) {
                merged.add(firstCurrentElement);
                firstCurrentElement = firstIterator.next();
            } else {
                merged.add(secondCurrentElement);
                secondCurrentElement = secondIterator.next();

            }
        }
        first.clear();
        first.addAll(merged);
        return first;
    }
}
