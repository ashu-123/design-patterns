package proxy;

public class AtmProxy implements GetAtmData{

    @Override
    public AtmState getAtmState() {
        AtmMachine realAtmMachine = new AtmMachine();
        return realAtmMachine.getAtmState();
    }

    @Override
    public int getCashInMachine() {
        var realAtmMachine = new AtmMachine();
        return realAtmMachine.getCashInMachine();
    }
}
