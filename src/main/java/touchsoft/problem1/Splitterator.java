package touchsoft.problem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Splitterator {
    public List<String> splitToList(String digits) {
        int length = digits.length();
        String separator = ".";
        List<String> list = new ArrayList<>();

        for (int i = 0; i < length-1; i++) {
            insertDotes(digits, i);
        }
        return list;
    }

    private String insertDotes(String digits, int i) {
        return "";
    }
}
