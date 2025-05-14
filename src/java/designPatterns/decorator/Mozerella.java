package decorator;

public class Mozerella extends ToppingDecorator{
    public Mozerella(Pizza tempPizza) {
        super(tempPizza);

        System.out.println("Adding dough");
        System.out.println("Adding mozzarella");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Mozzarella";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.50;
    }
}
