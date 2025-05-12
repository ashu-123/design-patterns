package builder;

public class OldRobotBuilder implements RobotBuilder{

    public final Robot robot;

    public OldRobotBuilder() {
        this.robot = new Robot();
    }


    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Tin Head");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Tin Torso");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("Steel arms");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("Iron legs");
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }
}
