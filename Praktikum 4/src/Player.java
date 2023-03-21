import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Player {
    protected String username, password;
    protected int baseHealth, health, damage;
    protected int enemiesDefeated = 0;
    protected int indexcur = 0;
    protected String weapon;
    protected String armor;
    protected String skill1;
    protected String skill2;
    protected String role;

    protected Backpack playerBackpack;

    Player activePlayer;

    Scanner playerData = new Scanner(System.in);
    Scanner optioScanner = new Scanner(System.in);

    ArrayList<String> playerName = new ArrayList<String>();
    ArrayList<String> playerPassword = new ArrayList<String>();
    ArrayList<String> playerRole = new ArrayList<String>();

    public Player(String username, String password, String role, int health, String weapon, String armor, String skill1,
            String skill2) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.health = 100;
        this.weapon = weapon;
        this.armor = armor;
        this.skill1 = skill1;
        this.skill2 = skill2;
        this.playerBackpack = new Backpack();
    }

    public int getHealth() {
        return health;
    }

    public int getBaseHealth() {
        return baseHealth;
    }

    public void increaseHealth(int healthBonus) {
        health = baseHealth + healthBonus;
    }

    public void decreaseHealth(int damage) {
        health -= damage;
    }

    public void attackEnemy(Enemy enemy) {
        Random randomDamage = new Random();
        damage = randomDamage.nextInt(20) + 10;
        enemy.decreaseHealth(damage);
        System.out.println("Enemy health: " + enemy.getHealth());
    }

    public int getEnemiesDefeated() {
        return enemiesDefeated;
    }

    public void register() {
        System.out.print("Enter username: ");
        username = playerData.nextLine();
        if (playerName.contains(username)) {
            System.out.println("Username is already taken.");
            return;
        }
        System.out.print("Enter password: ");
        password = playerData.nextLine();
        System.out.println("Choose your role:");
        System.out.println("1. Magician");
        System.out.println("2. Fighter");
        System.out.println("3. Normal Human");
        System.out.print("Input : ");
        int option = optioScanner.nextInt();

        switch (option) {
            case 1:
                role = "Magician";
                break;
            case 2:
                role = "Fighter";
                break;
            case 3:
                role = "Normal Human";
                break;
            default:
                role = "Normal Human";
        }
        playerName.add(username);
        playerPassword.add(password);
        playerRole.add(role);
        System.out.println("Registration successful!");
        System.out.println();
    }

    public boolean login() {
        System.out.print("Enter username: ");
        String username = playerData.nextLine();
        System.out.print("Enter password: ");
        String password = playerData.nextLine();
        indexcur = playerName.indexOf(username);
        if (indexcur != -1 && password.equals(playerPassword.get(indexcur))) {
            // player exists and password is correct
            System.out.println("Login successful!");
            System.out.println();
            return true;
        } else {
            System.out.println("Invalid username or password.");
            System.out.println();
            return false;
        }
    }

    public void dropLoot() {
        Random rand = new Random();
        double potionChance = 0.9;  
        double randomNumber = rand.nextDouble();
        if (randomNumber < potionChance) {
            activePlayer.playerBackpack.addPotion();
            System.out.println("The enemy dropped a potion!");
        } else {
            System.out.println("The enemy dropped nothing!");
        }
    }

    public void startAdventure() {
        if (playerRole.get(indexcur) == "Magician") {
            Magician magician = new Magician(playerName.get(indexcur), playerPassword.get(indexcur),
                    playerRole.get(indexcur), 100, "", "", "", "");
            activePlayer = magician;
            System.out.println("Status : Active player is magician");
            System.out.println();
        } else if (playerRole.get(indexcur) == "Fighter") {
            Fighter fighter = new Fighter(playerName.get(indexcur), playerPassword.get(indexcur),
                    playerRole.get(indexcur), 100, "", "", "", "");
            activePlayer = fighter;
            System.out.println("Status : Active player fighter");
            System.out.println();
        } else {
            Player human = new Player(playerName.get(indexcur), playerPassword.get(indexcur), playerRole.get(indexcur),
                    100, "Sword", "Chainmail", "Slash", "Pierce");
                    activePlayer = human;
            System.out.println("Status : Active player is normal human");
            System.out.println();
        }

        boolean running = true;
        System.out.println();
        System.out.println("Welcome to the adventure " + activePlayer.username + "!");
        System.out.println("You are a " + activePlayer.role + " from Far Away Kingdom");
        System.out.println("The monsters have spread throughout the kingdom");
        System.out.println("The kingdom has given you " + activePlayer.weapon + " as heirloom weapons and "
                + activePlayer.armor + " as heirloom armour");
        System.out.println("You start yout journey");
        while (running) {
            System.out.println("You are currently at the start of the path. What would you like to do?");
            System.out.println("1. Move forward");
            System.out.println("2. Check backpack");
            System.out.println("3. Display status");
            System.out.println("4. Retire");
            System.out.print("Input : ");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            System.out.println();
            switch (choice) {
                case 1:
                    Random rand = new Random();
                    double chanceGetEnemy = 0.6;
                    double randomEnemy = rand.nextDouble();
                    if (randomEnemy < chanceGetEnemy) {
                        Enemy enemy = new Enemy();
                        System.out.println("You move forward and encounter a " + enemy.getName() + "!");
                        System.out.println("Enemy Health : " + enemy.getHealth());
                        System.out.println("Enemy Damage : " + enemy.getDamage());
                        while (enemy.getHealth() > 0 && activePlayer.getHealth() > 0) {
                            System.out.println("What would you like to do?");
                            System.out.println("1. Attack");
                            System.out.println("2. Use potion");
                            System.out.println("3. Run away");
                            System.out.print("Input : ");
                            int action = input.nextInt();
                            System.out.println();
                            switch (action) {
                                case 1:
                                    System.out.println("1. " + activePlayer.skill1);
                                    System.out.println("2. " + activePlayer.skill2);
                                    System.out.println("Choose your skill!");
                                    System.out.print("Input : ");
                                    choice = input.nextInt();
                                    System.out.println();
                                    switch (choice) {
                                        case 1:
                                            System.out.println(activePlayer.username + " attack the " + enemy.getName()
                                                    + " with " + activePlayer.skill1);
                                            break;
                                        case 2:
                                            System.out.println(activePlayer.username + " attack the " + enemy.getName()
                                                    + " with " + activePlayer.skill2);
                                            break;
                                        default:
                                            System.out.println(activePlayer.username + " attack the " + enemy.getName()
                                                    + " with unrecognized skill");
                                    }
                                    activePlayer.attackEnemy(enemy);
                                    if (enemy.getHealth() > 0) {
                                        System.out.println("The " + enemy.getName() + " attacks you!");
                                        enemy.attackPlayer(activePlayer);
                                    }
                                    break;
                                case 2:
                                    if (activePlayer.playerBackpack.hasPotion()) {
                                        System.out.println("You drink a potion and regain some health!");
                                        activePlayer.increaseHealth(20);
                                        activePlayer.playerBackpack.usePotion();
                                    } else {
                                        System.out.println("You don't have any potions left!");
                                    }
                                    break;
                                case 3:
                                    System.out.println("You run away from the enemy!");
                                    break;
                                default:
                                    System.out.println("Invalid choice!");
                                    break;
                            }
                        }
                        if (enemy.getHealth() <= 0) {
                            System.out.println("You defeated the enemy");
                            enemiesDefeated++;
                            dropLoot();
                        } else {
                            System.out.println("You were defeated by the enemy. Game over!");
                            System.out.println("Enemies defeated : " + enemiesDefeated);
                            running = false;
                        }
                    } else {
                        System.out.println("You don't encounter enemies");
                        continue;
                    }

                case 2:
                    activePlayer.playerBackpack.displayBackpack();
                    break;
                case 3:
                    System.out.println("Status");
                    System.out.println("Name   : " + activePlayer.username);
                    System.out.println("Health : " + activePlayer.getHealth());
                    break;
                case 4:
                    System.out.println("You run away from adventure!");
                    System.out.println("Enemies defeated : " + enemiesDefeated);
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
                    activePlayer.startAdventure();
                    break;
            }
        }

    }
}
