package RpgGame;

import java.util.Scanner;

import static RpgGame.Enemy.createEnemy;
import static RpgGame.Enemy.printEnemyStats;
import static RpgGame.Player.createPlayer;
import static RpgGame.Weapon.createWeapon;

public class GameInterface {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nStart Game: Yes or No?");

        String userInput = scanner.next();
        if (userInput.equalsIgnoreCase("Yes")) {
           GameInterface.runGame();
        }
    }
    //Guineapigs
    public static void runGame() {
        createEnemy.add(new Enemy("Slime", 10, 1, 0));
        createEnemy.add(new Enemy("Goblin", 5, 2, 1));
        createEnemy.add(new Enemy("Goblin Captain", 20, 5, 5));
        createEnemy.add(new Enemy("Goblin Warrior", 5, 5, 5));
        createEnemy.add(new Enemy("Goblin King", 50, 10, 10));

        createWeapon.add(new Weapon("Stick", 1, 5));
        createWeapon.add(new Weapon("Wooden Sword", 2, 10));
        createWeapon.add(new Weapon("Iron Broadsword", 5, 100));
        createWeapon.add(new Weapon("Sturdy Club", 3, 50));
        createWeapon.add(new Weapon("Glass Sword", 10, 5));

        createPlayer.add(new Player("Bob", 20, 0, 1, null));

        printEnemyStats(0);
        // Aspects needed, create a character, choose starting weapon and class, enter continue
    }
}
