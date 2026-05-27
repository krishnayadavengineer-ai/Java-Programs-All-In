package NumberProgramsDemo;

public class ArmStrongNumber {
    static void main(String[] args) {
        int n=153;
        int k=n;
        int r=0;
        int digits=String.valueOf(n).length();
        while (n>0){
            int ld=n%10;
            r+=Math.pow(ld,digits);
            n/=10;
        }
        if(r==k){
            System.out.println("armstrong");
        }

    }
}
