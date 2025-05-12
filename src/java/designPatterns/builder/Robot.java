package builder;

public class Robot implements RobotPlan{

    private String robotHead;
    private String robotTorso;
    private String robotArms;
    private String robotLegs;

    public String getRobotHead() { return this.robotHead; }

    public String getRobotTorso() { return this.robotTorso; }

    public String getRobotArms() { return this.robotArms; }

    public String getRobotLegs() { return this.robotLegs; }

    @Override
    public void setRobotHead(String robotHead) {
        this.robotHead = robotHead;
    }

    @Override
    public void setRobotTorso(String robotTorso) {
        this.robotTorso = robotTorso;
    }

    @Override
    public void setRobotArms(String robotArms) {
        this.robotArms = robotArms;
    }

    @Override
    public void setRobotLegs(String robotLegs) {
        this.robotLegs = robotLegs;
    }
}
