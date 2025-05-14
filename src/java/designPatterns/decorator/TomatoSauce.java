package decorator;

public class TomatoSauce extends ToppingDecorator{

    public TomatoSauce(Pizza tempPizza) {
        super(tempPizza);

        System.out.println("Adding sauce");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", tomato sauce";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.35;
    }
}
