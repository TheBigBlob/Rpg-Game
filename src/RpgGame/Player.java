package RpgGame;

import java.util.ArrayList;
import java.util.List;

public class Player{
    int health;
    int armor;
    int baseDamage;
    Weapon weapon;
    String name;

    Player(String name, int health, int armor, int baseDamage, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.armor = armor;
        this.baseDamage = baseDamage;
        this.weapon = weapon;
    }
    public static List<Player> createPlayer = new ArrayList<Player>();
    public static List<Object> inventory = new ArrayList<Object>();

    public static void printPlayerStats(int index) {
        System.out.println("\n" + createPlayer.get(index).name + " has " + createPlayer.get(index).health + " health, "
                + createPlayer.get(index).armor + " points of defense, and has a base damage of " + createPlayer.get(index).baseDamage + ".");
    }
}
