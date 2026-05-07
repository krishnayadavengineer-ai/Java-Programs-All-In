package Deloite;

import java.util.Arrays;

public class Anagrams {
    static void main() {
        String s1="listen";
        String s2="silent";

       char[] a= s1.toCharArray();
       char[] b= s2.toCharArray();


        Arrays.sort(a);
        Arrays.sort(b);
       if(Arrays.equals(a,b)){
           System.out.println("Anagrams");
       }else {
           System.out.println("Not an anagrams");
       }
    }
}
