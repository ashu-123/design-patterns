package state;

public class NoCard implements AtmState{

    private AtmMachine atmMachine;

    public NoCard(AtmMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Enter pin");
        this.atmMachine.setAtmState(this.atmMachine.getHasCardState());
    }

    @Override
    public void ejectCard() {
        System.out.println("Enter a card first");
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("Enter a card first");;
    }

    @Override
    public void requestCash(int cashRequested) {
        System.out.println("Enter a card first");
    }
}
