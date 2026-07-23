package ExceptionHandling;

import java.util.Scanner;

public class Demo1 {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        if(n<18){

                throw new AgeNotSuppourt("Not eligible for vote");


        }else {
            System.out.println("elogblie to vote");
        }
    }
}
