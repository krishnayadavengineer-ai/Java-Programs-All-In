package ExplanationToSanthosh;

public class Variables1 {
    int k=102;
    final int a = 55;//immutable

    static void main(String[] args) {
        System.out.println("hello");
        method1();
        Variables1 v=new Variables1();
        System.out.println(v.k);
    }
    static void method1(){
       int a=50;//local variable
        System.out.println(a);

    }
   static {
        int a=60;
       System.out.println("number : "+a);
    }
}
