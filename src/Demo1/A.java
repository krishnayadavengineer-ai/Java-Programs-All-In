package Demo1;
public class A {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = a.clone();
        b[0] = 99;
        System.out.println(a[0]);

    }
}

