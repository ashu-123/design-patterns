package observer;

public class StocksObserver implements Observer{

    private static int OBERVER_ID_TRACKER = 1;
    private int observerId;
    private Subject publisher;

    private double ibmPrice;
    private double googPrice;
    private double aaplPrice;

    public StocksObserver(Subject publisher) {
        this.publisher = publisher;
        this.observerId = OBERVER_ID_TRACKER++;
        System.out.println("New observer: " + this.observerId);
        System.out.println("*******************");
        publisher.register(this);
    }

    @Override
    public void update(double ibmPrice, double googPrice, double aaplPrice) {
        this.ibmPrice = ibmPrice;
        this.googPrice = googPrice;
        this.aaplPrice = aaplPrice;
        System.out.println("Updated stock values for observer id: " + observerId);
        System.out.println("Ibm price: " + this.ibmPrice);
        System.out.println("Google price: " + this.googPrice);
        System.out.println("Apple price: " + this.aaplPrice);
        System.out.println("--------------------------------------------------");
    }
}
