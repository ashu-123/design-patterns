package interpreter;

public class ConversionContext {

    private String conversionQues = "";
    private String conversionResponse = "";
    private String fromConversion = "";
    private String toConversion = "";

    private double quantity;

    String[] partsOfQues;

    public String getConversionQues() {
        return conversionQues;
    }

    public String getConversionResponse() {
        return conversionResponse;
    }

    public String getFromConversion() {
        return fromConversion;
    }

    public String getToConversion() {
        return toConversion;
    }

    public double getQuantity() {
        return quantity;
    }

    public ConversionContext(String input) {
        conversionQues = input;
        partsOfQues = getInput().split(" ");
        fromConversion = getCapitalized(partsOfQues[1]);
        toConversion = getLowerCase(partsOfQues[3]);
        quantity = Double.valueOf(partsOfQues[0]);
        conversionResponse = partsOfQues[0] + " " + partsOfQues[1] + " equals ";
    }

    public String getInput() {
        return conversionQues;
    }

    public String getCapitalized(String wordToCapitalize) {
        wordToCapitalize = wordToCapitalize.toLowerCase();
        wordToCapitalize = Character.toUpperCase(wordToCapitalize.charAt(0)) + wordToCapitalize.substring(1);

        int len = wordToCapitalize.length();
        if (!wordToCapitalize.endsWith("s")) {
            wordToCapitalize = new StringBuffer(wordToCapitalize).insert(len, 's').toString();
        }

        return wordToCapitalize;
    }

    public String getLowerCase(String wordToLowerCase) {
        return wordToLowerCase.toLowerCase();
    }

}
