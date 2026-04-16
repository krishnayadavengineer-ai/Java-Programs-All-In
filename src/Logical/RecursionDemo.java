package Logical;

public class RecursionDemo {

    public static  void recursion1(int n){
        if(n==6){
            return;
        }

       recursion1(n+1);
        System.out.println(n);
    }
    static void main() {
        recursion1(1);
    }
}
