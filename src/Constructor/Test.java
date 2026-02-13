package Constructor;
class A {
    private void show() {
        System.out.println("A");
    }

    void display() {
        show();
    }
}

class B extends A {
   private void show() {
        System.out.println("B");
    }
}

public class Test {
    public static void main(String[] args) {
        A obj = new B();
        obj.display();
    }
}

