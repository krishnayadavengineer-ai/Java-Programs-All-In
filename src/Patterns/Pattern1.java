package Patterns;

public class Pattern1 {
    static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {

            int stars;

            if (i <= 4)
                stars = i;
            else
                stars = 8 - i;

            for (int j = 1; j <= stars; j++) {
                System.out.print(" * ");
            }

            System.out.println();
        }
    }
}
