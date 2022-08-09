package pragmaCodeChallenge.rollingString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class RollingString {

    public static String rollingString(String s, List<String> operations) {
        /* ascci a=65;
        char letra1 ='A';
        letra1=('A'+1- 65)%26+65;
        System.out.println(letra1);
        letra1='A'+24;
        System.out.println(letra1);
        String sol ="";
        StringBuilder sb= new StringBuilder();*/

        List<Character> text = s.chars().mapToObj(e->(char)e).collect(Collectors.toList());

        for (String op : operations) {
            int i = Integer.parseInt(Character.toString(op.charAt(0)));
            int j = Integer.parseInt(Character.toString(op.charAt(1)));
            if (op.charAt(2) == 'L') {
                    for (int k = i; k <= j; k++) {
                        if (text.get(k)-1 < 'A') {
                            char letra = (char)(text.get(k)+25);
                            text.set(k,letra);
                        }else{
                            char letra = (char)(text.get(k)-1);
                            text.set(k,letra);
                        }
                    }
            } else if(op.charAt(2) == 'R') {
                for (int k = i; k <= j; k++) {
                    if (text.get(k)+1 > 'Z') {
                        char letra = (char)(text.get(k)-25);
                        text.set(k,letra);
                    }else{
                        char letra = (char)(text.get(k)+1);
                        text.set(k,letra);
                    }
                }

            }
        }

        return text.toString();

    }
    public static void main(String[] args){
        /*Test 2 =  s=abc operations "00L","22L","02R"  expected return [A, C, C]
        * TEST 1 s=abc operations "01L", "12R", "02R"  expected return [A, C, E]*/
        List<String> list = Arrays.asList("00L","22L","02R");
        System.out.println(rollingString("ABC", list));

    }
}
