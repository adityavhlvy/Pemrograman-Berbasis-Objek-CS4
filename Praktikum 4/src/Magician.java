public class Magician extends Player {
    protected String weapon;
    protected String armor;
    protected String skill1;
    protected String skill2;

    public Magician(String username, String password, String role, int health, String weapon, String armor,
            String skill1,
            String skill2) {
        super(username, password, role, 100, "Staff", "Robe", "Snow Storm", "Fire Breath");
        this.playerBackpack = new Backpack();
    }

    public void increaseHealth(int healthBonus) {
        health = baseHealth + healthBonus;
    }

    public void decreaseHealth(int damage) {
        health -= damage;
    }

    public void attack(Enemy enemy) {
        enemy.decreaseHealth(damage);
        System.out.println("Enemy health: " + enemy.getHealth());
    }
}
