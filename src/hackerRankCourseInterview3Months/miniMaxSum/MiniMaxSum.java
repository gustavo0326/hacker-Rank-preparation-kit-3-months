package hackerRankCourseInterview3Months.miniMaxSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {

    private static void miniMaxSum(List<Integer> arr) {

        long mini=0;
        long max=0;

        List<Integer> arrAux = new ArrayList<>();
        arr.stream().sorted().forEach(e -> arrAux.add(e));
        Collections.sort(arr, Collections.reverseOrder());

        for (int i = 0; i <arr.size()-1 ; i++) {
            max+=arr.get(i);
            mini+=arrAux.get(i);
        }
        System.out.print(mini+" "+max);

        /*arrAux.forEach(System.out::print);
        System.out.println("");
        arr.stream().forEach(System.out::print);*/
    }

    public static void main(String[] args) {
        /*constraints 1 <= arr[i] >= 10¬9
        * test 1,9,7,5,3 expected return [12,24]
        * test 7,69,2,221,8974 expected return [299,9271]
        * test 140537896,243908675,670291834,923018467,520718469 expected return [1575456874, 2357937445] */
        miniMaxSum(Arrays.asList(140537896,243908675,670291834,923018467,520718469));
    }


}
