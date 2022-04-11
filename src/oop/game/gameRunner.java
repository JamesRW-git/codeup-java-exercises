package oop.game;

import oop.enemies.Zombie;

public class gameRunner {
    public static void main(String[] args) {

//        Creating a new instance of zombie class and saving it in a variable
        Zombie zombie = new Zombie(75, 25, true);
        Zombie otherZombie = new Zombie(100, 50, false);
        Zombie emptyZombie = new Zombie();

        System.out.println(otherZombie.getMaxHealth());
        otherZombie.setMaxHealth(50);
        System.out.println(otherZombie.getMaxHealth());


    }
}
