package amazon.maximumEnvios;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MaximumEnvios {
        public static int solution(List<Integer> parcels){

            int flag = 0;
            int minimum = 0;
            while(!parcels.stream().allMatch(a -> a == 0)){
                System.out.println(parcels);
                int i=0;
                minimum = minimumParcel(parcels);
                while (i < parcels.size()) {
                    parcels.set(i, (parcels.get(i) - minimum)<0?0:(parcels.get(i) - minimum));
                    i++;
                }
                flag++;
            }
            return flag;
        }

        private static int minimumParcel(List<Integer> parcels) {
            int minimum = Collections.max(parcels);
            for (int i = 0; i < parcels.size(); i++) {
                if (minimum > parcels.get(i)&& parcels.get(i) > 0) {
                    minimum = parcels.get(i);
                }
            }
            return minimum;
        }


        public static void main(String[] args) {
            List<Integer> list = Arrays.asList(0,3,4,3,3);
            System.out.println(solution(list));
        }

    }


