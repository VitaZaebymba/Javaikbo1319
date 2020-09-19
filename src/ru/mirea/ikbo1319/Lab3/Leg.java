package Lab3;

public class Leg {
    private int Health;
    public Leg(int health){Health=health;}


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
