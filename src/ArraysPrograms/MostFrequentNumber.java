package ArraysPrograms;

public class MostFrequentNumber {
    public static void main(String[] args) {
        int[] arr = {2, 10, 30, 40, 20, 11, 42,35,4,4,4,4,8,8,8,8};

        int mostfrque=arr[0];
        int maxcount=1;

        for (int i = 0; i < arr.length; i++) {
            int current=arr[i];
            int currentcount=1;

            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j]==current){
                    currentcount++;
                }
            }
            if(currentcount>maxcount){
                maxcount=currentcount;
                mostfrque=current;
            }


        }
        System.out.println("most frequent number : "+mostfrque);
        System.out.println("index : ");
        for (int i = 0; i < arr.length; i++) {
            if (mostfrque==arr[i]){
                System.out.print(i+" ");

            }
        }
    }
}
