package factory;

public abstract class EnemyShip {

    public String name;
    public double amtDamage;

    public String getName() {
        return name;
    }

    public EnemyShip setName(String name) {
        this.name = name;
        return this;
    }

    public double getAmtDamage() {
        return amtDamage;
    }

    public EnemyShip setAmtDamage(double amtDamage) {
        this.amtDamage = amtDamage;
        return this;
    }

    public void followHeroShip() {
        System.out.println(getName() + " is following hero ship");
    }

    public void displayEnemyShip() {
        System.out.println(getName() + " is on the screen");
    }

    public void shootEnemyShip() {
        System.out.println(getName() + " is attacking with " + getAmtDamage());
    }
}
