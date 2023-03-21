public class Backpack {

    private boolean hasPotion;
    private int potionCount;

    public Backpack() {
        hasPotion = false;
        potionCount = 0;
    }

    public boolean hasPotion() {
        return hasPotion;
    }

    public void addPotion() {
        hasPotion = true;
        potionCount++;
    }

    public void usePotion() {
        if (potionCount > 0) {
            potionCount--;
            if (potionCount == 0) {
                hasPotion = false;
            }
        }
    }

    public int totalPotion() {
        return potionCount;
    }

    public void displayBackpack() {
        System.out.println("Backpack contents:");
        if (hasPotion()) {
            System.out.println("- Potion (x" + totalPotion() + ")");
        } else {
            System.out.println("- Empty");
        }
    }
}
