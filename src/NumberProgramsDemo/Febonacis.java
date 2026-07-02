package NumberProgramsDemo;

public class Febonacis {
    public static void main(String[] args) {
        int n=5;
        int a = 0;
        int b = 1;

        if(n==1){
            System.out.println(a);
        } else if (n==2) {
            System.out.println(b);
        }else {
            for (int i = 3; i <= n; i++) {
                int c = a + b;
                //System.out.print(c+" ");
                a = b;
                b = c;
            }
            System.out.println(b);
        }



    }
}
