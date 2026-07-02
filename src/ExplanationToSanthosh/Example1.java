package ExplanationToSanthosh;

public class Example1 {

    String name; //instance Variable
    static  String course="Java",duration="4months"; //1500
    static void main(String[] args) {
        Example1 e=new Example1();
        System.out.println(course);

        Example1 e1=new Example1();
        course="React";
        System.out.println(course);
        System.out.println(duration);
        Example1 e2=new Example1();
        System.out.println(course);

        Example1 e3=new Example1();
        System.out.println(course);

    }
}
