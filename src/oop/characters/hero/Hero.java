package oop.characters.hero;

public class Hero {

    private int heroHealth;
    private String name;

    public Hero() {}

    public Hero(int heroHealth, String name) {
        this.heroHealth = heroHealth;
        this.name = name;
    }

    public int getHeroHealth() {
        return this.heroHealth;
    }

    public void setHeroHealth(int heroHealth) {
        this.heroHealth = heroHealth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}