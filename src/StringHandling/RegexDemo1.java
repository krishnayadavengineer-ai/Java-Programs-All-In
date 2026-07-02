package StringHandling;

import java.util.Scanner;

public class RegexDemo1 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s.matches("[0-9]{5} ")){
            System.out.println("Match");
        }else{
            System.out.println("No");
        }
    }
}
