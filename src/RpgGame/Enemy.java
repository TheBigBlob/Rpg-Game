package RpgGame;

import java.util.ArrayList;
import java.util.List;

public class Enemy {
    int damage;
    int health;
    int armor;
    String name;

    Enemy(String name, int health, int damage, int armor) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.armor = armor;

    }

    public static List<Enemy> createEnemy = new ArrayList<Enemy>();

    public static void printEnemyStats(int index) {
        System.out.println("\nThe " + createEnemy.get(index).name + " does " + createEnemy.get(index).damage + " damage," + " has " + createEnemy.get(index).health +
                " health, " + "and has " + createEnemy.get(index).armor + " points of defense.");
    }
}
