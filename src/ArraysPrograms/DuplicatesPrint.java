package ArraysPrograms;

public class DuplicatesPrint {
    static void main(String[] args) {
        int[] arr={1,1,2,2,2,3,4,5,5,5,6,6,6,6,7};

        for(int i=0;i<arr.length;i++){
            int count=0;
            if(arr[i]==0)continue;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]==arr[j]){
                    count++;
                    arr[j]=0;
                }
            }
            if(arr[i]!=0 && count>0){
                System.out.println(arr[i]);
            }
        }
    }
}
