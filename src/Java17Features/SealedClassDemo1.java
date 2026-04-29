package Java17Features;

sealed class Vechile permits Car{
    void method1(){
        System.out.println("Hello method1");
    }

}
//syntax
//sealed class Vechile permits Car,Bike

non-sealed class Car extends Vechile{
    void method1(){
        System.out.println("From Car Hello method1");
    }

}
final class Bhike extends Car{
    void method1(){
        System.out.println("From Bhike Hello method1");
    }

}




public class SealedClassDemo1 {
    public static void main(String[] args) {

        Vechile v1 = new Car();
        v1.method1();

        Vechile v2 = new Bhike();
        v2.method1();

    }
}
