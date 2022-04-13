package oop.characters.hero;

import oop.characters.Character;

public class Hero extends Character {

    private String name;

    public Hero(int hp, int attackDamage, String name) {
        super(hp, attackDamage);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println("Hero attack!");
    }
}