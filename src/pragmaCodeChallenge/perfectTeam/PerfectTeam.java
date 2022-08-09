package pragmaCodeChallenge.perfectTeam;

import java.util.HashMap;

public class PerfectTeam {

    int teamSkill(String skills){
        HashMap<Character,Integer> mapSkill= new HashMap<>();

        int minValue=0;
        int currValue=0;

        mapSkill.put('p',0);
        mapSkill.put('c',0);
        mapSkill.put('m',0);
        mapSkill.put('b',0);
        mapSkill.put('z',0);

        for (char c:skills.toCharArray()) {
            if(mapSkill.containsKey(c)){
                mapSkill.put(c,(mapSkill.get(c))+1);
            }
        }
        System.out.println(mapSkill);
        minValue = mapSkill.get('c');
        for (Character key : mapSkill.keySet() ) {
            if (mapSkill.get(key) < minValue)
                minValue = mapSkill.get(key);
        }
        return minValue;
    }

    public static void main(String[] args) {
        PerfectTeam perfectTeam = new PerfectTeam();
        /*test = cmcmbbbpppcmzzcmbpzz expected to return 4 teams
        test = pcmbzpcmbz expected to return 2 teams */
        int result =perfectTeam.teamSkill("pcmbzpcmbz");
        System.out.println("minimo equipo: "+result);


    }

}
