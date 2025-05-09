package strategy;

class Animal {

    public Flys flyingType;


    public String tryToFly() { return flyingType.fly(); }

    public void setFlyingAbility(Flys newFlyingType) {
        this.flyingType = newFlyingType;
    }

}