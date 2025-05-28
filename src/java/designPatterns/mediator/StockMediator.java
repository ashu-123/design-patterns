package mediator;

import java.util.ArrayList;

public class StockMediator implements Mediator {

    private ArrayList<Colleague> colleagues;
    private ArrayList<StockOffer> stockBuyOffers;
    private ArrayList<StockOffer> stockSellOffers;

    private int colleagueCodes = 0;

    public StockMediator() {
        this.colleagues = new ArrayList<>();
        this.stockBuyOffers = new ArrayList<>();
        this.stockSellOffers = new ArrayList<>();
    }

    @Override
    public void saleOffer(String stock, int shares, int colleagueCode) {
        boolean stockSold = false;

        for (StockOffer stockOffer : stockBuyOffers) {
            if (stockOffer.getStockSymbol().equals(stock) && stockOffer.getStockShares() == shares) {
                System.out.println(shares + " shares of " + stock + " sold to colleague code " + colleagueCode);
                stockSold = true;
                stockBuyOffers.remove(stockOffer);
                break;
            }
        }

        if (!stockSold) {
            System.out.println(shares + " shares of " + stock + " added to inventory");
            StockOffer stockOffer = new StockOffer(colleagueCode, shares, stock);
            this.stockSellOffers.add(stockOffer);
        }
    }

    @Override
    public void buyOffer(String stock, int shares, int colleagueCode) {
        boolean stockBought = false;

        for (StockOffer stockOffer : stockSellOffers) {
            if (stockOffer.getStockSymbol().equals(stock) && stockOffer.getStockShares() == shares) {
                System.out.println(shares + " shares of " + stock + " bought by colleague code " + colleagueCode);
                stockBought = true;
                stockSellOffers.remove(stockOffer);
                break;
            }
        }

        if (!stockBought) {
            System.out.println(shares + " shares of " + stock + " added to inventory");
            StockOffer stockOffer = new StockOffer(colleagueCode, shares, stock);
            this.stockBuyOffers.add(stockOffer);
        }
    }

    @Override
    public void addColleague(Colleague colleague) {
        this.colleagues.add(colleague);
        colleagueCodes++;
        colleague.setColleagueCode(colleagueCodes);
    }

    public void getStockOfferings() {

        System.out.println("Stocks for sale : -");

        for (StockOffer stockOffer : stockSellOffers) {
            System.out.println(stockOffer.getStockShares() + " of " + stockOffer.getStockSymbol());
        }

        System.out.println("Stocks to buy : -");

        for (StockOffer stockOffer : stockBuyOffers) {
            System.out.println(stockOffer.getStockShares() + " of " + stockOffer.getStockSymbol());
        }
    }
}
