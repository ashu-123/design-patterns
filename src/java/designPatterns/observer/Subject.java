package observer;

public interface Subject {

    public void register(Observer addObserver);
    public void unregister(Observer deleteObserver);
    public void notifyObserver();

    public void setIbmPrice(double ibmPrice);
    public void setGoogPrice(double googPrice);
    public void setAaplPrice(double applPrice);
}
