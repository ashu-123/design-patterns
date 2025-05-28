package mediator;

public class StockOffer {

    private int colleagueCode;
    private int stockShares = 0;
    private String stockSymbol;

    public StockOffer(int colleagueCode, int stockShares, String stockSymbol) {
        this.colleagueCode = colleagueCode;
        this.stockShares = stockShares;
        this.stockSymbol = stockSymbol;
    }

    public int getColleagueCode() {
        return colleagueCode;
    }

    public int getStockShares() {
        return stockShares;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }
}
