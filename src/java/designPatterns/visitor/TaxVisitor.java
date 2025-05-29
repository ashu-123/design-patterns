package visitor;

import java.text.DecimalFormat;

public class TaxVisitor implements Visitor{

    DecimalFormat decimalFormat = new DecimalFormat("#.##");

    public TaxVisitor() { }
    @Override
    public double visit(Liquor liquor) {
        System.out.println("Liquor item : Price with tax");
        return Double.parseDouble(decimalFormat.format(liquor.getPrice()*0.18)) + liquor.getPrice();
    }

    @Override
    public double visit(Tobacco tobacco) {
        System.out.println("Tobacco item : Price with tax");
        return Double.parseDouble(decimalFormat.format(tobacco.getPrice()*0.30)) + tobacco.getPrice();
    }

    @Override
    public double visit(Necessity necessity) {
        System.out.println("Necessity item : Price with tax");
        return Double.parseDouble(decimalFormat.format(necessity.getPrice()*0)) + necessity.getPrice();
    }
}
