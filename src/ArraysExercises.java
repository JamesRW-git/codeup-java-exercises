import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);

        Person person1 = new Person("Rebecca");
        Person person2 = new Person ("George");
        Person person3 = new Person("James");

        Person[] people = {person1, person2, person3};

        for (int i = 0; i < people.length; i++) {
            System.out.println("FIRST ARRAY");
            System.out.println(people[i].getName());
            System.out.println("*******************");
        }

        Person person4 = new Person("Baazelbub");
        Person person5 = new Person("Method Man");

        Person[] people1 = addPerson(people, person4);

        for (int i = 0; i < people1.length; i++) {
            System.out.println("SECOND ARRAY");
            System.out.println(people1[i].getName());
            System.out.println("*******************");
        }

        Person[] people2 = addPerson(people1, person5);

        for (int i = 0; i < people2.length; i++) {
            System.out.println("THIRD ARRAY");
            System.out.println(people2[i].getName());
            System.out.println("*******************");
        }
    }

    public static Person[] addPerson(Person[] array, Person newPerson) {
        Person[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[array.length] = newPerson;
        return newArray;
    }
}
