package ArraysPrograms;

public class PrintArrayPositiveNumbersAndNegativeNumbers {
    static void main() {
        int[] arr={1,2,-3,4,-5,-9,8,6};

        int positivecount=0;
        int negativecount=0;

        for(int n:arr){
            if(n<0){
                negativecount++;
            } else if (n>0) {
                positivecount++;
            }
        }

        int[] parr=new int[positivecount];
        int[] narr=new int[negativecount];

        int pcount=0;
        int ncount=0;

        for (int n:arr){
            if(n>0){
                parr[pcount++]=n;
            } else if (n < 0) {
                narr[ncount++]=n;
            }
        }


        for (int i = 0; i < parr.length; i++) {
            if(i<narr.length){
                System.out.println(parr[i]+" "+narr[i]);
            } else if (i>0) {
                System.out.println(parr[i]+"  0");
            }

        }
    }
}
