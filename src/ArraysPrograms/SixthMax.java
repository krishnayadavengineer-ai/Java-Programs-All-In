package ArraysPrograms;

import java.util.Arrays;

public class SixthMax {
    static void main(String[] args) {
        int[] arr={20,4,5,6,7,8,0,9};
        Arrays.sort(arr);
        int n=arr.length;
        if(n>6){
           int six= arr[n-2];
            System.out.println("sixth highest number: "+six);
        }else{
            System.out.println("array is length is lessthan six");
        }
    }
}
