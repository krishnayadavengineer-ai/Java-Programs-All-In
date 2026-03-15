package Accenture;

public class FindLongestNumber {
    static void main() {
        int[] arr={10,50,60,80};
        int max=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("maxium number  : "+max);
    }
}
