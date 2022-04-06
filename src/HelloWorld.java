public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int myFavoriteNumber = 100000;
        System.out.println(myFavoriteNumber);

        String myString = "This is a string";
        System.out.println(myString);

        float myNumber = 3.14F;
        System.out.println(myNumber);

//        One post-increments and the other pre-increments
//        The first one returns 5 and 6 because the increment doesn't occur until after print executes
//        The second one returns 6 and 6 because the increment occurs before print executes
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        Cannot name a variable class because it is a reserved word

//        Both cause errors. The first is a casting error, the second is an incompatible type error
//        because it is expecting an integer and given a string
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//
//        int three = (int) "three";

//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);

//        Errors out because it doesn't fit within the range of the primitive type int
//        int tooBig = 10000000000;
//        System.out.println(tooBig);

//        Incrementing past the max value a primitive type can contain causes it to overflow and loop to the
//        beginning (lowest number for that type)
        short overflow = Short.MAX_VALUE;
        System.out.println(++overflow);

    }
}
