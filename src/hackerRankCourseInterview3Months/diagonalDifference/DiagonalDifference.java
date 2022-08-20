package hackerRankCourseInterview3Months.diagonalDifference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr){

       // arr.stream().forEach(System.out::print);

        int [][] mat = new int[arr.size()][arr.size()];
        int lPlus = Integer.MIN_VALUE, rPlus = Integer.MIN_VALUE;
        int colum = 0, row = 0, k = 0;
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                mat[i][j] = arr.get(i).get(j);
            }
        }
        colum = mat.length-1;
        while (row <= mat.length && k <= mat.length && colum+1>0){
             lPlus += mat[row][colum];
             rPlus += mat[k][k];
             k+=1;
             row+=1;
             colum-=1;
        }


        return Math.abs(rPlus - lPlus);
    }

    public static void main(String[] args) {
        //expecting result 15
        List<Integer> arr0 = Arrays.asList(11, 2, 4);
        List<Integer> arr1 = Arrays.asList(4,5,6);
        List<Integer> arr2 = Arrays.asList(10, 8, -12);
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(arr0);
        arr.add(arr1);
        arr.add(arr2);
        System.out.println(
        diagonalDifference(arr));
    }
}
