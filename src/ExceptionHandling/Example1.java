package ExceptionHandling;

import java.util.Scanner;

public class Example1{
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try{
            System.out.println(10/0);
        }
        catch (Exception e){
            e.toString();
        }
        finally {
            System.out.println("hello");
            scanner.close();

        }



        System.out.println("hello ho");
        System.out.println("hi");
    }
}
