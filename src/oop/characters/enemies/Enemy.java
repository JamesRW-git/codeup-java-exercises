package oop.characters.enemies;

import oop.characters.Character;

public class Enemy extends Character{

    public Enemy(int hp, int attackDamage){
        super(hp, attackDamage);
    }

    @Override
    public void attack() {
        System.out.println("Enemy attack!");
    }

}