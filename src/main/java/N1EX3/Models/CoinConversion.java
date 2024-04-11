package N1EX3.Models;

import N1EX3.Models.Interfaces.ICoinConversion;

public class CoinConversion implements ICoinConversion {

    @Override
    public double convertCoin(double quantity, String coin, String coinToConvert) {
        double coinConvertedValue = quantity;

        switch(coin) {
            case "EUR":
                if(coinToConvert.equalsIgnoreCase("USD")) {
                    coinConvertedValue = convertEURToUSD(quantity);
                } else if (coinToConvert.equalsIgnoreCase("GBP")) {
                    coinConvertedValue = convertEURToGBP(quantity);
                } else {
                    coinConvertedValue = quantity;
                }
                break;
            case "USD":
                if(coinToConvert.equalsIgnoreCase("EUR")) {
                    coinConvertedValue = convertUSDToEUR(quantity);
                } else if (coinToConvert.equalsIgnoreCase("GBP")) {
                    coinConvertedValue = convertUSDToGBP(quantity);
                } else {
                    coinConvertedValue = quantity;
                }
                break;
            case "GBP":
                if(coinToConvert.equalsIgnoreCase("EUR")) {
                    coinConvertedValue = convertGBPToEUR(quantity);
                } else if (coinToConvert.equalsIgnoreCase("USD")) {
                    coinConvertedValue = convertGBPToUSD(quantity);
                } else {
                    coinConvertedValue = quantity;
                }
                break;
            default:
                System.out.println("Invalid conversion.");
                break;
        }
        return coinConvertedValue;
    }

    public double convertEURToUSD(double quantity) {
        return quantity/0.9;
    }

    public double convertEURToGBP(double quantity) {
        return quantity/1.1;
    }

    public double convertUSDToEUR(double quantity) {
        return quantity/1.1;
    }

    public double convertUSDToGBP(double quantity) {
        return quantity/1.08;
    }

    public double convertGBPToEUR(double quantity) {
        return quantity/1.5;
    }

    public double convertGBPToUSD(double quantity) {
        return quantity/1.3;
    }

}
