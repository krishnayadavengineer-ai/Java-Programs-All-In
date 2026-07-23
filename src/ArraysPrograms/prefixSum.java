package ArraysPrograms;

public class prefixSum {
    static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        int[] p=new int[arr.length];

        p[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            p[i]=p[i-1]+arr[i];
        }
        for (int n:p){
            System.out.println(n+" ");
        }
    }
}
