package pragmaCodeChallenge.prestamo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prestamo {
    public static class Resultado{
        public static List<Long> calculardias(List<Long> prestamo) {
            List<Long> dias = new ArrayList<>();
            System.out.println("arreglo de dias : "+prestamo);
            int cuota = 1;
            int suma=0, cont=0;
            for (Long p:prestamo) {
                while (suma < p){
                    suma+=cuota;
                    cuota+=cuota;
                    cont++;
                }
                Long contL= new Long(cont);
                dias.add(contL);
            }
            return dias;
        }
    }
    public static void main(String[] args) throws Exception {
        /*test numero prestamo n=1 ,Valor prestamo =[15]  expected return 4
        * test numero prestamo n=3 ,Valor prestamo =[15],[16],[45] expected return [4, 5, 6]*/
        Scanner scanner = new Scanner(System.in);
        int prestaCount = scanner.nextInt();
        List<Long> prestamo = new ArrayList<>();
        for (int i=0; i<prestaCount;i++) {
            prestamo.add(scanner.nextLong());
        }
        List<Long> resul= Resultado.calculardias(prestamo);
        System.out.println(resul);
    }}
