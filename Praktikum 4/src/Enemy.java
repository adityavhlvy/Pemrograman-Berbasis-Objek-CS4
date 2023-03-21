import java.util.ArrayList;
import java.util.Random;

public class Enemy {

    private String name;
    private int health;
    private int damage;
    private static ArrayList<String> nameOptions = new ArrayList<String>() {{
        add("Slime");
        add("Goblin");
        add("Skeleton");
        add("Orc");
    }};

    public Enemy() {
        Random rand = new Random();
        this.name = nameOptions.get(rand.nextInt(nameOptions.size()));
        this.health = rand.nextInt(50) + 30; // generate random health between 50 and 80
        this.damage = rand.nextInt(10) + 5; // generate random damage between 10 and 15
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }
    
    public void attackPlayer(Player player) {
        player.decreaseHealth(damage);
        System.out.println("Player health: " + player.getHealth());
    }

    public void decreaseHealth(int damage) {
        health -= damage;
    }
}
