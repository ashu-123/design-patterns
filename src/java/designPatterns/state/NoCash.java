package state;

public class NoCash implements AtmState{

    private AtmMachine atmMachine;

    public NoCash(AtmMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("No money");
    }

    @Override
    public void ejectCard() {
        System.out.println("No money");
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("No money");
    }

    @Override
    public void requestCash(int cashRequested) {
        System.out.println("No money");
    }
}
