package Accenture;

import java.util.HashMap;

public class CountCharatersInString {
    static void main() {
        String name="Java is a oops Programing";

        HashMap<Character,Integer> map=new HashMap<>();
        for (char ch:name.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
    }
}
