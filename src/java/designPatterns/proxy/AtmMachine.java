package proxy;


public class AtmMachine implements GetAtmData{

    AtmState hasCard;
    AtmState noCard;
    AtmState hasCorrectPin;
    AtmState atmOutOfMoney;

    AtmState atmState;

    int cashInMachine = 2000;
    boolean correctPinEntered = false;

    public AtmMachine() {
        this.hasCard = new HasCard(this);
        this.noCard = new NoCard(this);
        this.hasCorrectPin = new HasPin(this);
        this.atmOutOfMoney = new NoCash(this);

        this.atmState = noCard;
        if(cashInMachine<0) this.atmState = atmOutOfMoney;
    }

    public void setAtmState(AtmState atmState) {
        this.atmState = atmState;
    }

    public void setCashInMachine(int cashInMachine) {
        this.cashInMachine = cashInMachine;
    }

    public void insertCard() { this.atmState.insertCard();}
    public void ejectCard() { this.atmState.ejectCard(); }

    public void requestCash(int amountRequested) { this.atmState.requestCash(amountRequested);}

    public void inserPin(int pinEntered) { this.atmState.insertPin(pinEntered);}

    public AtmState getHasCardState() { return this.hasCard; }
    public AtmState getNoCardState() { return this.noCard; }
    public AtmState getHasCorrectPin() { return this.hasCorrectPin; }
    public AtmState getAtmOutOfMoney() { return this.atmOutOfMoney; }

    @Override
    public AtmState getAtmState() {
        return this.atmState;
    }

    @Override
    public int getCashInMachine() {
        return this.cashInMachine;
    }
}
