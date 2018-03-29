package touchsoft.problem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface Summands {
    long[] maxProduct(long n);
}

class SummandsImpl implements Summands {
    @Override
    public long[] maxProduct(long n) {
        List<List<Integer>> resultList = new ArrayList<>();
        long cursor = n;


        for (int i = 1; i < n; i++) {
            int sum = 0;
            List<Integer> potential = new ArrayList<>();
            for (int j = i; j < n; j++) {
                if (cursor - j >= 0) {
                    sum += j;
                    cursor-=j;
                    potential.add(j);
                } else {
                    sum += cursor - sum;
                }
            }
            System.out.println(potential);
            resultList.add(potential);
        }
        long[] arr = new long[resultList.get(0).size()];
        List<Integer> list = resultList.get(0);
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}

class MainProblem3 {
    public static void main(String[] args) {
        Summands summands = new SummandsImpl();
        long[] longs = summands.maxProduct(6);
        for (long aLong : longs) {
            System.out.println(aLong);
        }

    }
}
