package lectures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class CollectionsLec {
    public static void main(String[] args) {

//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(20); //adding an element
//        numbers.add(0,21); //specifying an index
//        numbers.add(22);
//
//        System.out.println(numbers);
//
//        System.out.println(numbers.indexOf(20));
//        System.out.println(numbers.indexOf("cat"));

        String[] toppings = {"pepperoni", "sausage", "mushrooms", "pineapple", "olives"};

        List<String> toppingList = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 40; i ++) {
            toppingList.add(toppings[random.nextInt(toppings.length)]);
        }



        HashMap<String, Integer> toppingsMap = new HashMap<>();

        for (String topping : toppingList) {
            if (toppingsMap.containsKey(topping)){
                toppingsMap.replace(topping, toppingsMap.get(topping) + 1);
            } else {
                toppingsMap.putIfAbsent(topping, 1);
            }
        }

        System.out.println("Pepperoni: " + toppingsMap.get("pepperoni"));
        System.out.println("Sausage: " + toppingsMap.get("sausage"));
        System.out.println("Mushrooms: " + toppingsMap.get("mushrooms"));
        System.out.println("Pineapple: " + toppingsMap.get("pineapple"));
        System.out.println("Olives: " + toppingsMap.get("olives"));
    }
}
