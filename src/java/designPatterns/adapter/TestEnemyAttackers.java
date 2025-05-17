package adapter;

public class TestEnemyAttackers {

    public static void main(String[] args) {

        EnemyTank enemyTank = new EnemyTank();

        EnemyRobot enemyRobot = new EnemyRobot();

        EnemyAttacker enemyRobotAdapter = new EnemyRobotAdapter(enemyRobot);

        System.out.println("The enemy Robot");
        enemyRobot.reactToHuman("Paul");
        enemyRobot.walksForward();
        enemyRobot.smashWithHands();

        System.out.println("The enemy tank");
        enemyTank.assignDriver("Frank");
        enemyTank.driveForward();
        enemyTank.fireWeapon();

        System.out.println("The enemy Robot Adapter");
        enemyRobotAdapter.assignDriver("Mark");
        enemyRobotAdapter.driveForward();
        enemyRobotAdapter.fireWeapon();
    }
}
