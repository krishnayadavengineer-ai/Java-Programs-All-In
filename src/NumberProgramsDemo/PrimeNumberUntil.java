package NumberProgramsDemo;

public class PrimeNumberUntil {
    static boolean isPrime(int n){
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                return false;

            }

        }
        return  true;
    }
    static void main(String[] args) {
        int n=1134573;
      int a=n;
        int k=10;
        while (a>0){
           int ld= a%10;
           if(isPrime(ld)){
               System.out.println(ld);
           }
            n/=10;

           k=k*10;
        }
    }
}
