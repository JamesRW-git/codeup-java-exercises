package oop.game;


import oop.characters.enemies.Dragon;
import oop.characters.enemies.Enemy;
import oop.characters.enemies.Zombie;
import oop.characters.hero.Knight;
import util.Input;
import oop.characters.hero.Hero;
import oop.characters.hero.Warrior;

import java.util.Random;

public class GameRunner {

    public static void main(String[] args) {
        Random random = new Random();

        String heroName = Input.getString("Welcome! Please enter the name of your hero: ");

        Hero hero;

        if (heroName.equalsIgnoreCase("warrior")) {
            hero = new Warrior("Warrior");
        } else {
            hero = new Knight("Knight");
        }

        boolean willAttack = Input.yesNo("You've encountered an enemy!");

        Enemy[] enemies = {new Zombie(), new Dragon()};

        Enemy enemyToAttack = enemies[random.nextInt(enemies.length - 1)];
    }


}
