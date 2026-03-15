package Accenture;

public class ReverseString {
    static void main() {
        String course="Java";
        String reverse="";
        for(int i=course.length()-1;i>=0;i--){
            reverse+=course.charAt(i);
        }
        System.out.println(reverse);
    }
}
