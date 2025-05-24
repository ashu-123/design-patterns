package proxy;

public class HasPin implements AtmState {

    private AtmMachine atmMachine;

    public HasPin(AtmMachine atmMachine) {
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
        System.out.println("Already entered correct pin");
    }

    @Override
    public void requestCash(int cashRequested) {
        if(cashRequested>this.atmMachine.cashInMachine) {
            System.out.println("Insufficient cash");
            System.out.println("Card ejected");
            this.atmMachine.setAtmState(this.atmMachine.getNoCardState());
        }
        else {
            System.out.println("Balance amount: " + (this.atmMachine.cashInMachine - cashRequested));
            this.atmMachine.setCashInMachine(this.atmMachine.cashInMachine-cashRequested);

            System.out.println("Card ejected");
            this.atmMachine.setAtmState(this.atmMachine.getNoCardState());

            if(this.atmMachine.cashInMachine<=0) {
                this.atmMachine.setAtmState(this.atmMachine.getAtmOutOfMoney());
            }
        }
    }
}
