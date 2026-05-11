package NumberProgramsDemo;

import java.math.BigInteger;

public class Factorial {
    static void main(String[] args) {
        int n=66;
        BigInteger f=new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            f=f.multiply(BigInteger.valueOf(i));
        }
        System.out.println(f);
    }
}
