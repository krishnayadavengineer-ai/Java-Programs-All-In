package NumberProgramsDemo;

public class StrongNumber {
    static void main() {
        int n=8;
        int f=1;
        for (int i = 1; i <=n ; i++) {
            if(n%i==0){
               // System.out.print(i+" ");
                f*=i;
            }
        }
        System.out.println(f+" ");
    }
}
