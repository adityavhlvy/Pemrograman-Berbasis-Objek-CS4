public class Fighter extends Player {
    protected String weapon;
    protected String armor;
    protected String skill1;
    protected String skill2;

    public Fighter(String username, String password, String role, int health, String weapon, String armor,
            String skill1,
            String skill2) {
        super(username, password, role, 100, "Longsword", "Plate Armor", "Mortal Rage", "Stone Wall");
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
