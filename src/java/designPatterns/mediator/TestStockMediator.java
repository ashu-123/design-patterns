package mediator;

public class TestStockMediator {

    public static void main(String[] args) {

        StockMediator stockMediator = new StockMediator();
        Colleague gormanSlacks = new GormanSlacks(stockMediator);
        Colleague jtPoorman = new JTPoorman(stockMediator);
        stockMediator.addColleague(gormanSlacks);
        stockMediator.addColleague(jtPoorman);
        gormanSlacks.saleOffer("MSFT", 100);
        gormanSlacks.saleOffer("GOOG", 50);

        jtPoorman.buyOffer("MSFT", 100);
        jtPoorman.saleOffer("NRG", 10);

        gormanSlacks.buyOffer("NRG", 10);

        stockMediator.getStockOfferings();
    }
}
