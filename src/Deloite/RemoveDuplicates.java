package Deloite;

import java.util.*;

public class RemoveDuplicates {
    static void main(String[] args) {
        int[] arr={10,20,20,30,50,40,50,40};
        Set<Integer> set=new HashSet<>();
        for(int a:arr){
            set.add(a);

        }
        System.out.println(set);
    }
}
