package proxy;

public interface AtmState {

    void insertCard();
    void ejectCard();
    void insertPin(int pinEntered);
    void requestCash(int cashRequested);
}
