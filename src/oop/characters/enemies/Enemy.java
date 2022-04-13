package oop.characters.enemies;

public class Enemy {

//    PROPERTIES

    private int maxHealth;
    private int attackDamage;

//    CONSTRUCTORS

    public Enemy() {

    }

    public Enemy(int maxHealth, int attackDamage) {
        this.maxHealth = maxHealth;
        this.attackDamage = attackDamage;
    }

//    GETTERS AND SETTERS

    public int getMaxHealth() {
        return this.maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }


    //    CUSTOM METHODS

    public void attack() {
        printAttackMessage();
    }

    private void printAttackMessage() {
        System.out.println("Enemy Attacking!");
    }



}