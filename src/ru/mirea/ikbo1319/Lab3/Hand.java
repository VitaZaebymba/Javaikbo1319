package Lab3;

public class Hand {
    private int Health;
    public Hand(int health){Health=health;}

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }
    @Override
    public String toString() {
        return Health+"/100";
    }
}
