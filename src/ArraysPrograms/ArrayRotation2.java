package ArraysPrograms;

import java.util.Arrays;

public class ArrayRotation2 {
    static void retate(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);

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
        int a[]={1,2,3,4,5};
        int k=3;
        retate(a,k);
        System.out.println(Arrays.toString(a));
    }
}
