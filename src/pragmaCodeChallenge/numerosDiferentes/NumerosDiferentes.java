package pragmaCodeChallenge.numerosDiferentes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NumerosDiferentes {

    public static int cantidadMinimaDeDias(List<Integer> x){
        int ndias=0;
        List<Integer> nDis = x.stream().distinct().collect(Collectors.toList());
        return nDis.size();
    }

    public static void main(String[] args) {
        List<Integer> x =new ArrayList<>();
        int[] arr ={1, 2, 2, 1, 1, 3, 5, 1, 2,9,0,0};
        /*test
        numeros diferentes = 4 de x={1, 2, 2, 1, 1, 3, 5, 1, 2}
        numeros diferentes = 6 {1, 2, 2, 1, 1, 3, 5, 1, 2,9,0,0} */
        for (int nu:arr){
            x.add(nu);
        }
        System.out.println(cantidadMinimaDeDias(x));
    }
}
