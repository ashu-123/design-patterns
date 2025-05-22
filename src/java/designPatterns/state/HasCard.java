package state;

public class HasCard implements AtmState{

    private AtmMachine atmMachine;

    public HasCard(AtmMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Can't enter more than one card");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card Ejected");
        this.atmMachine.setAtmState(this.atmMachine.getNoCardState());
    }

    @Override
    public void insertPin(int pinEntered) {
        if(pinEntered==1234) {
            System.out.println("Correct Pin Entered");
            this.atmMachine.correctPinEntered = true;
            this.atmMachine.setAtmState(this.atmMachine.getHasCorrectPin());
        }
        else {
            System.out.println("Wrong Pin");
            this.atmMachine.correctPinEntered = false;
            System.out.println("Card ejected");
            this.atmMachine.setAtmState(this.atmMachine.getNoCardState());
        }
    }

    @Override
    public void requestCash(int cashRequested) {
        System.out.println("Enter Pin first");
    }
}
