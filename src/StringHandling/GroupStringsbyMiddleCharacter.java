package StringHandling;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupStringsbyMiddleCharacter {
    static void main(String[] args) {
        String[] names = {"krishna", "ramu", "siva", "pradeep", "vasu"};
//
//        HashMap<Character, List<String>> map=new HashMap<>();
//        for (String s:names){
//            int mid=s.length()/2;
//            char midchar=s.charAt(mid);
//            if(!map.containsKey(midchar)){
//                map.put(midchar,new ArrayList<>());
//            }
//            map.get(midchar).add(s);
//        }
//        System.out.println(map);


        HashMap<Character,List<String>> map=new HashMap<>();
        for(String n:names){
            int midlength=n.length()/2;
           char midch= n.charAt(midlength);
           if(!map.containsKey(midch)){
               map.put(midch,new ArrayList<>());
           }
           map.get(midch).add(n);
        }
        System.out.println(map);
    }
}
