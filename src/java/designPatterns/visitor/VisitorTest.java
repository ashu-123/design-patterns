package visitor;

public class VisitorTest {

    public static void main(String[] args) {
        TaxVisitor taxVisitor = new TaxVisitor();
        TaxHolidayVisitor taxHolidayVisitor = new TaxHolidayVisitor();

        Necessity milk = new Necessity(20.00);
        Tobacco tobacco = new Tobacco(5.20);
        Liquor liquor = new Liquor(140.20);

        System.out.println(liquor.accept(taxVisitor));
        System.out.println(tobacco.accept(taxVisitor));
        System.out.println(milk.accept(taxVisitor));

        System.out.println("------------------------");

        System.out.println(liquor.accept(taxHolidayVisitor));
        System.out.println(tobacco.accept(taxHolidayVisitor));
        System.out.println(milk.accept(taxHolidayVisitor));
    }
}
