package Lab3;

public class Head {
    private int Health;
    public Head(int health){Health=health;}

    public void setHealth(int health) {
        Health = health;
    }

    public int getHealth() {
        return Health;
    }
    @Override
    public String toString() {
        return Health+"/100";
    }
}
