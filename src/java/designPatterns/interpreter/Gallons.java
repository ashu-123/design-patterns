package interpreter;

public class Gallons extends Expression {

    public Gallons() { }

    @Override
    public String gallons(double quantity) {
        return String.valueOf(quantity);
    }

    @Override
    public String quarts(double quanity) {
        return String.valueOf(quanity * 4);
    }

    @Override
    public String pints(double quanity) {
        return String.valueOf(quanity * 8);
    }

    @Override
    public String cups(double quanity) {
        return String.valueOf(quanity * 16);
    }

    @Override
    public String tableSpoons(double quanity) {
        return String.valueOf(quanity * 256);
    }
}
