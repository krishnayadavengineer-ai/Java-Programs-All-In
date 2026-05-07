package Deloite;

public class Palindrome {
    static void main() {
        int n=151;
        int k=n;
        int q=0;
        while (n>0){
            int d=n%10;
            q=q*10+d;
            n/=10;
        }
        if(k==q){
            System.out.println("palindrome");
        }
    }
}
