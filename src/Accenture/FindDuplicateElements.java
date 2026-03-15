package Accenture;

import java.sql.Array;
import java.util.*;

public class FindDuplicateElements {
    static void main() {
//        int[] arr={1,2,3,5,2,1,2,3,5};
//
//
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]==arr[j]){
//                    System.out.println(arr[i]);
//                }
//            }
//        }

//
//        HashSet<Integer> numbers=new HashSet<>(Arrays.asList(1,2,2,2,2));
//
//        System.out.println(numbers);

        List<Integer> num=new ArrayList<>(Arrays.asList(1,2,3,3,3,3));

        HashSet<Integer> uni=new HashSet<>();
        HashSet<Integer> dup=new HashSet<>();

        for(int n:num){
            if(!uni.add(n)){
                dup.add(n);
            }
        }
        System.out.println(uni);
        System.out.println(dup);

    }
}
