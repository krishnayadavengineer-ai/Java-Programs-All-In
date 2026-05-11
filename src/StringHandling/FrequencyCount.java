package StringHandling;

public class FrequencyCount {
    static void main(String[] args) {
        String s="hello";
       char[] s1=s.toCharArray();
        for (int i = 0; i <s1.length ; i++) {
            int count=1;

            if (s1[i] == '0') {
                continue;
            }
            for (int j = i+1; j < s1.length; j++) {
                if(s1[i]==s1[j]){
                    count++;
                    s1[j] = '0';
                }
            }
            System.out.println(s1[i]+" "+count);
        }
    }
}
