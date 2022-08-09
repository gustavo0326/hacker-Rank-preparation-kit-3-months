package pragmaCodeChallenge.arrayChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayChallenge {
    /*
    The function accepts List Integer Array
    The function for each element of the array, determine the value of the counter.
    return a array with the value of the counter for each element.
     */
    public static List<Integer> arraychallen(List<Integer> array) {
        List<Integer> arrS = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < array.size(); i++) {
            counter = 0;
            if (i == 0) {             //{1,2,2,4}  {2,4,3}
                arrS.add(counter);
            }else{
                int j=i;
                while (j != 0) {
                    counter = validar(array, j,i, counter);
                    j--;
                }
                arrS.add(counter);
            }
        }
        return arrS;
    }
    /*
    The function validate if it should add or subtract according to the value to the left of the element
     */
    private static int validar(List<Integer> array,int j,int i ,int counter){
        if (array.get(j - 1) > array.get(i)) {

            counter -= operacion(array,i,j,counter);

        } else if (array.get(j - 1) <= array.get(i)) {

            counter += operacion(array,i,j,counter);
        }

        return counter;
    }
    /*
    The function performs the arithmetic operation
     */
    private static int operacion(List<Integer> array, int i,int j, int counter) {
        int result=0;
        result = Math.abs(array.get(i) - array.get(j-1));
        return result;
    }
    public static void main(String[] args) {
        //test {1,2,2,3}=0,1,1,4  {2,4,3} =0,2,0 {2,1,3}=0,-1,3
        System.out.print(arraychallen(Arrays.asList(2,1,3)));
    }
}
