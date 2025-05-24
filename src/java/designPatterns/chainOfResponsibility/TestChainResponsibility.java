package chainOfResponsibility;

public class TestChainResponsibility {

    public static void main(String[] args) {

        Chain addNumbers = new AddNumbers();
        Chain subtractNumbers = new SubtractNumbers();
        Chain multiplyNumbers = new MultiplyNumbers();
        Chain divideNumbers = new DivideNumbers();

        addNumbers.setNextChain(subtractNumbers);
        subtractNumbers.setNextChain(multiplyNumbers);
        multiplyNumbers.setNextChain(divideNumbers);

        Numbers request = new Numbers(4, 2, "pow");
        addNumbers.calculate(request);
    }
}
