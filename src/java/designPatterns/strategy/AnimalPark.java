package strategy;

class AnimalPark {
    public static void main(String[] args) {
        Animal sparky = new Dog();
        Animal birdy = new Bird();

        System.out.println(sparky.tryToFly());
        System.out.println(birdy.tryToFly());

        sparky.setFlyingAbility(new ItFlys());
        System.out.println(sparky.tryToFly());
    }
}