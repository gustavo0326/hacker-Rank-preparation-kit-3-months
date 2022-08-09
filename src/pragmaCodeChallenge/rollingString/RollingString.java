package pragmaCodeChallenge.rollingString;

import java.util.Arrays;
import java.util.List;

public class RollingString {

    public static String rollingString(String s, List<String> operations) {
        /* ascci a=65;
        char letra1 ='A';
        letra1=('A'+1- 65)%26+65;
        System.out.println(letra1);
        letra1='A'+24;
        System.out.println(letra1);*/

        String sol ="";
        StringBuilder sb= new StringBuilder();
        for (String op : operations) {
            int i = Integer.parseInt(Character.toString(op.charAt(0)));
            int j = Integer.parseInt(Character.toString(op.charAt(1)));
            if (op.charAt(2) == 'L') {
                for (char letraAux: s.toCharArray()) {


                    for (int k = i; k <= j; k++) {
                        if (s.charAt(k)-1 < 'A') {

                            char letra = (char)(s.charAt(k)+25);
                            sb.append(letra);
                        }else{
                            char letra = (char)(s.charAt(k)-1);
                            sb.append(letra);
                        }
                    }}
            } else if(op.charAt(2) == 'R') {
                for (int k = i; k <= j; k++) {
                    if (s.charAt(k)+1 > 'Z') {

                        char letra = (char)(s.charAt(k)-25);
                        sb.append(letra);
                    }else{
                        char letra = (char)(s.charAt(k)+1);
                        sb.append(letra);
                    }
                }

            }
        }

        return sol=sb.toString();

    }
    public static void main(String[] args){

        List<String> list = Arrays.asList("01L", "12R", "02R");
        System.out.println(rollingString("ABC", list));

    }
}
