package Deloite;

public class Largest {
    static void main() {
        int[] l={10,20,30};
        int max=l[0];

        for (int i = 0; i < l.length; i++) {
            if(l[i]>max){
                max=l[i];
            }
        }
        System.out.println(max);
    }
}
