package Java17Features;


import java.util.random.RandomGenerator;

public class SwitchDemo {
    public static void main(String[] args) {

//       Object name="krishna";
//
//
//      String nam= switch (name){
//           case Integer i ->"Integer"+i;
//           case String s -> "String : " + s;
//
//          default -> "noname";
//      };
//        System.out.println(nam);


        RandomGenerator rg = RandomGenerator.of("L64X128MixRandom");

        System.out.println(rg.nextInt());
    }
}
