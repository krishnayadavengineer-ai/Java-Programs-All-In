package ArraysPrograms;

import java.util.Arrays;

public class Array3 {
    static void method1(int[] arr,int k){
        int length=arr.length;
        k%=length;
        reverse(arr,0,k-1);
        reverse(arr,k,length-1);
        reverse(arr,0,length-1);
    }
   static void reverse(int[] arr,int s,int l){
        while (s<l){
            int temp=arr[s];
            arr[s]=arr[l];
            arr[l]=temp;
            s++;
            l--;
        }

    }
    static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int k=3;
        method1(arr,k);
        System.out.println(Arrays.toString(arr));
    }
}
