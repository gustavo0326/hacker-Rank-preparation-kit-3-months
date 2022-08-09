package hackerRankCourseInterview3Months;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class PlusMinus {

    private static void plusMinus(List<Integer> arr) {

        int flagNegative = 0;
        int flagPositive = 0;
        int flagZero = 0;
        double positives = 0;
        double negative = 0;
        double zero = 0;

        for (Integer integer:arr) {
            if (integer < 0) {
                flagNegative++;
            }else if(integer>0){
                flagPositive++;
            }else{
                flagZero++;
            }
        }
        System.out.printf("%.6f\n",(double)flagPositive/arr.size());
        System.out.printf("%.6f\n",(double)flagNegative/arr.size());
        System.out.printf("%.6f\n",(double)flagZero/arr.size());
    }

    public static void main(String[] args) {
        // expected
        /* 0,500000
           0,333333
           0,166667
        */
        plusMinus(Arrays.asList(-4,3,-9,0,4,1));
    }


}
