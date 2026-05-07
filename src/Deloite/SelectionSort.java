package Deloite;

import java.util.Arrays;

public class SelectionSort {


    static void main() {
        int[] arr = {1, 5, 2, 9, 8, 6, 3, 3, 5, 4};
int a[]=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]!=arr[j]){
                    a[i]=arr[i];
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
