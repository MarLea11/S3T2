package N1EX3.Models;

import N1EX3.Models.Interfaces.ICoinConversion;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class CoinConversion implements ICoinConversion {

    @Override
    public double convertCoin(double quantity, String coin, String coinToConvert) {
        Map<String, Function<Double, Double>> conversionMap = new HashMap<>();
        conversionMap.put("EUR", coinToConvert.equalsIgnoreCase("USD") ? this::convertEURToUSD : coinToConvert.equalsIgnoreCase("GBP") ? this::convertEURToGBP : d -> d);
        conversionMap.put("USD", coinToConvert.equalsIgnoreCase("EUR") ? this::convertUSDToEUR : coinToConvert.equalsIgnoreCase("GBP") ? this::convertUSDToGBP : d -> d);
        conversionMap.put("GBP", coinToConvert.equalsIgnoreCase("EUR") ? this::convertGBPToEUR : coinToConvert.equalsIgnoreCase("USD") ? this::convertGBPToUSD : d -> d);

        return conversionMap.getOrDefault(coin, d -> {
            System.out.println("Invalid conversion.");
            return quantity;
        }).apply(quantity);
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
