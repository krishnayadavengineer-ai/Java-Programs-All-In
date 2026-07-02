package NumberProgramsDemo;

public class AlternativePrimeNumber {
    static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return  false;
            }
        }
        return true;
    }
    static void main() {
        int count=0;
        for (int i = 2; i <=20 ; i++) {
            if(isPrime(i)){
               count++;

            if(count%2 ==1){
                System.out.println(i);
            }
            }
        }

    }
}
