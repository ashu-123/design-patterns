package adapter;

import java.util.Random;

public class EnemyTank implements EnemyAttacker{

    Random generator = new Random();

    @Override
    public void fireWeapon() {
        int damageAmount = generator.nextInt(10) + 1;
        System.out.println("Damage caused = " + damageAmount);
    }

    @Override
    public void driveForward() {
        int movement = generator.nextInt(5) + 1;
        System.out.println("Enemy tank moves " + movement);
    }

    @Override
    public void assignDriver(String driverName) {
        System.out.println(driverName + " is driving the tank");
    }
}
