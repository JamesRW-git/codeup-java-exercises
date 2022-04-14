package oop.characters;

import static oop.characters.Attackable.baseAttackDamage;

public class Character {

    //    PROPERTIES ALL CHARACTERS SHARE
    protected int hp;
    protected int attackDamage;
    protected int spAttackDamage;

    public Character(int hp, int attackDamage) {
        this.hp = hp;
        this.attackDamage = attackDamage;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

//    BEHAVIORS THAT ALL CHARACTERS SHARE

    public void attack() {
        System.out.println("Attack!");

        if (attackDamage > baseAttackDamage) {
            System.out.println("Attacked for " + attackDamage + " damage");
        } else {
            System.out.println("Attacked for " + spAttackDamage + " damage!");
        }
    }



}