package ExceptionHandling;

public class EXAMPLE2 {
    static void main(String[] args) {
        try {
            int[] arr = new int[5];
            System.out.println(arr[10]); // Exception
        }catch (Exception e){
           e.printStackTrace();
        }


    }
}
