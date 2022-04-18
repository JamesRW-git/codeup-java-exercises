package lectures;

import java.util.Arrays;

public class ArraysLec {
    public static void main(String[] args) {
        //In Java, arrays are immutable
        //Arrays can only have 1 type of data
        //Immutability: the size of arrays are fixed

//        String[] myStrings = new String[3];
//        myStrings[0] = "Casey";
//        myStrings[1] = "BobbyBoi";
//        System.out.println(myStrings[1]);

        String[] myOtherStrings = {"Casey", "BobbyBoi", "Jimbo"};

//        for (int i = 0; i < myOtherStrings.length; i++) {
//            System.out.println(myOtherStrings[i]);
//        }

        System.out.println(Arrays.toString(myOtherStrings));

    }
}
