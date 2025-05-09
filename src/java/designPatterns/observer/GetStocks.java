package observer;

public class GetStocks {
    public static void main(String[] args) {
        Subject stocksGrabber = new StocksGrabber();
        Observer observer1 = new StocksObserver(stocksGrabber);
        stocksGrabber.setIbmPrice(123.00);
        stocksGrabber.setGoogPrice(1223.00);
        stocksGrabber.setAaplPrice(12332.00);

        Observer observer2 = new StocksObserver(stocksGrabber);
        stocksGrabber.setIbmPrice(23.00);
        stocksGrabber.setGoogPrice(223.00);
        stocksGrabber.setAaplPrice(2332.00);
    }
}
