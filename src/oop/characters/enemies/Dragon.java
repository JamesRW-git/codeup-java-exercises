package oop.characters.enemies;

public class Dragon extends Enemy{

    public Dragon() {
        super(200, 100);
    }

    public void fly() {
        System.out.println("Flying!");
    }

    public void attack() {
        System.out.println("Breathes fire!");
    }
}
