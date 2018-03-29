package testexpertsoft;

import org.hsqldb.lib.Collection;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExpertSoftMain {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(6);
        a.add(5);
        a.add(3);


        List<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(2);
        
        Collections.sort(a);
        Collections.sort(b);

        System.out.println("a before: " + a);
        System.out.println("b before: " + b);

        merge(a, b);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    private static void merge(List<Integer> a, List<Integer> b) {
        if (a.get(a.size() - 1) < b.get(0)) {
            a.addAll(b);
            return;
        }
        if (b.get(b.size() - 1) < a.get(0)) {
            a.addAll(0, b);
            return;
        }
        int cursorB = 0;
        for (int cursorA = 0; cursorA < a.size(); ) {
            if (cursorB < b.size() && b.get(cursorB) < a.get(cursorA)) {
                a.add(cursorA, b.get(cursorB));
                cursorB++;
            } else {
                cursorA++;
            }
            if (cursorA == a.size() && cursorB < b.size()) {
                a.addAll(b.subList(cursorB, b.size() - 1));
            }
        }
    }
}
