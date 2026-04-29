package StringHandling;

public class Demo1 {
//    static String  combinations(String name){
//        for(int i=0;i<name.length();i++){
//            for(int j=i+1;j<=name.length();j++){
//                System.out.println(name.substring(i,j));
//            }
//        }
//        return name;
//    }
//    static void CheackPalindrome(String s){
//
//        //longest substring
//       String longest="";
//        for (int i = 0; i <s.length(); i++) {
//            if(s.length()>longest.length()){
//                longest=s;
//            }
//        }
//        //reverse that longest
//        String rev="";
//        for(int i=0;i<longest.length();i++){
//            rev=rev+s.charAt(i);
//        }
//        //if longest equals rev print longest palindrome
//        if(rev.equals(longest)){
//            System.out.println(longest);
//        }
//
//    }
//    public static void main(String[] args) {
//
//        CheackPalindrome(combinations("abc"));



    static void CheckPalindrome(String s) {

        String longest = "";

        // Generate all substrings
        for(int i=0;i<s.length();i++) {
            for(int j=i+1;j<=s.length();j++) {

                String sub = s.substring(i,j);

                // check palindrome
                if(isPalindrome(sub)) {

                    if(sub.length() > longest.length()) {
                        longest = sub;
                    }
                }
            }
        }

        System.out.println("Longest Palindrome: "+longest);
    }

    static boolean isPalindrome(String str) {

        int start=0;
        int end=str.length()-1;

        while(start<end) {
            if(str.charAt(start)!=str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        CheckPalindrome("babad");
        // Output: bab (or aba)
    }
}
