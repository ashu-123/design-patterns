package adapter;

import java.util.Random;

public class EnemyRobot {

    private final Random generator = new Random();

    public void smashWithHands() {
        int damageAmount = generator.nextInt(10) + 1;
        System.out.println("Enemy robot causes " + damageAmount + " with it's hands");
    }

    public void walksForward() {
        int movement = generator.nextInt(5) + 1;
        System.out.println("Enemy robot walks forward " + movement);
    }

    public void reactToHuman(String driverName) {
        System.out.println("Enemy robot tramps on " + driverName);
    }

}
