package quiz;

import com.sun.tools.example.debug.expr.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import sun.jvm.hotspot.interpreter.Interpreter;

import java.beans.Expression;
import java.math.BigDecimal;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        List<Integer> list2 = list1;

        System.out.println(list1);
        System.out.println(list2);

        list1.remove(0);
        System.out.println(list1);
        System.out.println(list2);

        String s = "se";
        String substring = s.substring(0, s.length());
        System.out.println(substring);

//        StringSplitter splitter = new StringSplitter();
//        List<List<String>> split = splitter.split(1234);
//        split.forEach(list -> {
//            list.forEach(string -> {
//                System.out.print(" " + string);
//            });
//            System.out.println();
//        });


        com.udojava.evalex.Expression expression = new com.udojava.evalex.Expression("1+1-2");
        BigDecimal eval = expression.eval();
        System.out.println(eval);



    }
}
