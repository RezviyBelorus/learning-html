package touchsoft.problem1;

import java.util.ArrayList;
import java.util.List;

interface BestFit {
    String fitPlusMinus(String digits, long expectedResult);
}

class BestFitImpl implements BestFit {
    @Override
    public String fitPlusMinus(String digits, long expectedResult) {
        int length = digits.length();
        if (digits.length() == 0) {
            return "";
        }
        if (digits.length() == 1) {
            Long digitsLong = Long.valueOf(digits);
            return digitsLong.equals(expectedResult) ? digits.toString() : "";
        }

        int splitByCountOfNumbers = 1;
        List<String> combinations = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            for (int j = i; j<length; j++) {
                StringBuilder number = new StringBuilder();
                String substring = digits.substring(i, i + splitByCountOfNumbers);
            }

        }
        return "";
    }
}

class Main{
    public static void main(String[] args) {
//        Splitterator splitterator = new Splitterator();
//        List<String> strings = splitterator.splitToList("123");
//        System.out.println(strings);


    }
}