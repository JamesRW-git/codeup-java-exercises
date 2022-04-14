package oop.characters;

import oop.characters.Character;

public class Enemy extends Character {

    private int spAttackDamage = 20;

    public Enemy(int hp, int attackDamage) {
        super(hp, attackDamage);
    }

    @Override
    public void attack() {
        System.out.println("Enemy Attack!");
    }

    public void spAttack() {
        System.out.println("Used special attack for " + spAttackDamage + " damage!");
    }

}