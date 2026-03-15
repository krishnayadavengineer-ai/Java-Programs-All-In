package Accenture;

public class CheackingPalindrome {
    static void main() {
        String name="madam";
        String rev="";
        for(int i=name.length()-1;i>=0;i--){
            rev+=name.charAt(i);
        }
        if(name.equals(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("not A");
        }
    }
}
