package ArraysPrograms;

public class ProductSum {
    static void main(String[] args) {
        int []arr={5,4,8,3,7};
        int p=1;
        for (int i = 0; i < arr.length; i++) {
            p*=arr[i];
        }
        int k=0;
        while (k<arr.length){
            System.out.println(p/arr[k]);
            k++;
        }
    }
}
