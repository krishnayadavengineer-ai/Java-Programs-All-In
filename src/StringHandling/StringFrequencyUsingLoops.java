package StringHandling;

public class StringFrequencyUsingLoops {
    static void main(String[] args) {
        String[] arr={
                "Java",
                "Springboot",
                "Python",
                "Java",

        };

        String k="java";
        int count=0;


        for(String s:arr){
            if(s.equalsIgnoreCase(k)){
                count++;
            }
        }
        System.out.println("Frequency of \"" + k + "\" = " + count);
    }
}
