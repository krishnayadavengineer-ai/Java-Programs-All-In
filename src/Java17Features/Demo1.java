package Java17Features;

public class Demo1 {
    Demo1(){
        System.out.println("con");
    }

    static {
        System.out.println("static2");
    }
    static {
        System.out.println("static1");
    }


    public static void main(String[] args) {
        Demo1 d=new Demo1();
    }
}
