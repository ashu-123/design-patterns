package builder;

public class RobotBuilderTest {

    public static void main(String[] args) {

        RobotBuilder robotBuilder = new OldRobotBuilder();
        RobotEngineer robotEngineer = new RobotEngineer(robotBuilder);

        robotEngineer.makeRobot();

        Robot firstRobot = robotEngineer.getRobot();
        System.out.println("Robot Built -> ");

        System.out.println("Robot Head: " + firstRobot.getRobotHead());
        System.out.println("Robot Torso: " + firstRobot.getRobotTorso());
        System.out.println("Robot Arms: " + firstRobot.getRobotArms());
        System.out.println("Robot Legs: " + firstRobot.getRobotLegs());
    }

}
