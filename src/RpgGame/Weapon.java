package RpgGame;

import java.util.ArrayList;
import java.util.List;

public class Weapon {
    String name;
    int damage;
    int durability;



    Weapon(String name, int damage, int durability) {
        this.name = name;
        this.damage = damage;
        this.durability = durability;
    }

    public static List<Weapon> createWeapon = new ArrayList<Weapon>();

    public static void printWeaponStats(int index) {
        System.out.println("\n" + createWeapon.get(index).name + " has " + createWeapon.get(index).durability + " durability and does " + createWeapon.get(index).damage + " damage.");
    }
}
