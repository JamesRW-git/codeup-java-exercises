package oop.enemies;

public class Zombie {
//    Properties
    private int maxHealth;
    private int attackDamage;
    private boolean isHungryForBrains;

//    Constructors
    public Zombie() {

    }

    public Zombie(int maxHealth, int attackDamage, boolean isHungryForBrains) {
        this.maxHealth = maxHealth;
        this.attackDamage = attackDamage;
        this.isHungryForBrains = isHungryForBrains;
    }


//    Getters and Setters
    public int getMaxHealth() {
        return this.maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

//    Custom Methods
    public void attack() {
        System.out.println("Attacking and eating brains!");
    }

}
