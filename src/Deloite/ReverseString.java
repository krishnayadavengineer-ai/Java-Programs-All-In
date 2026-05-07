package Deloite;

public class ReverseString {
    static void main() {
        String name="Krishna";
        String rev="";
        for (int i = name.length()-1; i >=0 ; i--) {
            rev+=name.charAt(i);
        }
        System.out.println(rev);
    }
}
